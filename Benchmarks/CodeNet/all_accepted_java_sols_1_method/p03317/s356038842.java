
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int k = scanner.nextInt();

        if (k >= n) {
            System.out.println(1);
        } else {
            System.out.println((n - k + k - 2) / (k - 1) + 1);
        }
    }
}
