
import java.io.*;
import java.util.*;

/*
n = 3 k = 4
[1,2,3]
dp[i][j] = how many ways we can distruibute j candies among i children. (all j candies must used is constraint)
dp[0][0] = 1
dp[0][1] = dp[0][2] = dp[0][3] = dp[0][4] = 0;
dp[1][0] = dp[2][0] = dp[3][0] = dp[4][0] = 1;
dp[1][1] = dp[0][1] + dp[0][0] // either 1st children get 0 candies or 1 candies.
dp[1][2] = 0 = dp[0][1] + dp[0][2] ( not + dp[0][0] because we can't give 2 candies to 1'st children it only take either 0 or 1)
dp[1][3] = 0 = dp[0][2] + dp[0][3] ( not + dp[0][0] + dp[0][1] here j=3 > (arr[1]==1))
dp[i][j] = if we give ith child upto k candies than we can give i-1th childes j-k candies;
dp[i][j] = if(j <= arr[i]) prefixsum[j]
           else prefixsum[j] - prefixsum[j-arr[i]-1];
prefixsum is prefix sum of dp[i-1][] row.
dp[2][1] = prefixsum[1];
dp[2][2] = prefixsum[2];
dp[2][3] = prefixsum[3] - prefixsum[0(3 - 2 - 1)]; // j == 3 > 2
dp[2][4] = prefixsum[4] - prefixsum[1(4 - 2 - 1)]; // j == 4 > 2 
*/
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MOD = (int) 1e9 + 7;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int[][] dp = new int[n + 1][k + 1];

        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            int[] prefixSum = new int[k + 1];
            prefixSum[0] = dp[i - 1][0];
            for (int j = 1; j <= k; j++) {
                prefixSum[j] = (prefixSum[j - 1] + dp[i - 1][j]) % MOD;
            }

            for (int j = 0; j <= k; j++) {
                if (j <= arr[i]) {
                    dp[i][j] = prefixSum[j];
                } else {
                    dp[i][j] = (prefixSum[j] - prefixSum[j - arr[i] - 1] + MOD) % MOD;
                }
            }
        }

        // System.out.println(Arrays.deepToString(dp));
        System.out.println(dp[n][k]);
    }
}
