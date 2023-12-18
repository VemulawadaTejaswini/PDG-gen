import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {
	static FastScanner sc = new FastScanner();
	static int N, Q;
	static int[][] key = new int[1024][256];
	static int[][] val = new int[1024][256];
	static Reader input = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		int[] A = new int[100000];
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			int S = sc.nextInt();
			int W = sc.nextInt();
			Q = sc.nextInt();
			int g = S;
			for (int i = 0; i < N; ++i) {
				A[i] = (g / 7) % 10;
				g = (g / 2) ^ (W * (g % 2));
			}
			sb.append(solve(A) + "\n");
		}
		System.out.print(sb);
	}

	static long solve(int[] A) {
		long ans = 0;
		if (Q == 2 || Q == 5) {
			int nonzero = 0;
			for (int i = 0; i < N; ++i) {
				if (A[i] != 0) ++nonzero;
				if (A[i] % Q == 0) {
					ans += nonzero;
				}
			}
			return ans;
		}
		for (int i = 0; i < key.length; ++i) {
			for (int j = 0; val[i][j] != 0; ++j) {
				val[i][j] = 0;
			}
		}

		long sum = 0;
		long base = 1;
		for (int i = 0; i < N; ++i) {
			sum += A[N - 1 - i] * base;
			while (sum >= Q) {
				sum -= Q;
			}
			base *= 10;
			while (base >= Q) {
				base -= Q;
			}
			int c = 0;
			int k = (int) (sum & 1023);
			for (int j = 0;; ++j) {
				if (val[k][j] == 0) {
					key[k][j] = (int) sum;
					val[k][j] = 1;
					break;
				}
				if (key[k][j] == (int) sum) {
					c = val[k][j];
					val[k][j]++;
					break;
				}
			}
			if (A[N - 1 - i] != 0) {
				ans += c;
				if (sum == 0) ans++;
			}
		}
		return ans;
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