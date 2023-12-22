import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        // dp[j][k][s]は、x1,...,xj から k 枚選んで xi の合計を s にするような選び方の総数
        long[][][] dp = new long[n + 1][n + 1][n * a + 1];
        for (int j = 0; j <= n; j++) {
            for (int k = 0; k <= n; k++) {
                for (int s = 0; s <= n * a; s++) {
                    if (j == 0 && k == 0 && s == 0) {
                        dp[j][k][s] = 1;
                        continue;
                    }
                    if (j >= 1 && s < x[j - 1]) {
                        dp[j][k][s] = dp[j - 1][k][s];
                        continue;
                    }
                    if (j >= 1 && k >= 1 && s >= x[j - 1]) {
                        dp[j][k][s] = dp[j - 1][k][s] + dp[j - 1][k - 1][s - x[j - 1]];
                        continue;
                    }
                    dp[j][k][s] = 0;
                }
            }
        }

        long result = 0;
        for (int i = 1; i <= n; i++) {
            result += dp[n][i][i * a];
        }
        System.out.println(result);
    }

}