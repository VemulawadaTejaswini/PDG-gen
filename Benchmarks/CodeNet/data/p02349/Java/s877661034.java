import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

class LazySegmentTree {
	int[] nodes;
	int[] lazy;

	int n;
	int e = 0; // 単位元

	public LazySegmentTree(int size) {
		n = 1;
		while (n < size) {
			n *= 2;
		}

		nodes = new int[2 * n - 1];
		lazy = new int[2 * n - 1];

		Arrays.fill(nodes, e);
		Arrays.fill(lazy, e);
	}

	public void eval(int k) {
		if (lazy[k] == e) {
			return;
		}

		// 葉でないなら
		if (k < n - 1) {
			lazy[2 * k + 1] += lazy[k];
			lazy[2 * k + 2] += lazy[k];
		}

		nodes[k] += lazy[k];
		lazy[k] = 0;
	}

	public void add(int a, int b, int val) {
		add(a, b, val, 0, 0, n);
	}

	private void add(int a, int b, int val, int k, int l, int r) {
		// [l,r) が[a,b) に含まれていない場合
		if (a >= r || b <= l) {
			return;
		}

		eval(k);

		if (a <= l && r <= b) {
			lazy[k] += val;
			eval(k);
			return;
		}

		add(a, b, val, 2 * k + 1, l, (l + r) / 2);
		add(a, b, val, 2 * k + 2, (l + r) / 2, r);

		nodes[k] = Math.max(nodes[2 * k + 1], nodes[2 * k + 2]);
	}

	public int query(int a, int b) {
		return query(a, b, 0, 0, n);
	}

	private int query(int a, int b, int k, int l, int r) {
		if (a >= r || b <= l) {
			return e;
		}
		eval(k);
		if (a <= l && r <= b) {
			return nodes[k];
		}

		int vl = query(a, b, 2 * k + 1, l, (l + r) / 2);
		int vr = query(a, b, 2 * k + 2, (l + r) / 2, r);

		return Math.max(vl, vr);

	}
	
}

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();
		int q = sc.nextInt();

		LazySegmentTree seg = new LazySegmentTree(n);

		for (int i = 0; i < q; i++) {
			int c = sc.nextInt();

			if (c == 0) {
				int s = sc.nextInt() - 1;
				int t = sc.nextInt();
				int x = sc.nextInt();

				seg.add(s, t, x);

			} else {
				int a = sc.nextInt() - 1;
				out.println(seg.query(a, a + 1));
			}
		}

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}

