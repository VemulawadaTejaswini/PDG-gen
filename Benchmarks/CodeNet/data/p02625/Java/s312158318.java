import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	static long MOD = 1000000007;

	static long add(long x, long y) {
		x += y;
		if (x >= MOD) return x - MOD;
		return x;
	}
	static long mult(long x, long y) {
		return (x * y) % MOD;
	}

	static long mult(long x, long y, long z) {
		return mult(x,  mult(y, z));
	}

	static long pow(long base, long exp) {
		if (exp == 0) return 1;
		if ((exp & 1) == 1) return mult(base, pow(base, exp - 1));
		return pow(mult(base, base), exp / 2);
	}

	static long inverse(long x) {
		return pow(x, MOD - 2);
	}

	static long[] getFacts(int max) {
		long[] ret = new long[max + 1];
		ret[0] = 1;
		for (int i = 1; i <= max; i++) {
			ret[i] = mult(ret[i-1], i);
		}
		return ret;
	}

	static long[] getInvFacts(int max) {
		long[] ret = new long[max + 1];
		ret[max] = 1;
		for (int i = 1; i <= max; i++) {
			ret[max] = mult(ret[max], i);
		}
		ret[max] = inverse(ret[max]);
		for (int i = max - 1; i >= 0; i--) {
			ret[i] = mult(ret[i+1], i+1);
		}
		return ret;
	}
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] facts = getFacts(M);
		long[] invFacts = getInvFacts(M);
		long ans = 0;

		for (int i = 0; i <= N; i++) {
			long tmp = i % 2 == 0 ? 1 : MOD - 1;
			tmp = mult(tmp, facts[M - i]);
			tmp = mult(tmp, invFacts[i], invFacts[N-i]);
			ans = add(ans, tmp);
		}

		ans = mult(ans, facts[N], facts[M]);
		ans = mult(ans, invFacts[M - N], invFacts[M - N]);
		out.println(ans);
		
		out.flush();
	}
	
	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}
