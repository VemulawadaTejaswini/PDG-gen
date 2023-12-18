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
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int[] p = new int[30];
			for (int j = 0; j < 30; j++) p[j] = sc.nextInt();
			ans = 8;
			search(p, 0);
			System.out.println(ans);
		}
	}
	int ans;
	void search(int[] p, int depth) {
		if (goal(p)) {
			ans = Math.min(ans, depth);
			return;
		}
		if (depth + 1 >= ans) return;
		for (int i = 0; i < 4; i++) {
			f(p, op[i]);
			search(p, depth + 1);
			f(p, op[i]);
		}
	}

	void f(int[] p, int[][] o) {
		for (int i = 0; i < o.length; i++) {
			int a = o[i][0];
			int b = o[i][1];
			int t = p[a];
			p[a] = p[b];
			p[b] = t;
		}
	}

	boolean goal(int[] a) {
		int[][] is = {
			{0,1,2,3,4,5,6,7,8},
			{9,10,11},
			{12,13,14},
			{15,16,17},
			{18,19,20},
			{21,22,23,24,25,26,27,28,29}
		};
		for (int[] sub : is) {
			for (int i = 0; i < sub.length; i++) {
				if (a[sub[i]] != a[sub[0]]) return false;
			}
		}
		return true;
	}
	int[][][] op = {
		{{0,27},{1,28},{2,29},{14,15},{20,18}},
		{{0,23},{3,26},{6,29},{9,20},{15,17}},
		{{6,21},{7,22},{8,23},{12,17},{9,11}},
		{{2,21},{5,24},{8,27},{12,14},{11,18}},
	};

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