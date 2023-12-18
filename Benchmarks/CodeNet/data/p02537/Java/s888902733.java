import java.io.*;
import java.util.*;

class SegTree<S> {
	final int MAX;
	
	final int N;
	final java.util.function.BinaryOperator<S> op;
	final S E;
	
	final S[] data;
	
	@SuppressWarnings("unchecked")
	public SegTree(int n, java.util.function.BinaryOperator<S> op, S e) {
		this.MAX = n;
		int k = 1;
		while (k < n) k <<= 1;
		this.N = k;
		this.E = e;
		this.op = op;
		this.data = (S[]) new Object[N << 1];
		java.util.Arrays.fill(data, E);
	}
	
	public SegTree(S[] dat, java.util.function.BinaryOperator<S> op, S e) {
		this(dat.length, op, e);
		build(dat);
	}
	
	private void build(S[] dat) {
		int l = dat.length;
		System.arraycopy(dat, 0, data, N, l);
		for (int i = N - 1; i > 0; i--) {
			data[i] = op.apply(data[i << 1 | 0], data[i << 1 | 1]);
		}
	}
	
	public void set(int p, S x) {
		exclusiveRangeCheck(p);
		data[p += N] = x;
		p >>= 1;
			while (p > 0) {
				data[p] = op.apply(data[p << 1 | 0], data[p << 1 | 1]);
				p >>= 1;
			}
	}
	
	public S get(int p) {
		exclusiveRangeCheck(p);
		return data[p + N];
	}
	
	public S prod(int l, int r) {
		if (l > r) {
			throw new IllegalArgumentException(
					String.format("Invalid range: [%d, %d)", l, r)
					);
		}
		inclusiveRangeCheck(l);
		inclusiveRangeCheck(r);
		S sumLeft = E;
		S sumRight = E;
		l += N; r += N;
		while (l < r) {
			if ((l & 1) == 1) sumLeft = op.apply(sumLeft, data[l++]);
			if ((r & 1) == 1) sumRight = op.apply(data[--r], sumRight);
			l >>= 1; r >>= 1;
		}
		return op.apply(sumLeft, sumRight);
	}
	
	public S allProd() {
		return data[1];
	}
	
	public int maxRight(int l, java.util.function.Predicate<S> f) {
		inclusiveRangeCheck(l);
		if (!f.test(E)) {
			throw new IllegalArgumentException("Identity element must satisfy the condition.");
		}
		if (l == MAX) return MAX;
		l += N;
		S sum = E;
		do {
			l >>= Integer.numberOfTrailingZeros(l);
		if (!f.test(op.apply(sum, data[l]))) {
			while (l < N) {
				l = l << 1;
				if (f.test(op.apply(sum, data[l]))) {
					sum = op.apply(sum, data[l]);
					l++;
				}
			}
			return l - N;
		}
		sum = op.apply(sum, data[l]);
		l++;
		} while ((l & -l) != l);
		return MAX;
	}
	
	public int minLeft(int r, java.util.function.Predicate<S> f) {
		inclusiveRangeCheck(r);
		if (!f.test(E)) {
			throw new IllegalArgumentException("Identity element must satisfy the condition.");
		}
		if (r == 0) return 0;
		r += N;
		S sum = E;
		do {
			r--;
			while (r > 1 && (r & 1) == 1) r >>= 1;
				if (!f.test(op.apply(data[r], sum))) {
					while (r < N) {
						r = r << 1 | 1;
						if (f.test(op.apply(data[r], sum))) {
							sum = op.apply(data[r], sum);
							r--;
						}
					}
					return r + 1 - N;
				}
				sum = op.apply(data[r], sum);
		} while ((r & -r) != r);
		return 0;
	}
	
	private void exclusiveRangeCheck(int p) {
		if (p < 0 || p >= MAX) {
			throw new IndexOutOfBoundsException(
					String.format("Index %d out of bounds for the range [%d, %d).", p, 0, MAX)
					);
		}
	}
	
	private void inclusiveRangeCheck(int p) {
		if (p < 0 || p > MAX) {
			throw new IndexOutOfBoundsException(
					String.format("Index %d out of bounds for the range [%d, %d].", p, 0, MAX)
					);
		}
	}
	
	// **************** DEBUG **************** //
	
	private int indent = 6;
	
	public void setIndent(int newIndent) {
		this.indent = newIndent;
	}
	
	@Override
	public String toString() {
		return toSimpleString();
	}
	
	public String toDetailedString() {
		return toDetailedString(1, 0);
	}
	
	private String toDetailedString(int k, int sp) {
		if (k >= N) return indent(sp) + data[k];
		String s = "";
		s += toDetailedString(k << 1 | 1, sp + indent);
		s += "\n";
		s += indent(sp) + data[k];
		s += "\n";
		s += toDetailedString(k << 1 | 0, sp + indent);
		return s;
	}
	
	private static String indent(int n) {
		StringBuilder sb = new StringBuilder();
		while (n --> 0) sb.append(' ');
		return sb.toString();
	}
	
	public String toSimpleString() {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for (int i = 0; i < N; i++) {
			sb.append(data[i + N]);
			if (i < N - 1) sb.append(',').append(' ');
		}
		sb.append(']');
		return sb.toString();
	}
}


public class Main {
	static void solve() {
		int n = ni(), k = ni();
		var data = new Integer[300300];
		for(int i=0;i<300300;i++)data[i] = 0;
		var seg = new SegTree<Integer>(data, Integer::max, -inf);
		for(int i=0;i<n;i++) {
			int a = ni() - 1;
			int l = max(0, a - k);
			int r = min(300200, a + k + 1);
			int max = seg.prod(l, r);
			seg.set(a, max + 1);
		}
		out.println(seg.allProd());
	}	
	
	//constants
	static final int inf = Integer.MAX_VALUE / 2;
	static final long linf = Long.MAX_VALUE / 3;
	static final double dinf = Double.MAX_VALUE / 3;
	static final long mod =  998244353;
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
