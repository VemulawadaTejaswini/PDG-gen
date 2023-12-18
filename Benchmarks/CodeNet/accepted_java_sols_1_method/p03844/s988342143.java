import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        String op = scanner.next();
        int B = Integer.parseInt(scanner.next());
        scanner.close();

        if (op.equals("+")) {
            System.out.println(A + B);
        }

        if (op.equals("-")) {
            System.out.println(A - B);
        }
    }
}
