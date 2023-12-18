import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		KDTree kdt = new KDTree(n, false);

		for (int i = 0; i < n; i++)
			kdt.add(i, scan.nextInt(), scan.nextInt());

		kdt.build();

		int q = scan.nextInt();
		for (int i = 0; i < q; i++)
			kdt.judge(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());

		scan.close();
		System.exit(0);
	}
}

class KDTree {
	boolean debug;

	class Pt {
		Integer id;
		int x, y;
		Integer parent;
		boolean xJudge;
		Integer leftC, rightC;

		public Pt(int id, int x, int y) {
			this.id = id;
			this.x = x;
			this.y = y;
		}

		public void swap(Pt p) {
			int t = x;
			x = p.x;
			p.x = t;
			t = y;
			y = p.y;
			p.y = t;
			t = id;
			id = p.id;
			p.id = t;
		}

		public int key(boolean xjudge) {
			if (xjudge)
				return this.x;
			else
				return this.y;
		}
	}

	Pt[] pt;
	int root;

	public KDTree(int n, boolean b) {
		debug = b;
		pt = new Pt[n];
	}

	public void judge(int sx, int tx, int sy, int ty) {
		answer.clear();
		countIn(root, sx, tx, sy, ty);
		answer.sort(null);
		for (int i = 0; i < answer.size(); i++)
			System.out.println(answer.get(i));
		System.out.println();
	}

	List<Integer> answer = new ArrayList<Integer>();

	private int countIn(Integer p, int sx, int tx, int sy, int ty) {
		if (p == null)
			return 0;
		int r = 0;
		if (pt[p].x >= sx && pt[p].x <= tx && pt[p].y >= sy && pt[p].y <= ty) {
			answer.add(pt[p].id);
			r++;
		}
		if (pt[p].xJudge) {
			if (pt[p].x >= sx)
				r += countIn(pt[p].leftC, sx, tx, sy, ty);
			if (pt[p].x < tx)
				r += countIn(pt[p].rightC, sx, tx, sy, ty);
		} else {
			if (pt[p].y >= sy)
				r += countIn(pt[p].leftC, sx, tx, sy, ty);
			if (pt[p].y < ty)
				r += countIn(pt[p].rightC, sx, tx, sy, ty);
		}
		return r;
	}

	public void add(int i, int x, int y) {
		pt[i] = new Pt(i, x, y);
	}

	public void build() {
		root = buildTree(0, pt.length, null, true, 0);

		if (debug)
			for (int i = 0; i < pt.length; i++)
				System.out.println(i + "\tx " + pt[i].x + "\ty " + pt[i].y + "\tp " + pt[i].parent + "\tl "
						+ pt[i].leftC + "\tr " + pt[i].rightC);
	}

	private Integer buildTree(int st, int len, Integer parent, boolean xjudge, int depth) {
		if (len == 0)
			return null;
		if (len == 1) {
			pt[st].parent = parent;
			pt[st].xJudge = xjudge;
			pt[st].leftC = null;
			pt[st].rightC = null;
			return st;
		}

		int mid;
		mid = pt[st].key(xjudge) / 3 + pt[st + len - 1].key(xjudge) / 3 + pt[st + len / 2].key(xjudge) / 3;
		int lp = st, rp = st + len - 1;
		while (true) {
			for (; lp != rp && pt[lp].key(xjudge) <= mid; lp++)
				if (lp > st && pt[lp - 1].key(xjudge) > pt[lp].key(xjudge))
					pt[lp - 1].swap(pt[lp]);
			for (; lp != rp && pt[rp].key(xjudge) > mid; rp--)
				;
			if (lp != rp) {
				pt[lp].swap(pt[rp]);
				continue;
			} else if (pt[lp].key(xjudge) > mid) {
				if (lp > st)
					lp--;
				break;
			} else {
				if (lp > st && pt[lp - 1].key(xjudge) > pt[lp].key(xjudge))
					pt[lp - 1].swap(pt[lp]);
				break;
			}
		}

		if (debug)
			System.out.println("depth " + depth + "\tlen " + len + "\tleft " + (lp - st) + "\tright "
					+ (len - lp + st - 1) + "\tsample " + pt[st].key(xjudge) + ":" + pt[st + len - 1].key(xjudge) + ":"
					+ pt[st + len / 2].key(xjudge));

		pt[lp].parent = parent;
		pt[lp].xJudge = xjudge;
		pt[lp].leftC = buildTree(st, lp - st, lp, !xjudge, depth + 1);
		pt[lp].rightC = buildTree(lp + 1, len - (lp - st) - 1, lp, !xjudge, depth + 1);
		return lp;
	}
}