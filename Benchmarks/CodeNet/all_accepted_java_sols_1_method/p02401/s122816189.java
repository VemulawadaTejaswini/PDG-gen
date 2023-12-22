import java.util.Scanner;

/**
 *
 * @author lenovo
 */
    public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            int a = scanner.nextInt();
            String op = scanner.next();
            char ch = op.charAt(0);
            int b = scanner.nextInt();
            switch (ch) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    if (b == 0) {
                        //  System.out.println("?¢??????°?????¶??????????????????!");
                        break;
                    } else {
                        System.out.println(a / b);
                        break;
                    }
                 default:
                    return;
            }
        }
    }
}