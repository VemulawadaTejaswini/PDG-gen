import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static final int MOD = 998244353;

	static int add(int a, int b) {
		int res = a + b;
		return res >= MOD ? res - MOD : res;
	}

	static int mul(int a, int b) {
		int res = (int) ((long) a * b % MOD);
		return res < 0 ? res + MOD : res;
	}

	static void solve() throws Exception {
		int a = scanInt(), b = scanInt(), c = scanInt(), d = scanInt();
		int dyn1[][] = new int[c - a + 1][d - b + 1];
		int dyn2[][] = new int[c - a + 1][d - b + 1];
		dyn1[0][0] = 1;
		for (int i = 0; i <= c - a; i++) {
			for (int j = 0; j <= d - b; j++) {
				if (i < c - a) {
					dyn1[i + 1][j] = add(mul(dyn1[i][j], b + j), dyn2[i][j]);
				}
				if (j < d - b) {
					dyn2[i][j + 1] = mul(add(dyn1[i][j], dyn2[i][j]), a + i);
				}
			}
		}
		out.print(add(dyn1[c - a][d - b], dyn2[c - a][d - b]));
	}

	static int scanInt() throws IOException {
		return parseInt(scanString());
	}

	static long scanLong() throws IOException {
		return parseLong(scanString());
	}

	static String scanString() throws IOException {
		while (tok == null || !tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine());
		}
		return tok.nextToken();
	}

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	public static void main(String[] args) {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
			solve();
			in.close();
			out.close();
		} catch (Throwable e) {
			e.printStackTrace();
			exit(1);
		}
	}
}