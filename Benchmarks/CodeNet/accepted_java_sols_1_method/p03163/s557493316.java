import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] W = new int[n];
        long[] V = new long[n];
        for(int i = 0; i < n; i++) {
            W[i] = Integer.parseInt(sc.next());
            V[i] = Integer.parseInt(sc.next());
        }
        long[][] dp = new long[n + 10][w + 10];
        for(int i = 0; i < n ; i++) {
            for(int j = 0; j <= w; j++) {
                if(j - W[i] >= 0) {
                    dp[i + 1][j] =
                            Math.max(dp[i + 1][j], Math.max(dp[i][j - W[i]] + V[i], dp[i][j]));
                } else {
                    dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j]);
                }
            }
        }
        System.out.println(dp[n][w]);
    }
}
