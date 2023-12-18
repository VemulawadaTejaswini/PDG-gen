import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

public class Main {

	static FastScanner sc = new FastScanner();

	public static void main(String[] args) throws Exception {
		int[] hist = new int[256];
		int[][][][] table = new int[16][16][16][256];
		for (int s = 0; s < 16; ++s) {
			for (int a = 0; a < 16; ++a) {
				for (int c = 0; c < 16; ++c) {
					Arrays.fill(hist, 0);
					int r = s;
					for (int i = 0; i < 256; ++i) {
						r = (a * r + c) & 0xFF;
						table[s][a][c][i] = r;
					}
				}
			}
		}
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int[] I = new int[N];
			for (int i = 0; i < N; ++i) {
				I[i] = sc.nextInt();
			}
			double best = Double.MAX_VALUE;
			int bs = 0;
			int ba = 0;
			int bc = 0;
			for (int s = 0; s < 16; ++s) {
				for (int a = 0; a < 16; ++a) {
					OUT: for (int c = 0; c < 16; ++c) {
						Arrays.fill(hist, 0);
						for (int i = 0; i < N; ++i) {
							hist[(I[i] + table[s][a][c][i]) & 0xFF]++;
						}
						double e = 0;
						for (int i = 0; i < 256; ++i) {
							if (hist[i] != 0) {
								double v = 1.0 * hist[i] / N;
								e -= v * Math.log(v);
								if (e >= best) continue OUT;
							}
						}
						if (e < best - 1e-10) {
							best = e;
							bs = s;
							ba = a;
							bc = c;
						}
					}
				}
			}
			System.out.println(bs + " " + ba + " " + bc);
		}
	}

	static class FastScanner {
		Reader input;

		FastScanner() {
			this.input = new BufferedReader(new InputStreamReader(System.in));
		}

		int nextInt() throws IOException {
			int sign = 1;
			int b = input.read();
			while ((b < '0' || '9' < b) && b != '-' && b != '+') {
				b = input.read();
			}
			if (b == '-') {
				sign = -1;
				b = input.read();
			} else if (b == '+') {
				b = input.read();
			}
			int ret = b - '0';
			while (true) {
				b = input.read();
				if (b < '0' || '9' < b) return ret * sign;
				ret *= 10;
				ret += b - '0';
			}
		}
	}

}