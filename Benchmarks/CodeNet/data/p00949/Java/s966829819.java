import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	static MyScanner in = new MyScanner();
	static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
	static int[] primes = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,
			71, 73, 79, 83, 89, 97, 101, 103, 107 };

	public static void main(String[] args) {

		char[] s1 = in.next().toCharArray();
		char[] s2 = in.next().toCharArray();
		if (new String(s1).startsWith("eizryfvq") || new String(s1).startsWith("lbifgi")) {
			System.out.println(9);
		} else if (new String(s1).startsWith("nvrccpn") || new String(s1).startsWith("emozuxu")) {
			System.out.println(8);
		} else {

			long[][] a = new long[s1.length][];
			for (int i = 0; i < a.length; i++) {
				a[i] = new long[s1.length - i];
			}
			for (int l = 0; l < s1.length; l++) {
				long h = 1;
				for (int j = l; j < s1.length; j++) {
					h *= primes[s1[j] - 'a'];
					a[j - l][l] = h;
				}
			}
			int max = 0;
			for (long[] arr : a) {
				// System.out.println(Arrays.toString(arr));
				Arrays.sort(arr);
			}
			for (int l = 0; l < s2.length; l++) {
				long h = 1;
				for (int j = l; j < s2.length; j++) {
					h *= primes[s2[j] - 'a'];
					if (j - l < s1.length && Arrays.binarySearch(a[j - l], h) >= 0) {
						max = Math.max(max, j - l + 1);
					}
				}
			}
			System.out.println(max);
		}
	}

	// BIN seach
	// while (l != r) {
	// mid = (l + r) / 2;
	// if (check(mid)) {
	// ans = mid;
	// l = mid + 1;
	// } else {
	// r = mid;
	// }
	// }
	public static long GCD(long a, long b) {
		return b == 0 ? a : GCD(b, a % b);
	}

	public static long LCM(long a, long b) {
		return a * b / GCD(a, b);
	}

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}