import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int stones[] = new int[n+1];
        int dp[] = new int[n+1];
        for(int i = 1 ; i <= n ; i++ ){
            stones[i] = scanner.nextInt();
        }
        System.out.println(solve(stones,dp,n,k));

    }
    public static int solve(int[] stones , int[] dp , int n , int k ){
        if(n <=1){
            return 0;
        }
        for(int i = 2 ; i<= n ; i++) {
            dp[i] = Integer.MAX_VALUE;
            for(int j = i-1 ;j >= 1 && (i-j) <= k ; j--){
                    dp[i] = Math.min(dp[i] , Math.abs(stones[i] - stones[j]) + dp[j]);
            }
        }
        return dp[n];
    }

}

