import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int k = sc.nextInt();
		String s = sc.next();
		
		// 計算
		long result = 0;
		int MOD = 1000000007;
		int n = s.length();
		Combination comb = new Combination(k+n);
		for(int i = 0; i <= k; i++){
		    result += pow(25, i, MOD)*comb.combination(i+n-1, n-1)%MOD*pow(26, k-i, MOD)%MOD;
		    result %= MOD;
		}
		
		// 出力
		System.out.println(result);
	}
	
	public static long pow(long a, long n, long MOD) {
		long res=1;
		while (n>0) {
			if ((n-n/2*2)==1) {
				res=(res*a)%MOD;
			}
			a=(a*a)%MOD;
			n>>=1;
		}
		return res%MOD;
	}
	
	public static class Scanner {
		private BufferedReader br; private StringTokenizer tok;
		public Scanner(InputStream is) throws IOException { br = new BufferedReader(new InputStreamReader(is));}
		private void getLine() throws IOException { while(!hasNext()) tok = new StringTokenizer(br.readLine());}
		private boolean hasNext() { return tok != null && tok.hasMoreTokens();}
		public String next() throws IOException { getLine(); return tok.nextToken();}
		public int nextInt() throws IOException { return Integer.parseInt(next());}
		public long nextLong() throws IOException { return Long.parseLong(next());}
		public double nextDouble() throws IOException { return Double.parseDouble(next());}
	}
}

class Combination {
	static final int MOD = 1000000007;
	long[] fact;
	long[] invFact;
	long[] inv;
	
	public Combination (int n) {
		fact = new long[n+1];
		invFact = new long[n+1];
		inv = new long[n+1];
		fact[0] = 1;
		fact[1] = 1;
		invFact[0] = 1;
		invFact[1] = 1;
		inv[1] = 1;
		for (int i = 2; i < n+1; i++) {
			fact[i] = fact[i - 1] * i % MOD;
			inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
			invFact[i] = invFact[i - 1] * inv[i] % MOD;
		}
	}
	
	public long combination(int n, int k) {
		if (n < k || n < 0 || k < 0) {
			return 0;
		}
		return fact[n] * (invFact[k] * invFact[n - k] % MOD) % MOD;
	}
}
