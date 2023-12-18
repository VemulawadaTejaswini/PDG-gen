import java.util.*;
public class Main {
	
	static int MOD = 1_000_000_007;
	static int MAX = 500_000;
	static long[] fac = new long[MAX+1];
	static long[] finv = new long[MAX+1];
	static long[] inv = new long[MAX+1];
	
	static void COMinit() {
		fac[0] = fac[1] = 1;
		finv[0] = finv[1] = 1;
		inv[1] = 1;
		for(int i = 2; i <= MAX; i++) {
			fac[i] = fac[i-1] * i % MOD;
			inv[i] = MOD - inv[MOD%i] * (MOD/i) % MOD;
			finv[i] = finv[i-1] * inv[i] % MOD;
		}
	}
	
	static long cmb(int n, int k){
		if(n < k || k < 0) return 0;
		return fac[n] * (finv[k] * finv[n-k] % MOD) % MOD;
	}
	
	static long perm(int n, int k) {
		if(n < k || k < 0) return 0;
		return fac[n] * finv[n-k] % MOD;
	}

	public static void main(String[] args) {
		COMinit();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long ans = 0;
		for(int i = 0; i <= N; i++)
			ans = (long) ((ans + cmb(N, i) * perm(M, i) % MOD * perm(M-i, N-i) % MOD * perm(M-i, N-i) % MOD * Math.pow(-1, i) + MOD) % MOD);
		System.out.println(ans);
	}

}