import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int a = scan.nextInt();
            String op = scan.next();
            int b = scan.nextInt();

            if (op.equals("?")) {
                break;
            } else if (op.equals("+")) {                               
                out.println(a + b); 
            } else if (op.equals("-")) {
                out.println(a - b); 
            } else if (op.equals("*")) {
                out.println(a * b); 
            } else if (op.equals("/")) {
                out.println(a / b); 
            }
        }
    }   
}