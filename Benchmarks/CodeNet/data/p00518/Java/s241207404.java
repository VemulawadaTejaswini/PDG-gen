import java.util.*;

public class Main {
    static final int MOD = 10007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        int[][] dp = new int[n + 1][8];
        dp[0][4] = 1;
        for (int i = 1; i <= n; i++) {
            int must;
            if (arr[i - 1] == 'J') {
                must = 4;
            } else if (arr[i - 1] == 'O') {
                must = 2;
            } else {
                must = 1;
            }
            for (int j = 1; j < 8; j++) {
                for (int k = 1; k < 8; k++) {
                    if ((k & must) == 0) {
                        continue;
                    }
                    if ((j & k) == 0) {
                        continue;
                    }
                    dp[i][k] += dp[i - 1][j];
                    dp[i][k] %= MOD;
                }
            }
        }
        int total = 0;
        for (int i = 1; i < 8; i++) {
            total += dp[n][i];
            total %= MOD;
        }
        System.out.println(total);
    }
}
