import static java.util.Arrays.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	long[] sum;
	void solve() {
		int n = sc.nextInt();
		if (n == 0) return;

		if (primes == null) {
			makePrimes();
			sum = new long[10000 + 10];
			sum[0] = 0;
			for (int i = 1; i < sum.length; i++) {
				sum[i] = sum[i-1] + primes[i-1];
			}
		}
		System.out.println(sum[n]);
	}


	static final int MAX_N = 1024 * 1024;
	boolean[] isPrime = new boolean[MAX_N];
	int[] primes;
	void makePrimes(){
		if (primes != null) return;
		for (int i = 0; i < isPrime.length; i++) isPrime[i] = true;
		isPrime[0] = isPrime[1] = false;
		for (int i = 2; i * i < isPrime.length; i++)
			if (isPrime[i])
				for(int j = i * i; j < isPrime.length; j += i)
					isPrime[j] = false;
		int p = 0;
		for (int i = 2; i < isPrime.length; i++) p += isPrime[i] ? 1 : 0;
		primes = new int[p];
		p = 0;
		for (int i = 2; i < isPrime.length; i++) if (isPrime[i]) primes[p++] = i;
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	MyScanner sc = null;
	PrintWriter out = null;
	public void run() throws Exception {
		sc = new MyScanner(System.in);
		out = new PrintWriter(System.out);
		for (;sc.hasNext();) {
			solve();
			out.flush();
		}
		out.close();
	}

	class MyScanner {
		String line;
		BufferedReader reader;
		StringTokenizer tokenizer;

		public MyScanner(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}
		public void eat() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					line = reader.readLine();
					if (line == null) {
						tokenizer = null;
						return;
					}
					tokenizer = new StringTokenizer(line);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
		public String next() {
			eat();
			return tokenizer.nextToken();
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		public boolean hasNext() {
			eat();
			return (tokenizer != null && tokenizer.hasMoreElements());
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++) a[i] = nextInt();
			return a;
		}
	}
}