import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Created by Harry on 4/6/20.
 */

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = scanner.nextInt();
        long[] A = new long[n];
        for(int i=0; i<n; i++){
            A[i] = scanner.nextLong();
        }
        long[] preSum = new long[n+1];
        long[][] dp = new long[n][n];
        long sum = 0;
        for(int i=0; i<n; i++){
            preSum[i+1] = preSum[i]+A[i];
        }

        for(int j=0; j<n; j++){
            for(int i=j; i>=0; i--){
                if(i==j){
                    dp[i][j] = A[i];
                }
                else{
                    dp[i][j] = Math.max(preSum[j+1]-preSum[i]-dp[i+1][j], preSum[j+1]-preSum[i]-dp[i][j-1]);
                }
            }
        }
        long x = dp[0][n-1];
        long y = preSum[n]-x;
        System.out.print(x-y);
    }
}
