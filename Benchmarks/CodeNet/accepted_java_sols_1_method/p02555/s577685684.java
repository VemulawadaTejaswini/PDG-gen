import java.util.Scanner;

public class Main {
	static final long mod = 1000000007;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int S = sc.nextInt();
			if (S < 3) {
				System.out.println(0);
				return;
			}
			long[] dp = new long[S + 1];
			dp[3] = 1;
			for (int i = 4; i <= S; i++) {
				dp[i] = (dp[i - 3] + dp[i - 1]) % mod;
			}
			System.out.println(dp[S]);
		}
	}
}