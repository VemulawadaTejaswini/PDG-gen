// package beginner00179;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	private static PrintWriter out;

	public static void solve() {
		In in = new In();
		// BEFORE SUBMISSION :: Change class name to Main and comment out package name
		// !!!
		int n = in.ni();
		int k = in.ni();
		int[][] a = in.nim(k, 2);

		SegmentTreeSumLazy st = new SegmentTreeSumLazy(n + 1);
		st.update(1, 1);

		for (int i = 1; i < n; i++) {
			for (int[] interval : a) {
				int lo = i + interval[0];
				int hi = Math.min(n, i + interval[1]);
				if (lo > n)
					continue;
				st.update(lo, hi, st.query(i, i));
			}
		}
		out.println(st.query(n, n));
	}

	static class SegmentTreeSumLazy {
		final long mod = 998244353;
		private Node root;

		public SegmentTreeSumLazy(int min, int max) {
			root = new Node(min, max, 0);
		}

		public SegmentTreeSumLazy(int n) {
			root = new Node(0, n - 1, 0);
		}

		public SegmentTreeSumLazy(int[] nums) {
			int n = nums.length;
			root = new Node(0, n - 1, 0);
			for (int i = 0; i < n; i++)
				update(i, nums[i]);
		}

		public void update(int qmin, int qmax, long val) {
			validate(qmin);
			validate(qmax);
			root = update(root, qmin, qmax, val);

		}

		public void update(int i, long val) {
			validate(i);
			update(i, i, val);
		}

		private Node update(Node node, int qmin, int qmax, long val) {
			if (qmin > qmax || node == null || !node.intersects(qmin, qmax))
				return node;

			if (node.coveredBy(qmin, qmax)) {
				node.val += val * (node.max - node.min + 1);
				node.val %= mod;
				node.lazyVal += val;
				node.lazyVal %= mod;
				return node;
			}

			node = propagate(node);

			node.lChild = update(node.lChild, qmin, qmax, val);
			node.rChild = update(node.rChild, qmin, qmax, val);

			node.val = (node.lChild.val + node.rChild.val) % mod;

			return node;
		}

		public long query(int qmin, int qmax) {
			return query(root, qmin, qmax);
		}

		public String toString() {
			return root.toString();
		}
		// ================================================================================
		// PRIVATE METHODS
		// ================================================================================

		private void validate(int point) {
			assert point >= root.min;
			assert point <= root.max;
		}

		private Node propagate(Node node) {
			assert node != null;
			if (node.min < node.max) {
				if (node.lChild == null || node.rChild == null) {
					int mid = node.min + (node.max - node.min) / 2;
					node.lChild = new Node(node.min, mid,
							((mid - node.min + 1) * node.lazyVal) % mod);
					node.lChild.lazyVal = node.lazyVal;
					node.rChild = new Node(mid + 1, node.max,
							((node.max - mid) * node.lazyVal) % mod);
					node.rChild.lazyVal = node.lazyVal;
				} else if (node.lazyVal != 0) {
					node.lChild.val += ((node.lChild.max - node.lChild.min + 1) * node.lazyVal)
							% mod;
					node.lChild.val %= mod;
					node.lChild.lazyVal += node.lazyVal;
					node.lChild.lazyVal %= mod;
					node.rChild.val += ((node.rChild.max - node.rChild.min + 1) * node.lazyVal)
							% mod;
					node.rChild.val %= mod;
					node.rChild.lazyVal += node.lazyVal;
					node.rChild.lazyVal %= mod;
				}
			}
			node.lazyVal = 0;
			return node;
		}

		private long query(Node node, int qmin, int qmax) {
			if (qmin > qmax || node == null || !node.intersects(qmin, qmax))
				return 0;
			if (node.coveredBy(qmin, qmax))
				return node.val;
			propagate(node);
			return (query(node.lChild, qmin, qmax) + query(node.rChild, qmin, qmax)) % mod;
		}

		// ================================================================================
		// NESTED CLASSES
		// ================================================================================
		class Node {
			final int min;
			final int max;
			Node lChild;
			Node rChild;
			long val;
			long lazyVal;

			public Node(int min, int max, long val) {
				this.min = min;
				this.max = max;
				this.val = val;
			}

			private boolean coveredBy(int qmin, int qmax) {
				return qmin <= min && qmax >= max;
			}

			private boolean intersects(int qmin, int qmax) {
				return qmin <= max && min <= qmax;
			}

			public String toString() {
				return toString("  ", 0);
			}

			private String toString(String indent, int level) {
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < level; i++)
					sb.append(indent);
				sb.append("Node[ range=[");
				sb.append(min);
				sb.append(",");
				sb.append(max);
				sb.append("] value=[");
				sb.append(val);
				sb.append("] lazy=[");
				sb.append(lazyVal);
				sb.append("] ]");
				sb.append("\n");
				if (lChild != null)
					sb.append(lChild.toString(indent, level + 1));
				if (rChild != null)
					sb.append(rChild.toString(indent, level + 1));
				return sb.toString();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// long start = System.nanoTime();
		out = new PrintWriter(System.out);
		solve();
		out.flush();
		// System.out.println("Elapsed: " + (System.nanoTime() - start) / 1000000 +
		// "ns");
	}

	@SuppressWarnings("unused")
	private static class In {
		final private static int BUFFER_SIZE = 1024;
		private byte[] buf;
		private InputStream is;
		private int buflen;
		private int bufptr;

		public In() {
			is = System.in;
			buf = new byte[BUFFER_SIZE];
			buflen = bufptr = 0;
		}

		public In(String input) {
			is = new ByteArrayInputStream(input.getBytes());
			buf = new byte[BUFFER_SIZE];
			buflen = bufptr = 0;
		}

		public int readByte() {
			if (bufptr >= buflen) {
				try {
					buflen = is.read(buf);
				} catch (IOException ioe) {
					throw new InputMismatchException();
				}
				bufptr = 0;
			}
			if (buflen <= 0)
				return -1;
			return buf[bufptr++];
		}

		public boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		public int skip() {
			int b;
			while ((b = readByte()) != -1 && isSpaceChar(b))
				;
			return b;
		}

		/* Next character */
		public char nc() {
			return (char) skip();
		}

		/* Next double */
		public double nd() {
			return Double.parseDouble(ns());
		}

		/* Next string */
		public String ns() {
			final StringBuilder sb = new StringBuilder();
			int b = skip();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		/* Next integer */
		public int ni() {
			boolean minus = false;
			int num = 0;
			int b;
			while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
				;
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			while (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
				b = readByte();
			}
			return minus ? -num : num;
		}

		/* Next long */
		public long nl() {
			boolean minus = false;
			long num = 0;
			int b;
			while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
				;
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			while (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
				b = readByte();
			}
			return minus ? -num : num;
		}

		/* Next integer 1D array */
		public int[] nia(int n) {
			final int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = ni();
			return arr;
		}

		/* Next long 1D array */
		public long[] nla(int n) {
			final long[] arr = new long[n];
			for (int i = 0; i < n; i++)
				arr[i] = nl();
			return arr;
		}

		/* Next string 1D array */
		public String[] nsa(int n) {
			final String[] arr = new String[n];
			for (int i = 0; i < n; i++)
				arr[i] = ns();
			return arr;
		}

		/* Next char 1D array */
		public char[] nca(int n) {
			final char[] arr = new char[n];
			for (int i = 0; i < n; i++)
				arr[i] = nc();
			return arr;
		}

		/* Next double 1D array */
		public double[] nda(int n) {
			final double[] arr = new double[n];
			for (int i = 0; i < n; i++)
				arr[i] = nc();
			return arr;
		}

		/* Next integer matrix */
		public int[][] nim(int n, int m) {
			final int[][] arr = new int[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					arr[i][j] = ni();
			return arr;
		}

		/* Next long matrix */
		public long[][] nlm(int n, int m) {
			final long[][] arr = new long[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					arr[i][j] = nl();
			return arr;
		}

		/* Next string matrix */
		public String[][] nsm(int n, int m) {
			final String[][] arr = new String[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					arr[i][j] = ns();
			return arr;
		}

		/* Next char matrix */
		public char[][] ncm(int n, int m) {
			final char[][] arr = new char[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					arr[i][j] = nc();
			return arr;
		}

		/* Next double matrix */
		public double[][] ndm(int n, int m) {
			final double[][] arr = new double[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					arr[i][j] = nd();
			return arr;
		}

		public static void log(Object... o) {
			System.out.println(Arrays.deepToString(o));
		}
	}

}
