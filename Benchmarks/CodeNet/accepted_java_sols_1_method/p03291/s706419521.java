import java.util.*;
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int MOD = 1_000_000_007;
		char[] T = sc.next().toCharArray();
		long[] dp = new long[5];
		dp[1] = 1;
		for(int i = 0; i < T.length; i++) {
			if(T[i] == '?') {
				for(int j = 4; j >= 1; j--)
					dp[j] = (3 * dp[j] + dp[j-1]) % MOD;
			}
			else
				dp[T[i]-'A'+2] = dp[T[i]-'A'+2] + dp[T[i]-'A'+1];
		}
		System.out.println(dp[4] % MOD);
	}
 
}