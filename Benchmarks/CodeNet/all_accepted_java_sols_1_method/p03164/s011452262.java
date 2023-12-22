import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];
        int V = 0;
        for (int i = 0 ; i < N ; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
            V += v[i];
        }
        long[][] dp = new long[N+1][V+1];

        for (int j = 1 ; j <= V; j++) {
            dp[0][j] = 100000000000l;
        }
        for (int i = 0 ; i < N ; i++) {
            for (int j = 0 ; j <= V; j++) {
                if (j < v[i]) {
                    dp[i + 1][j] = dp[i][j];
                } else {
                    dp[i + 1][j] = Math.min(dp[i][j], dp[i][j - v[i]] + w[i]);
                }
            }
        }
        int res = 0;
        for (int i = 0 ; i <= V ; i++) {
            if (dp[N][i] <= W) {
                res = i;
            }
        }
        System.out.println(res);

    }

}
