import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            String op = scanner.next();
            int b = scanner.nextInt();
            if (op.equals("?")) {
                break;
            }
            int x = 0;
            if (op.equals("+")) {
                x = a + b;
            } else if (op.equals("-")) {
                x = a - b;
            } else if (op.equals("*")) {
                x = a * b;
            } else {
                x = a / b;
            }
            System.out.println(x);

        }
    }
}

