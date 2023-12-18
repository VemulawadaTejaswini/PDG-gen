import static java.util.Arrays.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {

	static class RBST {

		static final int INF = 1001001001;
		static Random random = new Random();

		static class Node {
			Node l, r;
			int val;
			int size; // subtree size
			int min;
		}

		static final int POOL_SIZE = 200000 + 100;
		static int sp = 0;
		static Node[] pool;
		static {
			pool = new Node[POOL_SIZE];
			for (int i = 0; i < pool.length; i++) pool[i] = new Node();
		}
		static Node newNode(int val) {
			Node t = pool[sp++];
			t.l = t.r = null;
			t.size = 1;
			t.val = val;
			t.min = val;
			return t;
		}
		private static final Node[] EP = new Node[2];
		static int size(Node t) { return t == null ? 0 : t.size; }
		static int min(Node t) { return t == null ? INF : t.min; }

		static Node update(Node t) {
			t.size = size(t.l) + size(t.r) + 1;
			t.min = Math.min(Math.min(min(t.l), min(t.r)), t.val);
			return t;
		}
		static Node merge(Node t1, Node t2) {
			if (t1 == null) return t2;
			if (t2 == null) return t1;
			if (random.nextInt(t1.size + t2.size) < t1.size) {
				t1.r = merge(t1.r, t2);
				return update(t1);
			} else {
				t2.l = merge(t1, t2.l);
				return update(t2);
			}
		}

		// [a, b)
		static int min(Node t, int a, int b) {
			if (t == null) return INF;
			if (a <= 0 && size(t) <= b) {
				return t.min;
			}
			int res = INF;
			if (a < size(t.l)) {
				int x = min(t.l, a, b);
				if (res > x) res = x;
			}
			if (a <= size(t.l) && size(t.l) < b) {
				if (res > t.val) res = t.val;
			}
			if (b >= size(t.l) + 1) {
				int x = min(t.r, a - size(t.l) - 1, b - size(t.l) - 1);
				if (res > x) res = x;
			}
			return res;
		}

		static Node[] split(Node t, int k) { // [0, k), [k, n)
			if (t == null) return EP;
			if (k <= size(t.l)) {
				Node[] s = split(t.l, k);
				t.l = s[1];
				return new Node[] {s[0], update(t)};
			} else {
				Node[] s = split(t.r, k - size(t.l) - 1);
				t.r = s[0];
				return new Node[] {update(t), s[1]};
			}
		}
		static Node insert(Node t, int k, int val) {
			Node[] s = split(t, k);
			return merge(merge(s[0], newNode(val)), s[1]);
		}
		// [0, n) -> [0, k) + [k+1, n)
		static Node erase(Node t, int k) {
			Node[] s = split(t, k);
			Node[] s2 = split(s[1], 1);
			return merge(s[0], s2[1]);
		}
		static void changeVal(Node t, int k, int val) {
			if (t == null) return;
			if (size(t.l) > k)
				changeVal(t.l, k, val);
			else if (size(t.l) == k)
				t.val = val;
			else
				changeVal(t.r, k - size(t.l) - 1, val);
			update(t);
		}
		static Node rot(Node t, int a, int b) {
			Node[] r1 = split(t, a);
			Node[] r2 = split(r1[1], b - a - 1);
			Node[] r3 = split(r2[1], 1);
			return merge(merge(r1[0], r3[0]), merge(r2[0], r3[1]));
		}
	}

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	void solve() {
		int n = sc.nextInt();
		int q = sc.nextInt();

		RBST.Node tree = null;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			tree = RBST.insert(tree, i, x);
		}

		for (int qi = 0; qi < q; qi++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			if (x == 0) {
				tree = RBST.rot(tree, y, z + 1);
			} else if (x == 1) {
				int res = RBST.min(tree, y, z + 1);
				out.println(res);
			} else if (x == 2) {
				RBST.changeVal(tree, y, z);
			}

		}
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	MyScanner sc = null;
	PrintWriter out = null;
	public void run() throws Exception {
		sc = new MyScanner(System.in);
		out = new PrintWriter(System.out);
		for (;sc.hasNext();) {
			solve();
			out.flush();
		}
		out.close();
	}

	class MyScanner {
		String line;
		BufferedReader reader;
		StringTokenizer tokenizer;

		public MyScanner(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}
		public void eat() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					line = reader.readLine();
					if (line == null) {
						tokenizer = null;
						return;
					}
					tokenizer = new StringTokenizer(line);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
		public String next() {
			eat();
			return tokenizer.nextToken();
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		public boolean hasNext() {
			eat();
			return (tokenizer != null && tokenizer.hasMoreElements());
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++) a[i] = nextInt();
			return a;
		}
	}
}