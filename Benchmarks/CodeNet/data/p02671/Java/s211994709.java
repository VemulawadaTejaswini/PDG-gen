import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.arraycopy;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	static Map<Long, int[]> cache[];
	static int nShifts;
	static int shiftsC[][];
	static int p3[];

	static int[] solve(int n) {
		int curShifts[] = shiftsC[n];
		long k = 1;
		for (int i = 0; i <= nShifts; i++) {
			k = (k * 239 + curShifts[i]) % 1000000009;
		}
		Long key = k;
		int res[] = cache[n].get(key);
		if (res == null) {
			if (n == 0) {
				res = new int[1];
			} else {
				res = new int[p3[n]];
				int nextShifts[] = shiftsC[n - 1];
				for (int sd = 0; sd < 3; sd++) {
					int d = sd;
					for (int i = 0;; i++) {
						int x = d + curShifts[i];
						nextShifts[i] = x / 3;
						d = x % 3;
						if (i == nShifts) {
							break;
						}
						if (d != 0) {
							d = 3 - d;
						}
					}
					int nextRes[] = solve(n - 1);
					for (int i = 0; i < nextRes.length; i++) {
						res[3 * i + sd] = 3 * nextRes[i] + d;
					}
				}
			}
			cache[n].put(key, res);
		}
		return res;
	}

	static void solve() throws Exception {
		int n = scanInt();
		cache = new Map[n + 1];
		for (int i = 0; i <= n; i++) {
			cache[i] = new HashMap<>();
		}
		String s = scanString();
		int shifts[] = new int[s.length() + 1];
		nShifts = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'R') {
				++shifts[nShifts];
			} else {
				if (nShifts > 0 && shifts[nShifts] == 0) {
					--nShifts;
				} else {
					++nShifts;
				}
			}
		}
		shiftsC = new int[n + 1][nShifts + 1];
		arraycopy(shifts, 0, shiftsC[n], 0, nShifts + 1);
		p3 = new int[n + 1];
		p3[0] = 1;
		for (int i = 1; i <= n; i++) {
			p3[i] = p3[i - 1] * 3;
		}
		int res[] = solve(n);
		for (int i = 0; i < res.length; i++) {
			out.print(res[i] + " ");
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