import java.util.Scanner;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Scanner keyboard = new Scanner(System.in);
        String id;

        System.out.println("Enter what shape would you like to clone:" +
                "\n1 - Circle\n2 - Square\n3 - Rectangle");
        for (int i = 0; i < 10; i++) {
            do {
                id = keyboard.nextLine();
                switch (id) { //new arrow switch
                    case "1" -> {
                        Shape clone1 = ShapeCache.getShape("1");
                        System.out.println("Your cloned shape: " + clone1.getType() + " #" + clone1.hashCode());
                    }
                    case "2" -> {
                        Shape clone2 = ShapeCache.getShape("2");
                        System.out.println("Your cloned shape: " + clone2.getType() + " #" + clone2.hashCode());
                    }
                    case "3" -> {
                        Shape clone3 = ShapeCache.getShape("3");
                        System.out.println("Your cloned shape: " + clone3.getType() + " #" + clone3.hashCode());
                    }
                    default -> System.out.println("No match");
                }
            } while (!id.equals("1") && !id.equals("2") && !id.equals("3"));
        }
        System.out.println("You have already cloned 10 shapes. Stop! :0");
    }
}
