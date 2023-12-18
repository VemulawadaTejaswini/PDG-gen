import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        long[] z = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextLong();
            y[i] = scanner.nextLong();
            z[i] = scanner.nextLong();
        }

        long sum1 = IntStream.range(0, n).mapToLong(i -> x[i] + y[i] + z[i]).sorted().skip(n - m).sum();
        long sum2 = IntStream.range(0, n).mapToLong(i -> x[i] + y[i] - z[i]).sorted().skip(n - m).sum();
        long sum3 = IntStream.range(0, n).mapToLong(i -> x[i] - y[i] + z[i]).sorted().skip(n - m).sum();
        long sum4 = IntStream.range(0, n).mapToLong(i -> x[i] - y[i] - z[i]).sorted().skip(n - m).sum();
        long sum5 = IntStream.range(0, n).mapToLong(i -> -x[i] + y[i] + z[i]).sorted().skip(n - m).sum();
        long sum6 = IntStream.range(0, n).mapToLong(i -> -x[i] + y[i] - z[i]).sorted().skip(n - m).sum();
        long sum7 = IntStream.range(0, n).mapToLong(i -> -x[i] - y[i] + z[i]).sorted().skip(n - m).sum();
        long sum8 = IntStream.range(0, n).mapToLong(i -> -x[i] - y[i] - z[i]).sorted().skip(n - m).sum();

        System.out.println(Math.max(sum1, Math.max(sum2, Math.max(sum3, Math.max(sum4, Math.max(sum5, Math.max(sum6, Math.max(sum7, sum8))))))));
    }
}