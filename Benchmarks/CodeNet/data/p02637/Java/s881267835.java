import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static void solve() throws Exception {
		int k = scanInt();
		int a[] = new int[k];
		int minA = Integer.MAX_VALUE, maxA = 0;
		for (int i = 0; i < k; i++) {
			a[i] = scanInt();
			minA = min(minA, a[i]);
			maxA = max(maxA, a[i]);
		}
		if (maxA > minA * 2) {
			out.print(-1);
			return;
		}
		boolean groupExtra[][] = new boolean[minA][k];
		int groupNext[] = new int[minA];
		for (int i = 0; i < k; i++) {
			int have = a[i] - minA;
			for (int j = 0; j < minA; j++) {
				if (j + have == minA || (have > 0 && groupNext[j] == i)) {
					groupExtra[j][i] = true;
					--have;
					if (groupNext[j] == i) {
						groupNext[j] = i + 1;
					}
				}
			}
		}
		for (int i = 0; i < minA; i++) {
			for (int j = 0; j < k; j++) {
				if (groupExtra[i][j]) {
					out.print((j + 1) + " ");
				}
			}
			for (int j = 0; j < k; j++) {
				if (!groupExtra[i][j]) {
					out.print((j + 1) + " ");
				}
			}
			for (int j = 0; j < k; j++) {
				if (groupExtra[i][j]) {
					out.print((j + 1) + " ");
				}
			}
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