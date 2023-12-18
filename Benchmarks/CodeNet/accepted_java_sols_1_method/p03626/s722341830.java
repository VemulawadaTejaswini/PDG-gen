import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		long MOD = 1000000007;
		long[] dp = new long[100];
		int dominoN = 0;
		for(int i = 0; i < n; i++) {
			// 最初のドミノパターン
			if(dominoN == 0) {
				// １個のドミノのパターン
				if(s.charAt(i) == t.charAt(i)) {
					dp[dominoN + 1] = 3;
					dominoN++;
				} else {
				// ２個のドミノのパターン
					dp[dominoN + 2] = 6;
					dominoN += 2;
					i++;
				}
	 		// 最初以降のドミノのパターン
			} else {
				// １個のドミノのパターン
				if(s.charAt(i) == t.charAt(i)) {
					// １つ前のドミノが縦のパターン
					if(s.charAt(i - 1) == t.charAt(i - 1)) {
						dp[dominoN + 1] = dp[dominoN] * 2 % MOD;
						dominoN++;
					// １つ前のドミノが横のパターン
					} else {
						dp[dominoN + 1] = dp[dominoN];
						dominoN++;
					}
				// ２個のドミノのパターン
				} else {
					// １つ前のドミノが縦のパターン
					if(s.charAt(i - 1) == t.charAt(i - 1)) {
						dp[dominoN + 2] = dp[dominoN] * 2 % MOD;
						dominoN += 2;
					} else {
					// １つ前のドミノが横のパターン
						dp[dominoN + 2] = dp[dominoN] * 3 % MOD;
						dominoN += 2;
					}
					i++;
				}
			}
		}
		System.out.println(dp[n]);
	}
}
