import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String op = "+";
        while (op != "?") {
            int a = scanner.nextInt();
            String ope = scanner.next();
            int b = scanner.nextInt();
            
            op=ope;
            
            
            if (op == "+") {
                int c = a + b;
                System.out.println(c);
            }
            if (op == "-") {
                int c = a - b;
                System.out.println(c);
            }
            if (op == "*") {
                int c = a * b;
                System.out.println(c);
            }
            if (op == "/") {
                int c = a / b;
                System.out.println(c);
            }
            if (op == "?") {
                break;
            }
        }
    }
}