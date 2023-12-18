import java.util.Scanner;

public class Main {
    static public void main(String args[]){
        final long INF = (long)1e10;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] h = new long[n];
        long[] dp = new long[n];
        for(int i = 0; i < n ; i++){
            h[i] = sc.nextLong();
            dp[i] = INF;
        }
        dp[0] = 0;

        for(int i = 0 ; i < n-1 ; i++){
            dp[i+1] = Math.min(dp[i+1], dp[i]+Math.abs(h[i+1]-h[i]));
            if(i+2 < n){
                dp[i+2] = Math.min(dp[i+2], dp[i]+Math.abs(h[i+2]-h[i]));
            }
        }

        System.out.println(dp[n-1]);
    }
}
