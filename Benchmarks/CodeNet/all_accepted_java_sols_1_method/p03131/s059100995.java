import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        long k = scanner.nextInt();
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        System.out.println(k > a && b - a > 2 ? a + (k - a - 1) % 2 + (k - (k - a - 1) % 2 - a + 1) / 2 * (b - a) : k + 1);
    }
}