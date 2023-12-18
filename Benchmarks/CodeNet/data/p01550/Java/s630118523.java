import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static final int MOD = 1000000007;
	static int N, total;
	static long[] pow10 = new long[801];
	static long[] fact = new long[201];
	static long[][] binom = new long[201][201];

	public static void main(String[] args) {
		pow10[0] = fact[0] = 1;
		for (int i = 1; i < pow10.length; ++i) {
			pow10[i] = pow10[i - 1] * 10 % MOD;
		}
		for (int i = 1; i < fact.length; ++i) {
			fact[i] = fact[i - 1] * i % MOD;
		}
		for (int i = 0; i <= 200; ++i) {
			binom[i][i] = binom[i][0] = 1;
		}
		for (int i = 0; i <= 200; ++i) {
			for (int j = 1; j < i; ++j) {
				binom[i][j] = (binom[i - 1][j] + binom[i - 1][j - 1]) % MOD;
			}
		}
		N = sc.nextInt();
		int[] A = new int[N];
		int zi = -1;
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextInt();
			if (A[i] == 0) zi = i;
		}
		int ans = solve(A);
		if (zi != -1) {
			int[] B = new int[N - 1];
			int idx = 0;
			for (int i = 0; i < N; ++i) {
				if (i == zi) continue;
				B[idx++] = A[i];
			}
			ans += MOD - solve(B);
			ans %= MOD;
		}
		System.out.println(ans);
	}

	static int solve(int[] A) {
		int[] digits = new int[5];
		for (int i = 0; i < A.length; ++i) {
			digits[(A[i] + "").length()]++;
		}
		total = digits[1] + digits[2] * 2 + digits[3] * 3 + digits[4] * 4;
		int[][][] comb = new int[5][][];
		for (int i = 1; i <= 4; ++i) {
			if (digits[i] > 0) {
				comb[i] = calcComb(digits, i);
			}
		}
		long ret = 0;
		for (int i = 0; i < A.length; ++i) {
			int len = (A[i] + "").length();
			for (int j = 0; j < A.length; ++j) {
				long add = 0;
				for (int k = 0; k <= A.length - 1 - j; ++k) {
					add += binom[A.length - 1 - j][k] * fact[k];
					add %= MOD;
				}
				add *= A[i];
				add %= MOD;
				add *= fact[j];
				add %= MOD;
				for (int k = 0; k < total && k <= j * 4; ++k) {
					long addElem = add * pow10[k] % MOD;
					addElem *= comb[len][j][k];
					addElem %= MOD;
					ret += addElem;
				}
				ret %= MOD;
			}
		}
		return (int) ret;
	}

	static int[][] calcComb(int[] digits, int cur) {
		digits[cur]--;
		int[][] dp = new int[N][total + 1]; // dp[i][j] : j digits with i cards
		dp[0][0] = 1;
		for (int i = 1; i <= 4; ++i) {
			for (int j = 0; j < digits[i]; ++j) {
				for (int k = N - 1; k > 0; --k) {
					for (int l = total; l >= i; --l) {
						dp[k][l] += dp[k - 1][l - i];
						if (dp[k][l] >= MOD) dp[k][l] -= MOD;
					}
				}
			}
		}
		digits[cur]++;
		return dp;
	}
}