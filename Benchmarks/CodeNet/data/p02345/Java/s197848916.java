import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int q = Integer.parseInt(str[1]);

		int a[] = new int[n];
		Arrays.fill(a, Integer.MAX_VALUE);

		SegmentTree st = new SegmentTree(a);

		for (int i = 0; i < q; i++) {
			str = br.readLine().split(" ");

			int com = Integer.parseInt(str[0]);
			int x = Integer.parseInt(str[1]);
			int y = Integer.parseInt(str[2]);

			if (com == 0) {
				st.update(x, y);
			} else {
				System.out.println(st.query(x, y + 1));
			}
		}
	}

}

class SegmentTree {

	int N;
	int[] origin;
	int[] tree;

	int INT_MAX = Integer.MAX_VALUE;

	SegmentTree(int[] original) {
		this.origin = Arrays.copyOf(original, original.length);
		int n = origin.length;
		this.N = 1;
		while (N < n)
			N *= 2;
		this.tree = new int[N * 2];
		for (int i = 0; i < N * 2; i++) {
			tree[i] = INT_MAX;
		}
		build();
	}

	// O(N)
	void build() {
		for (int i = 0; i < origin.length; i++) {
			update(i, origin[i]);
		}
	}

	// i番目の値をxに更新 O(log N)
	void update(int i, int x) {
		i += N - 1;
		tree[i] = x;
		while (i > 0) {
			i = (i - 1) / 2;
			tree[i] = marge(tree[i * 2 + 1], tree[i * 2 + 2]);
		}
	}

	// O(log N);
	int query(int start, int end) {
		return query(start, end, 0, 0, N);
	}

	// [a, b)の最小値、l, rにはノードkに対応する区間を与える
	private int query(int a, int b, int k, int l, int r) {
		if (r <= a || b <= l)
			return INT_MAX;

		if (a <= l && r <= b) {
			return tree[k];
		} else {
			int lv = query(a, b, 2 * k + 1, l, (l + r) / 2);
			int rb = query(a, b, 2 * k + 2, (l + r) / 2, r);
			return marge(lv, rb);
		}
	}

	private int marge(int l, int r) {
		return Math.min(l, r);
	}

}
