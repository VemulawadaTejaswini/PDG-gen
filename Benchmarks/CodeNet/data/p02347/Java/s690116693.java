import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	static boolean debug = false;

	public static void main(String[] args) throws IOException {
		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		long time01 = threadMXBean.getCurrentThreadCpuTime();

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		KDTree kdt = new KDTree(n, debug);

		for (int i = 0; i < n; i++)
			kdt.add(i, scan.nextInt(), scan.nextInt());

		long time02 = threadMXBean.getCurrentThreadCpuTime();

		kdt.build();

		long time03 = threadMXBean.getCurrentThreadCpuTime();

		StringBuilder answer = new StringBuilder();
		int q = scan.nextInt();
		for (int i = 0; i < q; i++)
			kdt.judge(answer, scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
		System.out.print(answer);

		long time04 = threadMXBean.getCurrentThreadCpuTime();
		if (debug) {
			System.out.println("---- cpu 1 " + ((time02 - time01) / 1000000) + "ms");
			System.out.println("---- cpu 2 " + ((time03 - time02) / 1000000) + "ms");
			System.out.println("---- cpu 3 " + ((time04 - time03) / 1000000) + "ms");
		}
		scan.close();
		System.exit(0);
	}
}

class KDTree {
	boolean debug;

	class Pt {
		int id;
		int x, y;
		boolean xJudge;
		int leftC, rightC;

		public Pt(int id, int x, int y) {
			this.id = id;
			this.x = x;
			this.y = y;
		}

		public int key(boolean xjudge) {
			if (xjudge)
				return this.x;
			else
				return this.y;
		}
	}

	List<Pt> pt = new ArrayList<Pt>();
	int root;

	public KDTree(int n, boolean b) {
		debug = b;
	}

	public void add(int id, int x, int y) {
		pt.add(new Pt(id, x, y));
	}

	public void build() {
		root = buildTree(0, pt.size(), true, false);
	}

	class compPt implements Comparator<Pt> {

		@Override
		public int compare(Pt o1, Pt o2) {
			if (o1.key(sortbyX) > o2.key(sortbyX))
				return 1;
			else if (o1.key(sortbyX) == o2.key(sortbyX)) {
				sorteq++;
				return 0;
			} else
				return -1;
		}

	}

	boolean sortbyX;
	long sorteq;

	private int buildTree(int st, int len, boolean xjudge, boolean contig) {
		if (len == 0)
			return Integer.MAX_VALUE;

		if (len == 1) {
			pt.get(st).xJudge = xjudge;
			pt.get(st).leftC = Integer.MAX_VALUE;
			pt.get(st).rightC = Integer.MAX_VALUE;
			return st;
		}

		if (!contig) {
			sortbyX = xjudge;
			sorteq = 0;
			List<Pt> ts = pt.subList(st, st + len);
			Collections.sort(ts, new compPt());
		}

		if (len > 100 && sorteq < len)
			contig = true;
		else
			contig = false;

		int med = st + len / 2;
		pt.get(med).xJudge = xjudge;
		pt.get(med).leftC = buildTree(st, len / 2, !(xjudge ^ contig), contig);
		pt.get(med).rightC = buildTree(med + 1, len - len / 2 - 1, !(xjudge ^ contig), contig);
		return med;
	}

	List<Integer> inPt = new ArrayList<Integer>();

	public void judge(StringBuilder ans, int sx, int tx, int sy, int ty) {
		inPt.clear();
		countIn(root, sx, tx, sy, ty);
		inPt.sort(null);
		for (int i = 0; i < inPt.size(); i++)
			ans.append(inPt.get(i) + "\n");
		ans.append("\n");
	}

	private int countIn(int p, int sx, int tx, int sy, int ty) {
		if (p == Integer.MAX_VALUE)
			return 0;
		int r = 0;
		if (pt.get(p).x >= sx && pt.get(p).x <= tx && pt.get(p).y >= sy && pt.get(p).y <= ty) {
			inPt.add(pt.get(p).id);
			r++;
		}
		if (pt.get(p).xJudge) {
			if (pt.get(p).x >= sx)
				r += countIn(pt.get(p).leftC, sx, tx, sy, ty);
			if (pt.get(p).x <= tx)
				r += countIn(pt.get(p).rightC, sx, tx, sy, ty);
		} else {
			if (pt.get(p).y >= sy)
				r += countIn(pt.get(p).leftC, sx, tx, sy, ty);
			if (pt.get(p).y <= ty)
				r += countIn(pt.get(p).rightC, sx, tx, sy, ty);
		}
		return r;
	}

}