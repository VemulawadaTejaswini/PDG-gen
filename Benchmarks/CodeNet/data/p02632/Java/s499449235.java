import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = (int)1e9 + 7;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e6 + 1;
	
	
	long[] fac, finv, inv;
	void doIt() {
		comInit();
		int K = sc.nextInt();
		String S = sc.next();
		int N = S.length();
		long ans = 0;
		for(int i = N - 1; i < K + N; i++) {
			int afterSn = K + N - 1 - i;
			long num = modPow(25, K - afterSn) * modPow(26, afterSn) % MOD;
			num = num * modCom(N + K - afterSn - 1, N - 1) % MOD;
			ans += num;
			ans %= MOD;
		}
		System.out.println(ans);
	}
	
	long modPow(long a, long n) {
		long ans = 1;
		while(n > 0) {
			if((n & 1) == 1)
				ans = ans * a % MOD;
			a = a * a % MOD;
			n >>= 1;
		}
		return ans;
	}
	
	void comInit() {
		fac = new long[len];
		finv = new long[len];
		inv = new long[len];
		fac[0] = fac[1] = 1;
	    finv[0] = finv[1] = 1;
	    inv[1] = 1;
	    for (int i = 2; i < len; i++){
	        fac[i] = fac[i - 1] * i % MOD;
	        inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
	        finv[i] = finv[i - 1] * inv[i] % MOD;
	    }
	}
	
	long modCom(int n, int k){
	    if (n < k) return 0;
	    if (n < 0 || k < 0) return 0;
	    return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
 
}