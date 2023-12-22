
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        String T = scanner.next();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String U = scanner.next();

        if (U.equals(S)) A -= 1;
        if (U.equals(T)) B -= 1;

        System.out.printf("%d %d%n", A, B);
    }
}
