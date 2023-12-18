import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            String op = sc.next();
            int y = sc.nextInt();
            if (op.equals("+")) {
                System.out.println((x + y));
            } else if (op.equals("-")) {
                System.out.println((x - y));
            } else if (op.equals("*")) {
                System.out.println((x * y));
            } else if (op.equals("/")) {
                System.out.println((x / y));
            } else {
                break;
            }
        }
    }
}
