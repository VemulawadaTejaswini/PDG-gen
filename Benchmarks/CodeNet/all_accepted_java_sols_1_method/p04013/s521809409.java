import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int[] x = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            x[i] = sc.nextInt();
        }
        long[][][] dp = new long[n + 1][n + 1][3000];
        // dp[i][j][k] : iコマででj子使ってkを作る個数
        dp[0][0][0] = 1;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                for (int k = 0; k < 3000; k++) {
                    if (j == 0) {
                        dp[i][j][0] = 1;
                    } else if (k - x[i] >= 0) {
                        dp[i][j][k] = dp[i - 1][j][k] + dp[i - 1][j - 1][k - x[i]];
                    } else {
                        dp[i][j][k] = dp[i - 1][j][k];
                    }

                }
            }
        }
        long ans = 0;
        for (int i = 1; i < n + 1; i++) {
            ans += dp[n][i][i * a];
        }

        System.out.println(ans);
        sc.close();
    }
}
