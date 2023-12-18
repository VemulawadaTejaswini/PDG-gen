import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int q = sc.nextInt();
		TreeSet<Long> sSet = new TreeSet<>();
		TreeSet<Long> tSet = new TreeSet<>();
		for (int i = 0; i < a; i++) {
			sSet.add(sc.nextLong());
		}
		for (int i = 0; i < b; i++) {
			tSet.add(sc.nextLong());
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
			long x = sc.nextLong();
			Long sLeft = sSet.floor(x);
			long sleft;
			if (sLeft == null) {
				sleft = Integer.MIN_VALUE;
			} else {
				sleft = sLeft;
			}
			Long tLeft = tSet.floor(x);
			long tleft;
			if (tLeft == null) {
				tleft = Integer.MIN_VALUE;
			} else {
				tleft = tLeft;
			}
			Long sRight = sSet.ceiling(x);
			long sright;
			if (sRight == null) {
				sright = Integer.MAX_VALUE;
			} else {
				sright = sRight;
			}
			Long tRight = tSet.ceiling(x);
			long tright;
			if (tRight == null) {
				tright = Integer.MAX_VALUE;
			} else {
				tright = tRight;
			}
			long x1 = x - Math.min(sleft, tleft);
			if (sLeft == null || tLeft == null) {
				x1 = Long.MAX_VALUE;
			}
			long x2 = Math.max(sright, tright) - x;
			if (sRight == null || tRight == null) {
				x2 = Long.MAX_VALUE;
			}
			long x3 = Math.min(sright - x, x - tleft) + sright - tleft;
			if (sRight == null || tLeft == null) {
				x3 = Long.MAX_VALUE;
			}
			long x4 = Math.min(tright - x, x - sleft) + tright - sleft;
			if (tRight == null || sLeft == null) {
				x4 = Long.MAX_VALUE;
			}
			sb.append(Math.min(Math.min(x1, x2), Math.min(x3, x4))).append("\n");
		}
		System.out.print(sb);
	}
}
