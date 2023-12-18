import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int num1;
        int num2;
        String operation;

        Scanner input = new Scanner(System.in);
        while (true) {
            num1 = input.nextInt();
            //Scanner op = new Scanner(System.in);
            operation = input.next();

            num2 = input.nextInt();
            if (operation.equals("?")) {
                break;
            }

            if (operation.equals("+")) {
                System.out.println(num1 + num2);
            }
            if (operation.equals("-")) {
                System.out.println(num1 - num2);
            }
            if (operation.equals("*")) {
                System.out.println(num1 * num2);
            }
            if (operation.equals("/")) {
                System.out.println(num1 / num2);
            }
        }
    }
}
