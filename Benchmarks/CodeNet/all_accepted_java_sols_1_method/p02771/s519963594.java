import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        final boolean kawaisou =
                (a == b && b != c) ||
                        (b == c && c != a) ||
                        (c == a && a != b);

        System.out.println(kawaisou ? "Yes" : "No");
    }
}