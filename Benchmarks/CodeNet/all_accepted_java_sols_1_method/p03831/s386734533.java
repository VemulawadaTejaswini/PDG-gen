import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long cost = 0;
        long[] x = new long[n];
        x[0] = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            x[i] = scanner.nextInt();
            cost += Math.min(a * (x[i] - x[i - 1]), b);
        }
        System.out.println(cost);
    }
}