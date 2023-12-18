import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int W = in.nextInt();
        int w[] = new int[N];
        int v[] = new int[N];
        for(int i=0;i<N;i++){
            w[i] = in.nextInt();
            v[i] = in.nextInt();
        }
        in.close();
        long dp[][] = new long[N+1][W+1];
        for(int i=0;i<W+1;i++){
            dp[N][i] = 0;
        }
        for(int i=N-1;i>=0;i--){
            for(int j=0;j<W+1;j++){
                if(j < w[i]){
                    dp[i][j] = dp[i+1][j];
                }
                else{
                    dp[i][j] = Math.max(dp[i+1][j],dp[i+1][j-w[i]]+v[i]);
                }
            }
        }
        System.out.println(dp[0][W]);
    }
}