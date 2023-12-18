import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

class SegmentTree {
	int[] node;
	int d = 0;
	int n;

	public SegmentTree(int[] arr) {
		int s = arr.length;
		int m = 2;
		while (s > m) {
			m *= 2;
		}
		this.n = m;
		node = new int[2 * n - 1];

		Arrays.fill(node, d);
		System.arraycopy(arr, 0, node, n - 1, arr.length);
		for (int i = n - 2; i >= 0; i--) {
			node[i] = node[2 * i + 1] + node[2 * i + 2];
		}
	}

	public void add(int i, int val) {
		int x = n - 1 + i;
		node[x] += val;

		while (x > 0) {
			x = (x - 1) / 2;
			node[x] = node[2 * x + 1] + node[2 * x + 2];
		}

	}

	// [a,b) の合計を返す
	public int getSum(int a, int b) {
		return getSum(a, b, 0, 0, n);
	}

	private int getSum(int a, int b, int k, int l, int r) {
		// 範囲がかぶっていなければ、単位元を返す
		if (r <= a || l >= b) {
			return d;
		}

		// 範囲が一致していれば、node[k]を返す
		if (a <= l && r <= b) {
			return node[k];
		}

		int vl = getSum(a, b, 2 * k + 1, l, (r + l) / 2);
		int vr = getSum(a, b, 2 * k + 2, (r + l) / 2, r);
		return vl + vr;
	}

}

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();
		int q = sc.nextInt();

		SegmentTree seg = new SegmentTree(new int[n]);

		for (int i = 0; i < q; i++) {
			int com = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (com == 0) {
				seg.add(x-1, y);
			} else { // com == 1
				int ans = seg.getSum(x-1, y);
				out.println(ans);
			}

		}

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}

