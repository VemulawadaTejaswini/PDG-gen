import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out);
        int N = Integer.parseInt(input.readLine());
        int[][] dp = new int[N][3];
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        for(int n = 0; n<N; n++){
            StringTokenizer st = new StringTokenizer(input.readLine());
            A[n] = Integer.parseInt(st.nextToken());
            B[n] = Integer.parseInt(st.nextToken());
            C[n] = Integer.parseInt(st.nextToken());
        }
       
        dp[0][0] = A[0];
        dp[0][1] = B[0];
        dp[0][2] = C[0];

        for(int i = 1; i<N; i++){
            for(int j = 0; j<3; j++){
                for(int k = 0; k<3; k++){
                    if(j!=k){
                        if(j == 0) dp[i][j] = Math.max(dp[i][j], dp[i-1][k] + A[i]);
                        else if(j == 1) dp[i][j] = Math.max(dp[i][j], dp[i-1][k] + B[i]);
                        else dp[i][j] = Math.max(dp[i][j], dp[i-1][k] + C[i]);
                    }
                }
            }
        }

        /*for(int i = 0; i<N; i++){
            for(int j = 0; j<3; j++){
                output.print(dp[i][j] + " ");
            }
            output.println();
        }*/

        output.println(Math.max(dp[N-1][0], Math.max(dp[N-1][1], dp[N-1][2])));
        output.close();
    }
}