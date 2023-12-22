import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] s = new int[N];
            for (int i = 0; i < N; i++) {
                s[i] = in.nextInt();
            }

            int[] dp = new int[10101];
            Arrays.fill(dp, -1);
            dp[0] = 0;
            for (int si = 0; si < N; si++) {
                for (int i = 10000; i >= 0; i--) {
                    if (dp[i] < 0) {
                        continue;
                    }
                    dp[i + s[si]] = 0;
                }
            }

            int max = 0;
            for (int i = 0; i < dp.length; i++) {
                if (dp[i] < 0) {
                    continue;
                }
                max = Math.max(max, i % 10 == 0 ? 0 : i);
            }

            System.out.println(max);
        }
    }
}
