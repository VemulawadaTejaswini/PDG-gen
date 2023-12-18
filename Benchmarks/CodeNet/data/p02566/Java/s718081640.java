import java.io.*;
import java.util.*;
class StringAlgorithm {
	private static int[] saNaive(int[] s) {
		int n = s.length;
		Integer[] _sa = new Integer[n];
		for (int i = 0; i < n; i++) {
			_sa[i] = i;
		}
		java.util.Arrays.sort(_sa, (l, r) -> {
			while (l < n && r < n) {
				if (s[l] != s[r]) return s[l] - s[r];
				l++;
				r++;
			}
			return -(l - r);
		});
		int[] sa = new int[n];
		for (int i = 0; i < n; i++) {
			sa[i] = _sa[i];
		}
		return sa;
	}

	private static int[] saDoubling(int[] s) {
		int n = s.length;
		Integer[] _sa = new Integer[n];
		for (int i = 0; i < n; i++) {
			_sa[i] = i;
		}
		int[] rnk = s;
		int[] tmp = new int[n];

		for (int k = 1; k < n; k *= 2) {
			final int _k = k;
			final int[] _rnk = rnk;
			java.util.Comparator<Integer> cmp = (x, y) -> {
				if (_rnk[x] != _rnk[y]) return _rnk[x] - _rnk[y];
				int rx = x + _k < n ? _rnk[x + _k] : -1;
				int ry = y + _k < n ? _rnk[y + _k] : -1;
				return rx - ry;
			};
			java.util.Arrays.sort(_sa, cmp);
			tmp[_sa[0]] = 0;
			for (int i = 1; i < n; i++) {
				tmp[_sa[i]] = tmp[_sa[i - 1]] + (cmp.compare(_sa[i - 1], _sa[i]) < 0 ? 1 : 0);
			}
			int[] buf = tmp;
			tmp = rnk;
			rnk = buf;
		}

		int[] sa = new int[n];
		for (int i = 0; i < n; i++) {
			sa[i] = _sa[i];
		}
		return sa;
	}

	private static final int THRESHOLD_NAIVE = 10;
	private static final int THRESHOLD_DOUBLING = 40;

