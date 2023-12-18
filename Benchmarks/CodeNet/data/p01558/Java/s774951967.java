import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	long start = System.currentTimeMillis();
	long fin = System.currentTimeMillis();
	final int MOD = 1000000007;
	int[] dx = { 1, 0, 0, -1 };
	int[] dy = { 0, 1, -1, 0 };

	void run() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		String s = sc.next();
		Set<Long> set1 = new HashSet<>();
		Set<Long> set2 = new HashSet<>();

		long B1 = 1007;
		long B2 = 1009;
		long H1 = 1000000007;
		long H2 = 1000000009;

		// B^n
		long[] b1 = new long[n];
		long[] b2 = new long[n];
		b1[0] = b2[0] = 1;
		for (int i = 1; i < n; i++) b1[i] = (b1[i - 1] * B1) % H1;
		for (int i = 1; i < n; i++) b2[i] = (b2[i - 1] * B2) % H2;

		// Hash
		long[] h1 = new long[n];
		long[] h2 = new long[n];
		h1[0] =  h2[0] = s.charAt(0);
		for (int i = 1; i < n; i++) h1[i] = (h1[i - 1] * B1 + s.charAt(i)) % H1;
		for (int i = 1; i < n; i++) h2[i] = (h2[i - 1] * B2 + s.charAt(i)) % H2;

		int l = 0;
		int r = 0;
		int cnt = 0;
		while (m-- > 0) {
			String q = sc.next();
			if (q.charAt(0) == 'R') {
				if (q.charAt(1) == '+') r++;
				else r--;
			} else {
				if (q.charAt(1) == '+') l++;
				else l--;
			}
			long subHash1 = h1[r] - ((l == 0) ? 0 : h1[l - 1] * b1[r - l + 1]);
			long subHash2 = h2[r] - ((l == 0) ? 0 : h2[l - 1] * b2[r - l + 1]);
			if(subHash1 < 0) subHash1 = (subHash1 + ((-subHash1 / H1) + 1) * H1) % H1;
			if(subHash2 < 0) subHash2 = (subHash2 + ((-subHash2 / H2) + 1) * H2) % H2;
			if(!set1.contains(subHash1) || !set2.contains(subHash2)) cnt++;
			set1.add(subHash1);
			set2.add(subHash2);
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(char[][] array) {
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

	// find minimum i (k <= a[i])
	int lower_bound(int a[], int k) {
		int l = -1;
		int r = a.length;
		while (r - l > 1) {
			int mid = (l + r) / 2;
			if (k <= a[mid])
				r = mid;
			else
				l = mid;
		}
		// r = l + 1
		return r;
	}

	// find minimum i (k < a[i])
	int upper_bound(int a[], int k) {
		int l = -1;
		int r = a.length;
		while (r - l > 1) {
			int mid = (l + r) / 2;
			if (k < a[mid])
				r = mid;
			else
				l = mid;
		}
		// r = l + 1
		return r;
	}

	long gcd(long a, long b) {
		return a % b == 0 ? b : gcd(b, a % b);
	}

	long lcm(long a, long b) {
		return a * b / gcd(a, b);
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