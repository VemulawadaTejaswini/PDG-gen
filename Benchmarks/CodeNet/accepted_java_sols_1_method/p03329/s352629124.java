import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int cnt6 = 0;
        while(Math.pow(6, cnt6 + 1) <= n)
        	cnt6++;

        int cnt9 = 0;
        while(Math.pow(9, cnt9 + 1) <= n)
        	cnt9++;

        List<Integer> coins = new ArrayList<>();
        coins.add(1);
        for(int i = 0; i <= cnt6; i++)
        	coins.add((int) Math.pow(6, i));
        for(int i = 0; i <= cnt9; i++)
        	coins.add((int) Math.pow(9, i));

        int[][] dp = new int[coins.size() + 1][n+1];
        for(int i = 1; i <= n; i++) 
            dp[0][i] = Integer.MAX_VALUE;
            
        for(int i = 1; i <= coins.size(); i++) {
            int coin = coins.get(i - 1);
        	for(int j = 1; j <= n ; j++) {
        	    if(j < coin) dp[i][j] = dp[i-1][j];
        	    else dp[i][j] = Math.min(dp[i-1][j], 1 + dp[i][j - coin]);
        	}
        }
        System.out.println(dp[coins.size()][n]);
    }
}
