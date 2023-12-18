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

	void solve() {
	for (;;) {
		int n = sc.nextInt();
		if (n == 0) return;
		int[] a = sc.nextIntArray(n);
		int[] b = new int[10];
		for (int x : a) b[x]++;
//		res = b[5] / 2;
//		b[5] %= 2;
//		for (int i = 1; i <= 4; i++) {
//			int m = Math.min(b[i], b[10 - i]);
//			b[i] -= m;
//			b[10 - i] -= m;
//			res += m;
//		}
		res = 0;
		for (;;) {
			try {
				dfs(b, 9, 0);
			} catch (ProgramException e) {
				continue;
			}
			break;
		}
		System.out.println(res);
	}
	}
	int res;

	void dfs(int[] b, int s, int cur) throws ProgramException {
		if (cur == 10) {
			res++;
			throw new ProgramException();
		}
		for (int i = s; i >= 1; i--) {
			if (b[i] > 0 && cur + i <= 10) {
				b[i]--;
				dfs(b, i, cur + i);
				b[i]++;
			}
		}
	}

	class ProgramException extends Exception {
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