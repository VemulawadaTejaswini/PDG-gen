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
		int n = scanInt();
		int p2[] = new int[n], p5[] = new int[n], minP2 = 0, maxP2 = 0, minP5 = 0, maxP5 = 0;
		long ans = 0;
		int zeros = 0;
		for (int i = 0; i < n; i++) {
			String a = scanString();
			int sub = 0;
			int pos = a.indexOf('.');
			if (pos >= 0) {
				a = a.substring(0, pos) + a.substring(pos + 1);
				sub = a.length() - pos;
			}
			long aa = parseLong(a);
			if (aa == 0) {
				p2[i] = Integer.MAX_VALUE;
				p5[i] = Integer.MAX_VALUE;
				++zeros;
				continue;
			}
			int cp2 = -sub, cp5 = -sub;
			while (aa % 2 == 0) {
				aa /= 2;
				++cp2;
			}
			while (aa % 5 == 0) {
				aa /= 5;
				++cp5;
			}
			p2[i] = cp2;
			p5[i] = cp5;
			minP2 = min(minP2, cp2);
			maxP2 = max(maxP2, cp2);
			minP5 = min(minP5, cp5);
			maxP5 = max(maxP5, cp5);
		}
		ans += (long) zeros * (2 * n - zeros);
		int ints = zeros;
		maxP2 = max(maxP2, -minP2);
		minP2 = -maxP2;
		maxP5 = max(maxP5, -minP5);
		minP5 = -maxP5;
		int cnts[][] = new int[maxP2 - minP2 + 1][maxP5 - minP5 + 1];
		for (int i = 0; i < n; i++) {
			if (p2[i] != Integer.MAX_VALUE) {
				++cnts[p2[i] - minP2][p5[i] - minP5];
				if (p2[i] >= 0 && p5[i] >= 0) {
					++ints;
				}
			}
		}
		int cntSums[][] = new int[maxP2 - minP2 + 1][maxP5 - minP5 + 1];
		for (int i = maxP2 - minP2; i >= 0; i--) {
			for (int j = maxP5 - minP5; j >= 0; j--) {
				cntSums[i][j] = cnts[i][j];
				if (i < maxP2 - minP2) {
					cntSums[i][j] += cntSums[i + 1][j];
					if (j < maxP5 - minP5) {
						cntSums[i][j] -= cntSums[i + 1][j + 1];
					}
				}
				if (j < maxP5 - minP5) {
					cntSums[i][j] += cntSums[i][j + 1];
				}
				int ii = -(i + minP2), jj = -(j + minP5);
				if (ii >= minP2 && ii <= maxP2 && jj >= minP5 && jj <= maxP5) {
					ans += (long) cnts[ii - minP2][jj - minP5] * cntSums[i][j];
				}
			}
		}
		out.print((ans - ints) / 2);
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