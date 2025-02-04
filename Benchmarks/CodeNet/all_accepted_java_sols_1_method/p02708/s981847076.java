
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    private static final long MOD = 1_000_000_007;

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int k = scanner.nextInt();

        long max = LongStream.rangeClosed(n - k + 1, n).sum();
        long min = LongStream.range(0, k).sum();

        long sum = max - min + 1;
        sum %= MOD;
        for (int i = k; i <= n; i++) {
            max += n - i;
            min += i;
            sum += max - min + 1;
            sum %= MOD;
        }
        System.out.println(sum);
    }
}
