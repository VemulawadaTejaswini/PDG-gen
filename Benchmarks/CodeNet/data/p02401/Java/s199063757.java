import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String op = input.next();
        int b = input.nextInt();
        
        while (!op.equals("?")) {
            if (op.equals("+")) {
                System.out.println(a + b);
            }
            else if (op.equals("-")) {
                System.out.println(a - b);
            }
            else if (op.equals("*")) {
                System.out.println(a * b);
            }
            else if (op.equals("/")) {
                System.out.println(a / b);
            }
            else {
                break;
            }
            
            a = input.nextInt();
            op = input.next();
            b = input.nextInt();
            
        }
    }
}
