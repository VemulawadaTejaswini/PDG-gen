import java.util.Scanner;

public class Main {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        int a = scan.nextInt();
        String op = scan.next();
        int b = scan.nextInt();
        if (op.equals("+")) {
            sum(a + b);
        } else if (op.equals("-")) {
            sum(a - b);
        } else if (op.equals("*")) {
            sum(a * b);
        } else if (op.equals("/")) {
            sum(a / b);
        } else {
            return;
        }
    }

    private static void sum(Integer sum) {
        System.out.println(sum.toString());
    }
}