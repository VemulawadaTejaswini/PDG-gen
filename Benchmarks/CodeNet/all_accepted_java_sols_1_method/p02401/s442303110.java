import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String a = scan.next();
            int a_number = Integer.parseInt(a);
            String op = scan.next();
            String b = scan.next();
            int b_number = Integer.parseInt(b);
            if (op.equals("+")) {
                System.out.println(a_number + b_number);
            } else if (op.equals("-")) {
                System.out.println(a_number - b_number);
            } else if (op.equals("*")) {
                System.out.println(a_number * b_number);
            } else if (op.equals("/")) {
                System.out.println(a_number / b_number);
            } else if (op.equals("?")) {
                break;
            }
        }
        
        scan.close();
    }
    
}
