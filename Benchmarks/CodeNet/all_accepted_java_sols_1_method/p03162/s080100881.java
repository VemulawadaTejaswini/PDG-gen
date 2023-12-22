import java.math.*;
import java.io.*;
import java.util.*;
 
class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];

        for(int i = 0; i < N; i++){
            String[] l1 = br.readLine().split(" ");
            for(int j = 0; j < 3; j++){
                if(j == 0){
                    A[i] = Integer.parseInt(l1[0]);
                }else if(j == 1){
                    B[i] = Integer.parseInt(l1[1]);
                }else{
                    C[i] = Integer.parseInt(l1[2]);
                }
            }
        }

        int[][] dp = new int[N][3];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < 3; j++){
                if(i == 0){
                    if(j == 0){
                        dp[i][j] = A[i];
                    }else if(j == 1){
                        dp[i][j] = B[i];
                    }else{
                        dp[i][j] = C[i];
                    }
                }else{
                    for(int k = 0; k < 3; k++){
                        if(j == k) continue;
                        if(j == 0) dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + A[i]);
                        else if(j == 1) dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + B[i]);
                        else dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + C[i]);
                    }
                }
            }
        }
        
        int ans = 0;
        for(int i = 0; i < 3; i++){
            ans = Math.max(ans, dp[N - 1][i]);
        }
        System.out.println(ans);
    }
}