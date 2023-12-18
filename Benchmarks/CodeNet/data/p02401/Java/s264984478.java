
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a,b = 0;
        String op = null;

        while (true) {

            a = sc.nextInt();
            op = sc.next();
            b = sc.nextInt();

            if ("?".equals(op)) {
                    break;
            } else if (a < 0 || b < 0 || a > 20000 || b > 20000) {
                System.err.println("Err!");
                break;
            }

            switch (op) {

            case "+":
                System.out.printf("%d%n", a + b);
                break;
            case "-":
                System.out.printf("%d%n", a - b);
                break;
            case "*":
                System.out.printf("%d%n", a * b);
                break;
            case "/":
                System.out.printf("%.0f%n",(double)(a / b));
                break;
            default:
                break;

            }

        }

    }

}
