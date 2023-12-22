import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        double[] heads = new double[N];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++){
            heads[i] = Double.parseDouble(st.nextToken());
        }

        double[][] dp = new double[N+1][N+1];
        dp[0][0] = 1;

        for (int i=1; i<=N; i++){
            dp[i][0]=dp[i-1][0]*(1-heads[i-1]);
        }
        for (int i=1; i<=N; i++){
            for (int j=1; j<=N; j++){

                dp[i][j] = dp[i-1][j-1]*heads[i-1]+dp[i-1][j]*(1-heads[i-1]);

            }
        }
        double ans=0;
        for (int i=N/2+1; i<=N; i++){
            ans+=dp[N][i];
        }
        System.out.println(ans);
    }
}