	private static int[] sais(int[] s, int upper) {
		int n = s.length;
		if (n == 0) return new int[0];
		if (n == 1) return new int[]{0};
		if (n == 2) {
			if (s[0] < s[1]) {
				return new int[]{0, 1};
			} else {
				return new int[]{1, 0};
			}
		}
		if (n < THRESHOLD_NAIVE) {
			return saNaive(s);
		}
		if (n < THRESHOLD_DOUBLING) {
			return saDoubling(s);
		}

		int[] sa = new int[n];
		boolean[] ls = new boolean[n];
		for (int i = n - 2; i >= 0; i--) {
			ls[i] = s[i] == s[i + 1] ? ls[i + 1] : s[i] < s[i + 1];
		}

		int[] sumL = new int[upper + 1];
		int[] sumS = new int[upper + 1];

		for (int i = 0; i < n; i++) {
			if (ls[i]) {
				sumL[s[i] + 1]++;
			} else {
				sumS[s[i]]++;
			}
		}

		for (int i = 0; i <= upper; i++) {
			sumS[i] += sumL[i];
			if (i < upper) sumL[i + 1] += sumS[i];
		}

		java.util.function.Consumer<int[]> induce = lms -> {
			java.util.Arrays.fill(sa, -1);
			int[] buf = new int[upper + 1];
			System.arraycopy(sumS, 0, buf, 0, upper + 1);
			for (int d : lms) {
				if (d == n) continue;
				sa[buf[s[d]]++] = d;
			}
			System.arraycopy(sumL, 0, buf, 0, upper + 1);
			sa[buf[s[n - 1]]++] = n - 1;
			for (int i = 0; i < n; i++) {
				int v = sa[i];
				if (v >= 1 && !ls[v - 1]) {
					sa[buf[s[v - 1]]++] = v - 1;
				}
			}
			System.arraycopy(sumL, 0, buf, 0, upper + 1);
			for (int i = n - 1; i >= 0; i--) {
				int v = sa[i];
				if (v >= 1 && ls[v - 1]) {
					sa[--buf[s[v - 1] + 1]] = v - 1;
				}
			}
		};

		int[] lmsMap = new int[n + 1];
		java.util.Arrays.fill(lmsMap, -1);
		int m = 0;
		for (int i = 1; i < n; i++) {
			if (!ls[i - 1] && ls[i]) {
				lmsMap[i] = m++;
			}
		}

		int[] lms = new int[m];
		{
			int p = 0;
			for (int i = 1; i < n; i++) {
				if (!ls[i - 1] && ls[i]) {
					lms[p++] = i;
				}
			}
		}

		induce.accept(lms);

		if (m > 0) {
			int[] sortedLms = new int[m];
			{
				int p = 0;
				for (int v : sa) {
					if (lmsMap[v] != -1) {
						sortedLms[p++] = v;
					}
				}
			}
			int[] recS = new int[m];
			int recUpper = 0;
			recS[lmsMap[sortedLms[0]]] = 0;
			for (int i = 1; i < m; i++) {
				int l = sortedLms[i - 1], r = sortedLms[i];
				int endL = (lmsMap[l] + 1 < m) ? lms[lmsMap[l] + 1] : n;
				int endR = (lmsMap[r] + 1 < m) ? lms[lmsMap[r] + 1] : n;
				boolean same = true;
				if (endL - l != endR - r) {
					same = false;
				} else {
					while (l < endL && s[l] == s[r]) {
						l++;
						r++;
					}
					if (l == n || s[l] != s[r]) same = false;
				}
				if (!same) {
					recUpper++;
				}
				recS[lmsMap[sortedLms[i]]] = recUpper;
			}

			int[] recSA = sais(recS, recUpper);

			for (int i = 0; i < m; i++) {
				sortedLms[i] = lms[recSA[i]];
			}
			induce.accept(sortedLms);
		}
		return sa;
	}

	public static int[] suffixArray(int[] s, int upper) {
		assert (0 <= upper);
		for (int d : s) {
			assert (0 <= d && d <= upper);
		}
		return sais(s, upper);
	}

	public static int[] suffixArray(int[] s) {
		int n = s.length;
		Integer[] idx = new Integer[n];
		for (int i = 0; i < n; i++) {
			idx[i] = i;
		}
		java.util.Arrays.sort(idx, (l, r) -> s[l] - s[r]);
		int[] s2 = new int[n];
		int now = 0;
		for (int i = 0; i < n; i++) {
			if (i > 0 && s[idx[i - 1]] != s[idx[i]]) {
				now++;
			}
			s2[idx[i]] = now;
		}
		return sais(s2, now);
	}

	public static int[] suffixArray(char[] s) {
		int n = s.length;
		int[] s2 = new int[n];
		for (int i = 0; i < n; i++) {
			s2[i] = s[i];
		}
		return sais(s2, 255);
	}

	public static int[] suffixArray(java.lang.String s) {
		return suffixArray(s.toCharArray());
	}

	public static int[] lcpArray(int[] s, int[] sa) {
		int n = s.length;
		assert (n >= 1);
		int[] rnk = new int[n];
		for (int i = 0; i < n; i++) {
			rnk[sa[i]] = i;
		}
		int[] lcp = new int[n - 1];
		int h = 0;
		for (int i = 0; i < n; i++) {
			if (h > 0) h--;
			if (rnk[i] == 0) {
				continue;
			}
			int j = sa[rnk[i] - 1];
			for (; j + h < n && i + h < n; h++) {
				if (s[j + h] != s[i + h]) break;
			}
			lcp[rnk[i] - 1] = h;
		}
		return lcp;
	}

