import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {

		// Scanner scan = new Scanner(System.in);
		UserScanner scan = new UserScanner();
		PrintWriter pwriter = new PrintWriter(System.out);

		int n = scan.nextInt();
		KDTree kdt = new KDTree(n, false);

		for (int i = 0; i < n; i++)
			kdt.add(i, scan.nextInt(), scan.nextInt());

		kdt.build();

		int[] ans;

		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			ans = kdt.judge(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
			for (int j = 1; j < ans[0]; j++)
				pwriter.println(ans[j]);
			pwriter.println();
		}
		pwriter.flush();
		scan.close();
		System.exit(0);
	}
}

class KDTree {
	boolean debug;

	class Pt {
		int id;
		int x, y;
		// Integer parent;
		boolean xJudge;
		int leftC, rightC;

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
		ans = new int[n + 1];
	}

	int[] ans;

	public int[] judge(int sx, int tx, int sy, int ty) {
		ans[0] = 1;
		countIn(root, sx, tx, sy, ty);
		Arrays.sort(ans, 1, ans[0]);
		return ans;
	}

	private int countIn(int p, int sx, int tx, int sy, int ty) {
		if (p == Integer.MAX_VALUE)
			return 0;
		int r = 0;
		if (pt[p].x >= sx && pt[p].x <= tx && pt[p].y >= sy && pt[p].y <= ty) {
			ans[ans[0]++] = pt[p].id;
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
		root = buildTree(0, pt.length, Integer.MAX_VALUE, true, 0);

		// if (debug)
		// for (int i = 0; i < pt.length; i++)
		// System.out.println(
		// i + "\tx " + pt[i].x + "\ty " + pt[i].y + "\tl " + pt[i].leftC + "\tr
		// " + pt[i].rightC);
	}

	private int buildTree(int st, int len, int parent, boolean xjudge, int depth) {
		if (len == 0)
			return Integer.MAX_VALUE;
		if (len == 1) {
			// pt[st].parent = parent;
			pt[st].xJudge = xjudge;
			pt[st].leftC = Integer.MAX_VALUE;
			pt[st].rightC = Integer.MAX_VALUE;
			return st;
		}

		int mid;
		mid = pt[st].key(xjudge) / 3 + pt[st + len - 1].key(xjudge) / 3 + pt[st + len / 2].key(xjudge) / 3;
		if (mid < pt[st + len / 2].key(xjudge))
			mid = pt[st + len / 2].key(xjudge);
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

		// pt[lp].parent = parent;
		pt[lp].xJudge = xjudge;
		pt[lp].leftC = buildTree(st, lp - st, lp, !xjudge, depth + 1);
		pt[lp].rightC = buildTree(lp + 1, len - (lp - st) - 1, lp, !xjudge, depth + 1);
		return lp;
	}
}

class UserScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean read() throws IOException {
		ptr = 0;
		buflen = in.read(buffer);
		if (buflen <= 0)
			return false;
		else
			return true;
	}

	private byte getByte() throws IOException {
		if (ptr >= buflen)
			read();
		if (isCtlSpace(buffer[ptr])) {
			return -1;
		} else
			return buffer[ptr++];
	}

	private void skipCtlSpace() throws IOException {
		if (ptr >= buflen)
			read();
		if (isCtlSpace(buffer[ptr])) {
			ptr++;
			skipCtlSpace();
		}
	}

	private boolean isCtlSpace(byte b) {
		if (b <= ' ' || b > '~')
			return true;
		else
			return false;
	}

	public void close() throws IOException {
		in.close();
	}

	public String next() throws IOException {
		skipCtlSpace();
		StringBuilder sb = new StringBuilder();
		byte b;
		while ((b = getByte()) != -1) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() throws IOException {
		skipCtlSpace();
		int n = 0;
		boolean minus = false;
		byte b;
		while ((b = getByte()) != -1) {
			if (b == '-')
				minus = true;
			else {
				n *= 10;
				n += (b - '0');
			}
		}
		if (minus)
			return n * -1;
		else
			return n;
	}
}