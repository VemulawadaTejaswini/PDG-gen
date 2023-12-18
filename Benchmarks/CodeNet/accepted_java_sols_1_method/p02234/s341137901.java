import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for(int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
            sc.nextInt();
        }
        a[n - 1] = sc.nextInt();
        a[n] = sc.nextInt();

        int[][] dp = new int[n][n + 1]; //i番目から(j - 1)番目まで

        // compute
        for(int i = 2; i <= n; i++) {
            for(int j = 0; j <= n - i; j++) {// j番目から(j + i - 1)番目まで
                dp[j][j + i] = Integer.MAX_VALUE;
                for(int k = j + 1; k < j + i; k++) {
                    int tmp = dp[j][k] + dp[k][j + i] + a[j] * a[k] * a[j + i];
                    dp[j][j + i] = Math.min(dp[j][j + i], tmp);
                }
            }
        }

        System.out.println(dp[0][n]);

        sc.close();
    }
}

