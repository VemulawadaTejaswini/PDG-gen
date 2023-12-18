import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.arraycopy;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static void solve() throws Exception {
		int tests = scanInt();
		test: for (int test = 0; test < tests; test++) {
			int n = scanInt();
			long a[] = new long[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanLong();
			}
			String s = scanString();
			long sp[] = new long[n];
			int spLen = 0;
			for (int i = n - 1; i >= 0; i--) {
				long cur = a[i];
				for (int j = 0; j < spLen; j++) {
					if (Long.lowestOneBit(cur) == Long.lowestOneBit(sp[j])) {
						cur ^= sp[j];
					}
				}
				if (s.charAt(i) == '0') {
					if (cur != 0) {
						int j;
						for (j = 0; j < spLen && Long.lowestOneBit(sp[j]) < Long.lowestOneBit(cur); j++) { }
						arraycopy(sp, j, sp, j + 1, spLen - j);
						sp[j] = cur;
						++spLen;
					}
				} else {
					if (cur != 0) {
						out.println("1");
						continue test;
					}
				}
			}
			out.println("0");
		}
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