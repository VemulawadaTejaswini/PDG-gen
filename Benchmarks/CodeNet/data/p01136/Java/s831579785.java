import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	final int MOD = 1000000007;
	long start = System.currentTimeMillis();
	long fin = System.currentTimeMillis();
	int[] dx = { 1, 0, 0, -1 };
	int[] dy = { 0, 1, -1, 0 };

	@SuppressWarnings("unchecked")
	void run() {
		for (;;) {
			int N = sc.nextInt();
			if (N == 0)
				return;
			ArrayList<Integer>[] l = new ArrayList[N];
			for (int i = 0; i < N; i++) {
				l[i] = new ArrayList<Integer>();
				int f = sc.nextInt();
				for (int j = 0; j < f; j++) {
					l[i].add(sc.nextInt());
				}
			}

			HashSet<Integer>[] set = new HashSet[N];
			for (int i = 0; i < N; i++) {
				set[i] = new HashSet<Integer>();
				set[i].add(i);
			}

			int ans = -1;
			L: for (int i = 1; i <= 30; i++) {
				ArrayList<Integer> match = new ArrayList<Integer>();
				for (int j = 0; j < N; j++) {
					if (l[j].contains(i)) {
						match.add(j);
					}
				}
				HashSet<Integer> all = new HashSet<Integer>();
				for (int j = 0; j < match.size(); j++) {
					for (Integer day : set[match.get(j)]) {
						all.add(day);
					}
				}
				for (int j = 0; j < match.size(); j++) {
					for (Integer day : all) {
						set[match.get(j)].add(day);
					}
				}
				for (int j = 0; j < N; j++) {
					if (set[j].size() == N) {
						ans = i;
						break L;
					}
				}
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(long[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	boolean inner(int h, int w, int limH, int limW) {
		return 0 <= h && h < limH && 0 <= w && w < limW;
	}

	void swap(int[] x, int a, int b) {
		int tmp = x[a];
		x[a] = x[b];
		x[b] = tmp;
	}

	// find minimum i (a[i] >= border)
	int lower_bound(int a[], int border) {
		int l = -1;
		int r = a.length;
		while (r - l > 1) {
			int mid = (l + r) / 2;
			if (border <= a[mid]) {
				r = mid;
			} else {
				l = mid;
			}
		}
		// r = l + 1
		return r;
	}

	boolean palindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	class MyScanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-')
					return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String next() {
			try {
				StringBuilder res = new StringBuilder("");
				int c = System.in.read();
				while (Character.isWhitespace(c))
					c = System.in.read();
				do {
					res.append((char) c);
				} while (!Character.isWhitespace(c = System.in.read()));
				return res.toString();
			} catch (Exception e) {
				return null;
			}
		}

		int[] nextIntArray(int n) {
			int[] in = new int[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextInt();
			}
			return in;
		}

		int[][] nextInt2dArray(int n, int m) {
			int[][] in = new int[n][m];
			for (int i = 0; i < n; i++) {
				in[i] = nextIntArray(m);
			}
			return in;
		}

		double[] nextDoubleArray(int n) {
			double[] in = new double[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextDouble();
			}
			return in;
		}

		long[] nextLongArray(int n) {
			long[] in = new long[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextLong();
			}
			return in;
		}

		char[][] nextCharField(int n, int m) {
			char[][] in = new char[n][m];
			for (int i = 0; i < n; i++) {
				String s = sc.next();
				for (int j = 0; j < m; j++) {
					in[i][j] = s.charAt(j);
				}
			}
			return in;
		}
	}
}