import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;

class SegmentTree<T> {

	private List<T> nodes;
	private T e; // 単位元
	private int n;
	private BinaryOperator<T> operator;

	/**
	 * セグメント木を生成
	 * 
	 * @param n  要素数
	 * @param e  単位元
	 * @param op
	 */
	public SegmentTree(int n, T e, BinaryOperator<T> op) {
		this.e = e;
		this.operator = op;

		n = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(n - 1, 0))); // n以上で最小の2のべき乗
		this.n = n;

		nodes = new ArrayList<>(2 * n - 1);
		for (int i = 0; i < 2 * n - 1; i++) {
			nodes.add(e);
		}
	}

	//
	public void update(int k, T val) {
		k += n - 1;
		nodes.set(k, val);

		while (k > 0) {
			k = (k - 1) / 2;
			nodes.set(k, operator.apply(nodes.get(2 * k + 1), nodes.get(2 * k + 2)));
		}
	}

	// 区間 [a,b) のoperatorの結果を返す
	// 0-indexed
	public T query(int a, int b) {
		return query(a, b, 0, 0, n);
	}

	private T query(int a, int b, int k, int l, int r) {
		if (a >= r || b <= l) {
			return e;
		}

		if (a <= l && r <= b) {
			return nodes.get(k);
		}

		T vl = query(a, b, 2 * k + 1, l, (l + r) / 2);
		T vr = query(a, b, 2 * k + 2, (l + r) / 2, r);
		return operator.apply(vl, vr);
	}

}

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();
		int q = sc.nextInt();

		SegmentTree<Integer> seg = new SegmentTree<>(n, (1 << 31) - 1, (a, b) -> Math.min(a, b));

		for (int i = 0; i < q; i++) {
			int com = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			switch (com) {
			case 0:
				seg.update(x, y);
				break;
			case 1:
				out.println(seg.query(x, y + 1)); // [x,y] なので半開区間にする
				break;
			}
		}

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}

