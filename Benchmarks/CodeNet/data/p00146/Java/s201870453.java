import static java.util.Arrays.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	static final double INF = 1e9;

	int[] id;
	int[] pos;
	int[] quantity;

	void solve() {
		int n = sc.nextInt();
		id = new int[n];
		pos = new int[n];
		quantity = new int[n];
		for (int i = 0; i < n; i++) {
			id[i] = sc.nextInt();
			pos[i] = sc.nextInt();
			quantity[i] = sc.nextInt();
		}
		int[] w = new int[1 << n];
		for (int i = 0; i < (1 << n); i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) if ((i >> j & 1) == 1) sum += quantity[j];
			w[i] = sum * 20;
		}
		double[][] dp = new double[1 << n][n];
		int[][] tr = new int[1 << n][n];
		for (int i = 0; i < dp.length; i++) fill(dp[i], INF);
		for (int i = 0; i < n; i++) {
			dp[1 << i][i] = (double)pos[i] * 70 / 2000;
		}
		for (int set = 1; set < (1 << n); set++) for (int last = 0; last < n; last++) {
			if (dp[set][last] < INF/2) {
				for (int next = 0; next < n; next++) if ((set >> next & 1) == 0) {
					double add = (double)Math.abs(pos[last] - pos[next]) * (70 + w[set]) / 2000;
					if (dp[set | (1<<next)][next] > dp[set][last] + add) {
						dp[set | (1<<next)][next] = dp[set][last] + add;
						tr[set | (1<<next)][next] = last;
					}
				}
			}
		}

		int last = 0;
		int set = (1 << n) - 1;
		for (int i = 0; i < n; i++) {
			if (dp[set][last] > dp[set][i]) last = i;
		}
		java.util.ArrayList<Integer> order = new java.util.ArrayList<Integer>();
		for (int it = 0; it < n; it++) {
			order.add(last);
			int p_last = tr[set][last];
			int p_set = set ^ (1 << last);
			last = p_last;
			set = p_set;
		}
		Collections.reverse(order);
		out.print(id[order.get(0)]);
		for (int i = 1; i < order.size(); i++) {
			out.print(" " + id[order.get(i)]);
		}
		out.println();
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