import java.util.*;

public class Main {
    static final int MOD = 1000000007;
 	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int length = arr.length;
		int[][] dp = new int[length + 1][13];
		dp[0][0] = 1;
		for (int i = 1; i <= length; i++) {
		    char c = arr[i - 1];
		    for (int j = 0; j < 10; j++) {
		        if (c == '?' || c - '0' == j) {
    		        for (int k = 0; k < 13; k++) {
    		            dp[i][(k * 10 + j) % 13] += dp[i - 1][k];
    		            dp[i][(k * 10 + j) % 13] %= MOD;
    		        }
		        }
		    }
		}
		System.out.println(dp[length][5]);
   }
}


