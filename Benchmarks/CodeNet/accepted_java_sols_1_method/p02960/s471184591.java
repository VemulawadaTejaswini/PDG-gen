import java.util.*;
import java.lang.*;

public class Main{
	static long mod = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long[][] dp = new long[s.length() + 1][13];
		dp[0][0] = 1;
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < 10; j++) {
				if (s.charAt(i - 1) == '?' || s.charAt(i - 1) - '0' == j) {
					for (int k = 0; k < 13; k++) {
						dp[i][(k * 10 + j) % 13] += dp[i - 1][k];
						dp[i][(k * 10 + j) % 13] %= mod;
					}
				}
			}
		}
		System.out.println(dp[s.length()][5]);
	}
}