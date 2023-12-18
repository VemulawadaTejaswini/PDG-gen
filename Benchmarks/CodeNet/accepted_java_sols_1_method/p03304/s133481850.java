import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        double n = scanner.nextInt(), m = scanner.nextInt() - 1, d = n - scanner.nextInt();
        System.out.println(m / n * (d == n ? 1 : 2 * d / n));
    }
}