	public static int[] lcpArray(char[] s, int[] sa) {
		int n = s.length;
		int[] s2 = new int[n];
		for (int i = 0; i < n; i++) {
			s2[i] = s[i];
		}
		return lcpArray(s2, sa);
	}

	public static int[] lcpArray(java.lang.String s, int[] sa) {
		return lcpArray(s.toCharArray(), sa);
	}

	public static int[] zAlgorithm(int[] s) {
		int n = s.length;
		if (n == 0) return new int[0];
		int[] z = new int[n];
		for (int i = 1, j = 0; i < n; i++) {
			int k = j + z[j] <= i ? 0 : Math.min(j + z[j] - i, z[i - j]);
			while (i + k < n && s[k] == s[i + k]) k++;
			z[i] = k;
			if (j + z[j] < i + z[i]) j = i;
		}
		z[0] = n;
		return z;
	}

	public static int[] zAlgorithm(char[] s) {
		int n = s.length;
		if (n == 0) return new int[0];
		int[] z = new int[n];
		for (int i = 1, j = 0; i < n; i++) {
			int k = j + z[j] <= i ? 0 : Math.min(j + z[j] - i, z[i - j]);
			while (i + k < n && s[k] == s[i + k]) k++;
			z[i] = k;
			if (j + z[j] < i + z[i]) j = i;
		}
		z[0] = n;
		return z;
	}

	public static int[] zAlgorithm(String s) {
		return zAlgorithm(s.toCharArray());
	}
}
public class Main {
	static void solve() {
		String s = ns();
		int[] sa = StringAlgorithm.suffixArray(s);
		int[] lcp = StringAlgorithm.lcpArray(s, sa);
		int n = s.length();
		long ans = (long)n*(n+1)/2;//lとrの決め方が部分文字列の全体数
		for(int v : lcp) {
			ans -= v;
		}
		out.println(ans);
	}	
	//constants
	static final int inf = Integer.MAX_VALUE / 2;
	static final long linf = Long.MAX_VALUE / 3;
	static final double dinf = Double.MAX_VALUE / 3;
	static final long mod = (long) 1e9 + 7;
	static final int[] dx = { -1, 0, 1, 0 }, dy = { 0, -1, 0, 1 }, dx8 = { -1, -1, -1, 0, 0, 1, 1, 1 }, dy8 = { -1, 0, 1, -1, 1, -1, 0, 1 };
	static final double eps = 1e-10;
	
