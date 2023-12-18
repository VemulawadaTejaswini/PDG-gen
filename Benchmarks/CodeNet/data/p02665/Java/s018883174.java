
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class C {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt() + 1;
        in.nextLine();
        final int[] leaves = new int[n];
        for (int i = 0; i < n; i++) {
            leaves[i] = in.nextInt();
        }
        final long[] dp = new long[n];
        for (int i = 0; i < n; i++) {
            dp[i] = i == 0 ? 1 : (2 * (dp[i - 1] - leaves[i - 1]));
            if (dp[i] <= 0) {
                System.out.println(-1);
                return;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = i == n - 1 ? Math.min(dp[i], leaves[i]) : Math.min(dp[i], dp[i + 1] + leaves[i]);
            double pow = Math.pow(2, i);
            if (Double.compare(pow, Long.MAX_VALUE) < 0) {
                dp[i] = Math.min(dp[i], (long) pow);
            }
        }
        long res = 0;
        for (long num : dp) {
            res += num;
        }
        System.out.println(res);
    }
}
