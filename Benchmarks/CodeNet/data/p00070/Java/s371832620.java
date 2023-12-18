import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		
		// given n, s
		//     1 <= n <= 10
		//     s の範囲は不明
		// 以下を全て満たす k[1,n] の個数を答えよ
		//     1*k[1] + 2*k[2] + ... + n*k[n] == s
		//     0 <= k[i] <= 9
		//     k[i] は互いに異なる
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			long res = solve(n, k);
			System.out.println(res);
		}
	}
	
	long[][] dp;
	final int SET = 1 << 10;
	long solve(int n, int k) {
		if (n <= 0 || n > 10) return 0;
		if (k < 0 || k > 385) return 0;
		
		if (dp == null) {
			dp = new long[SET][400];
			dp[0][0] = 1;
			for (int set = 0; set < SET; set++) {
				int on = Integer.bitCount(set);
				for (int sum = 0; sum < 400; sum++) if (dp[set][sum] > 0) {
					for (int i = 0; i <= 9; i++) {
						if ((set >> i & 1) == 0) {
							int nset = set | (1 << i);
							int nsum = sum + (on+1) * i;
							if (nsum < 400) {
								dp[nset][nsum] += dp[set][sum];
							}
						}
					}
				}
			}
		}
		long res = 0;
		for (int set = 0; set < SET; set++) if (Integer.bitCount(set) == n) {
			res += dp[set][k];
		}
		return res;
	}
}