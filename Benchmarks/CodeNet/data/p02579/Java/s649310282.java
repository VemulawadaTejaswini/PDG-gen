import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	private static int h;
	private static int w;
	private static int ch;
	private static int cw;
	private static int dh;
	private static int dw;
	private static String[] s;
	private static Integer[][] res;

	private static class Point {
		final int h;
		final int w;

		Point(int inh, int inw) {
			h = inh;
			w = inw;
		}
	}
	private static Deque<Point> nxtLst = new ArrayDeque<Point>();

	private static Deque<Point> wpLst = new ArrayDeque<Point>();

	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		ch = sc.nextInt() - 1;
		cw = sc.nextInt() - 1;
		dh = sc.nextInt() - 1;
		dw = sc.nextInt() - 1;
		s = new String[h];
		res = new Integer[h][];
		for (int i = 0; i < h; i++) {
			s[i] = sc.next();
		}
		for (int i = 0; i < h; i++) {
			res[i] = new Integer[w];
			for (int j = 0; j < w; j++) {
				if (s[i].charAt(j) == '#') {
					res[i][j] = -1;
				}
			}
		}

		nxtLst.add(new Point(ch, cw));
		for (int pt = 0;; pt++) {
			if (nxtLst.size() <= 0) {
				System.out.println(-1);
				return;
			}
			for (Point e : nxtLst) {
				find(e.h, e.w, pt);
				Integer rtn = res[dh][dw];
				if (rtn != null && rtn >= 0) {
					System.out.println(rtn);
					return;
				}
			}
			nxtLst.clear();
			for (Point e : wpLst) {
				for (int i = -2; i <= 2; i++) {
					for (int j = -2; j <= 2; j++) {
						if (i == 0 && j == 0) {
							continue;
						}
						int wpH = e.h + i;
						int wpW = e.w + j;
						if (wpH < 0 || wpH >= h || wpW < 0 || wpW >= w) {
							continue;
						}
						if (res[wpH][wpW] != null) {
							continue;
						}
						res[wpH][wpW] = -2;
						nxtLst.add(new Point(wpH, wpW));
					}
				}
			}
			wpLst.clear();
		}

	}

	public static Integer find(int targetH, int targetW, int pt) {
		if (targetH < 0 || targetH >= h || targetW < 0 || targetW >= w) {
			return -1;
		}
		if (res[targetH][targetW] != null) {
			if (res[targetH][targetW] == -1) {
				return -2;
			}
			if (res[targetH][targetW] >= 0) {
				return res[targetH][targetW];
			}
		}
		res[targetH][targetW] = pt;
		boolean wpflg = false;
		if (find(targetH + 1, targetW, pt) == -2) {
			wpflg = true;
		}
		if (find(targetH - 1, targetW, pt) == -2) {
			wpflg = true;
		}
		if (find(targetH, targetW + 1, pt) == -2) {
			wpflg = true;
		}
		if (find(targetH, targetW - 1, pt) == -2) {
			wpflg = true;
		}
		if (wpflg) {
			wpLst.push(new Point(targetH, targetW));
		}
		return 0;
	}

}
