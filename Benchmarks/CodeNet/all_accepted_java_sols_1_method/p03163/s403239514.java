import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] wt = new int[N];
        int[] val = new int[N];

        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            wt[i] = Integer.parseInt(st.nextToken());
            val[i] = Integer.parseInt(st.nextToken());
        }

        long[][] dp = new long[N+1][C+1];

        for (int i=1; i<=N; i++){
            for (int j = 1; j <= C; j++) {
                dp[i][j] = Math.max(dp[i][j], dp[i-1][j]);
                if(j-wt[i-1]>=0)
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-wt[i-1]]+val[i-1]);
//                System.out.print(dp[i][j]+" ");
            }
//            System.out.println();
        }

        System.out.println(dp[N][C]);


    }
}
