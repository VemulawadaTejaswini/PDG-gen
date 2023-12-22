import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int S = in.nextInt();

            long mod = (long) (1e9 + 7);

            long[] dp = new long[S + 1];
            dp[S] = 1;
            for (int sum = S; sum >= 0; sum--) {
                for (int add = 3; sum + add <= S; add++) {
                    if (dp[sum + add] <= 0) {
                        continue;
                    }
                    dp[sum] += dp[sum + add];
                    dp[sum] %= mod;
                }
            }

            System.out.println(dp[0]);
        }
    }
}
