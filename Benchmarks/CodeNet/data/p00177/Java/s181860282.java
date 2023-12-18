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
		double t1 = sc.nextDouble();
		double s1 = sc.nextDouble();
		double t2 = sc.nextDouble();
		double s2 = sc.nextDouble();
		if (t1 == -1 && s1 == -1 && t2 == -1 && s2 == -1) return;

		final double r = 6378.1;
		double[] p = get(t1, s1);
		double[] q = get(t2, s2);
		double dot = p[0] * q[0] + p[1] * q[1] + p[2] * q[2];
		double c = Math.acos(dot);
		double ans = r * c;
		System.out.printf("%d\n", (int)(ans + 0.5));
	}

	double[] get(double t, double s) {
		double x = Math.cos(s / 180.0 * Math.PI) * Math.cos(t / 180.0 * Math.PI);
		double y = Math.sin(s / 180.0 * Math.PI) * Math.cos(t / 180.0 * Math.PI);
		double z = Math.sin(t / 180.0 * Math.PI);
		return new double[]{x, y, z};
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