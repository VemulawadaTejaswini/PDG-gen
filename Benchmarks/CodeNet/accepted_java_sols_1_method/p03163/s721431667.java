import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];

        long[][] dp = new long[N+1][W+1];
        for (int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        for (int i = 1; i <= N ; i++) {//item
            for (int j = 1; j <=W ; j++) {
                if(j-w[i-1]>=0)
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-w[i-1]] +v[i-1]);
                else
                    dp[i][j] = dp[i-1][j];
            }
        }

        System.out.println(dp[N][W]);

    }

}
