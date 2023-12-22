import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] weight = new int[N];
        long[] value = new long[N];
        for(int n=0; n<N; n++){
            weight[n] = sc.nextInt();
            value[n]= sc.nextLong();
        }

        long[][] dp = new long[N+1][W+1];
        //dp[n][w] : choose items from first 'n' items, and the total weight is leq than w
        Arrays.fill(dp[0], 0);
        for(int n=1;n<=N;n++) for(int w=0; w<=W; w++){
            dp[n][w] = Math.max(dp[n-1][w], (w>0 ? dp[n][w-1] : 0));
            if(weight[n-1] <= w ) dp[n][w] = Math.max(dp[n][w], dp[n-1][w-weight[n-1]]+value[n-1]);

        }
        //for(int n=0; n<=N; n++) System.err.println(Arrays.toString(dp[n]));
        System.out.println(dp[N][W]);
    }
}
