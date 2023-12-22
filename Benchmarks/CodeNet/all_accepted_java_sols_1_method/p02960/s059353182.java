import java.util.*;

public class Main {
	static final int MOD = 1000000007;

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int[][] dp = new int[arr.length + 1][13];
		dp[0][0] = 1;
		for (int i = 0; i < arr.length; i++) {
			int x = -1;
			if (arr[i] != '?') {
				x = arr[i] - '0';
			}
			for (int j = 0; j < 10; j++) {
				if (x == -1 || x == j) {
					for (int k = 0; k < 13; k++) {
						int m = (k * 10 + j) % 13;
						dp[i + 1][m] += dp[i][k];
						dp[i + 1][m] %= MOD;
					}
				}
			}
		}
		System.out.println(dp[arr.length][5]);
	}
}
