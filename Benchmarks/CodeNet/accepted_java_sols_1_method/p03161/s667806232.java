import java.util.Scanner;

public class Main {
    static public void main(String args[]){
        final int INF = (int)1e10;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] h = new long[n];
        long[] dp = new long[n];
        for(int i = 0; i < n ; i++){
            h[i] = sc.nextLong();
            dp[i] = INF;
        }
        dp[0] = 0;

        for(int i = 0 ; i < n-1 ; i++){
            for(int j = 1 ; j <= k ; j++) {
                if (i + j < n) {
                    dp[i + j] = Math.min(dp[i + j], dp[i] + Math.abs(h[i + j] - h[i]));
                }
            }
        }

        System.out.println(dp[n-1]);
    }
}
