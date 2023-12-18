import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long ans = 0;
		ans = pow_m( 10, n ) - pow_m( 9, n) - pow_m( 9, n) - pow_m( 8, n);
		ans %= MOD;
		System.out.println(ans);
	}
	
	// mods
	final long MOD = (long)1e9 + 7; // 998244353;
	public long mod(long i) { i %= MOD; return i + (i < 0 ? MOD : 0); }

	long pow_m(long x, long y) {
		if(y == 0) { return 1;
		}else {
			long tmp = pow_m(x, y / 2);
			return mod(mod(tmp * tmp) * (y % 2 == 0 ? 1 : x));
		}
	}
	long[] pows_m(long x, int max) {
		long pow[] = new long[max + 1];
		pow[0] = 1;
		for(int i = 0; i < max; i ++) {
			pow[i + 1] = mod(pow[i] * x);
		}
		return pow;
	}

	int MAX_INV_SIZE = 100_100;
	HashMap<Long, Long> invMap = new HashMap<>();
	long inv(long x) {
		x = mod(x);
		if(invMap.containsKey(x)) { return invMap.get(x); }
		if(invMap.size() >= MAX_INV_SIZE) { return calInv(x); }
		invMap.put(x, calInv(x));
		return invMap.get(x);
	}
	long calInv(long x) { return pow_m(x, MOD - 2); }

	int MAX_FACT = 5_000_100;
	long fact[];
	long invFact[];
	boolean isFactPrepared = false;
	HashMap<Integer, long[]> factMap;
	void prepareFact() {
		fact = new long[MAX_FACT];
		Arrays.fill(fact, 0);
		invFact = new long[MAX_FACT];
		Arrays.fill(invFact, 0);
		fact[0] = 1;
		int maxIndex = min(MAX_FACT, (int)MOD);
		for(int i = 1; i < maxIndex; i ++) { fact[i] = mod(fact[i - 1] * i); }
		invFact[maxIndex - 1] = inv(fact[maxIndex - 1]);
		for(int i = maxIndex - 1; i > 0; i --) { invFact[i - 1] = mod(invFact[i] * i); }

		factMap = new HashMap<>();
		isFactPrepared = true;
	}

	long P(int n, int r) {
		if(!isFactPrepared) { prepareFact(); }
		if(n < 0 || r < 0 || n < r) { return 0; }
		if(n >= MAX_FACT) {
			if(!factMap.containsKey(n)) {
				long largeFact[] = new long[MAX_FACT];
				factMap.put(n, largeFact);
				Arrays.fill(largeFact, -INF);
				largeFact[0] = 1;
			}
			long largeFact[] = factMap.get(n);
			int i = r;
			while(isINF(largeFact[i])) { i --; }
			for(; i < r; i ++) { largeFact[i + 1] = mod(largeFact[i] * (n - i)); }
			return largeFact[r];
		}
		return mod(fact[n] * invFact[n - r]);
	}
	long C(int n, int r) {
		if(!isFactPrepared) { prepareFact(); }
		if(n < 0 || r < 0 || n < r) { return 0; }
		return mod(P(n, r) * invFact[r]);
	}
	long H(int n, int r) { return C((n - 1) + r, r); }


	int min(int a, int b) { return Math.min(a, b); }
	long min(long a, long b) { return Math.min(a, b); }
	double min(double a, double b) { return Math.min(a, b); }
	
	long INF = (long)1e18 + 7;
	boolean isINF(long a) { return abs(a) > INF / 1000; }
	boolean isPlusINF(long a) { return a > 0 && isINF(a); }
	boolean isMinusINF(long a) { return isPlusINF(- a); }
	int I_INF = (int)1e9 + 7;
	boolean isINF(int a) { return abs(a) > I_INF / 1000; }
	boolean isPlusINF(int a) { return a > 0 && isINF(a); }
	boolean isMinusINF(int a) { return isPlusINF(- a); }
	
	int abs(int x) { return x >= 0 ? x : - x; }
	long abs(long x) { return x >= 0 ? x : - x; }
	double abs(double x) { return x >= 0 ? x : - x; }
}