	//libraries
	static long[] cum(int a[]) {
		long[] cum = new long[a.length + 1];
		for(int i=0;i<a.length;i++) cum[i+1] = cum[i] + a[i];
		return cum;
	}
	static long[] cum(long a[]) {
		long[] cum = new long[a.length + 1];
		for(int i=0;i<a.length;i++) cum[i+1] = cum[i] + a[i];
		return cum;
	}
	static void reverse(int ar[]) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			int t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static void reverse(long ar[]) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			long t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static void reverse(double ar[]) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			double t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static void reverse(char ar[]) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			char t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static String getReverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
	static <T> void reverse(T[] ar) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			T t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static int[] concat(int x, int arr[]) {
		int ret[] = new int[arr.length + 1];
		System.arraycopy(arr, 0, ret, 1, ret.length - 1);
		ret[0] = x;
		return ret;
	}
	static int[] concat(int arr[], int x) {
		int ret[] = new int[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}
	static long[] concat(long x, long arr[]) {
		long ret[] = new long[arr.length + 1];
		System.arraycopy(arr, 0, ret, 1, ret.length - 1);
		ret[0] = x;
		return ret;
	}
	static long[] concat(long arr[], long x) {
		long ret[] = new long[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}
	static char[] concat(char x, char arr[]) {
		char ret[] = new char[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}
	static char[] concat(char arr[], char x) {
		char ret[] = new char[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}
	static int max(int x, int y) {
		return Math.max(x, y);
	}
	static int min(int x, int y) {
		return Math.min(x, y);
	}
	static int max(int x, int y, int z) {
		x = Math.max(x, y);
		x = Math.max(x, z);
		return x;
	}
	static int min(int x, int y, int z) {
		x = Math.min(x, y);
		x = Math.min(x, z);
		return x;
	}
	static long max(long x, long y) {
		return Math.max(x, y);
	}
	static long min(long x, long y) {
		return Math.min(x, y);
	}
	static long max(long x, long y, long z) {
		x = Math.max(x, y);
		x = Math.max(x, z);
		return x;
	}
	static long min(long x, long y, long z) {
		x = Math.min(x, y);
		x = Math.min(x, z);
		return x;
	}
	static double max(double x, double y) {
		return Math.max(x, y);
	}
	static double min(double x, double y) {
		return Math.min(x, y);
	}
	static double max(double x, double y, double z) {
		x = Math.max(x, y);
		x = Math.max(x, z);
		return x;
	}
	static double min(double x, double y, double z) {
		x = Math.min(x, y);
		x = Math.min(x, z);
		return x;
	}
	static void sort(int[] ar) {
		Arrays.sort(ar);
	}
	static void sort(long[] ar) {
		Arrays.sort(ar);
	}
	static void sort(double[] ar) {
		Arrays.sort(ar);
	}
	static void sort(char[] ar) {
		Arrays.sort(ar);
	}
	static void rsort(int[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			int tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}
	static void rsort(long[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			long tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}
	static void rsort(double[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			double tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}
	static void rsort(char[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			char tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}
	static void fill(int arr[], int x) {
		Arrays.fill(arr, x);
	}
	static void fill(long arr[], long x) {
		Arrays.fill(arr, x);
	}
	static void fill(boolean arr[], boolean x) {
		Arrays.fill(arr, x);
	}
	static void fill(double arr[], double x) {
		Arrays.fill(arr, x);
	}
	static void fill(int arr[][], int x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}
	static void fill(long arr[][], long x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}
	static void fill(double arr[][], double x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}
	static void fill(boolean arr[][], boolean x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}
	//MOD culc
	static long plus(long x, long y) {
		long res = (x + y) % mod;
		return res < 0 ? res + mod : res;
	}
	static long sub(long x, long y) {
		long res = (x - y) % mod;
		return res < 0 ? res + mod : res;
	}
	static long mul(long x, long y) {
		long res = (x * y) % mod;
		return res < 0 ? res + mod : res;
	}
	static long div(long x, long y) {
		long res = x * pow(y, mod - 2) % mod;
		return res < 0 ? res + mod : res;
	}
	static long pow(long x, long y) {
		if (y < 0)
			return 0;
		if (y == 0)
			return 1;
		if (y % 2 == 1)
			return (x * pow(x, y - 1)) % mod;
		long root = pow(x, y / 2);
		return root * root % mod;
	}
	public static void main(String[] args) throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		solve();
		out.flush();
	}
	//input
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	private static byte[] inbuf = new byte[1024];
	static int lenbuf = 0, ptrbuf = 0;
	private static int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}
	private static boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}
	private static int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}
	@SuppressWarnings("unused")
	private static double nd() {
		return Double.parseDouble(ns());
	}
	@SuppressWarnings("unused")
	private static char nc() {
		return (char) skip();
	}
	private static String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	private static char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n && !(isSpaceChar(b))) {
			buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}
	@SuppressWarnings("unused")
	private static char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}
	@SuppressWarnings("unused")
	private static int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}
	@SuppressWarnings("unused")
	private static long[] nla(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nl();
		return a;
	}
	@SuppressWarnings("unused")
	private static int[][] na(int n, int m){
		int[][] res = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				res[i][j] = ni();
			}
		}
		return res;
	}
	@SuppressWarnings("unused")
	private static long[][] nla(int n, int m){
		long[][] res = new long[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				res[i][j] = nl();
			}
		}
		return res;
	}
	private static int ni() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		
		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	private static long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		
		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
}
