import java.util.*;
import java.io.*;

public class Main {
    public static int[] wt;
    public static int[] val;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        wt = new int[N];
        val = new int[N];
        int maxVals = 0;
        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            wt[i] = Integer.parseInt(st.nextToken());
            val[i] = Integer.parseInt(st.nextToken());
            maxVals+=val[i];
        }

        long[][] dp = new long[N+1][maxVals+1];
        for (int i=0; i<=maxVals; i++){
            dp[0][i] = Integer.MAX_VALUE;
        }
        dp[0][0]=0;

        for (int i=1; i<=N; i++){
            for (int j = 1; j <= maxVals; j++) {
                dp[i][j]=dp[i-1][j];
                if(j-val[i-1]>=0){
                    dp[i][j] = Math.min(dp[i][j], wt[i-1]+dp[i-1][j-val[i-1]]);
                }
            }
        }
        long ans=0;
        for (int i = 0; i<=maxVals; i++){
            if(dp[N][i]<=C)
                ans=i;
        }
        System.out.println(ans);
    }
}
