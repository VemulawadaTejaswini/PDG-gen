import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        long[] dp = new long[30];
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) break;
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    dp[i] = 1;
                } else if (i == 1) {
                    dp[i] = 2;
                } else if (i == 2) {
                    dp[i] = 4;
                } else {
                    dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
                }
            }
            System.out.println(dp[n-1]/3650 + 1);
        }
    }
}