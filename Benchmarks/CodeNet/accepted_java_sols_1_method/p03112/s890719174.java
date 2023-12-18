import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int q = sc.nextInt();
		long[] s = new long[a];
		long[] t = new long[b];
		long[] x = new long[q];
		for (int i = 0; i < a; i++) {
			s[i] = sc.nextLong();
		}
		for (int i = 0; i < b; i++) {
			t[i] = sc.nextLong();
		}
		for (int i = 0; i < q; i++) {
			x[i] = sc.nextLong();
		}
		for (int i = 0; i < q; i++) {
			long ws;
			long es;
			long wt;
			long et;
			if (s[0] > x[i]) {
				ws = -100000000000l;
				es = s[0];
			} else if (s[a - 1] < x[i]) {
				ws = s[a - 1];
				es = 100000000000l;
			} else {
				int ok = 0;
				int ng = a - 1;
				while (Math.abs(ok - ng) > 1) {
					int mid = (ok + ng) / 2;
					if (s[mid] < x[i]) {
						ok = mid;
					} else {
						ng = mid;
					}
				}
				ws = s[ok];
				es = s[ok + 1];
			}
			if (t[0] > x[i]) {
				wt = -100000000000l;
				et = t[0];
			} else if (t[b - 1] < x[i]) {
				wt = t[b - 1];
				et = 100000000000l;
			} else {
				int ok = 0;
				int ng = b - 1;
				while (Math.abs(ok - ng) > 1) {
					int mid = (ok + ng) / 2;
					if (t[mid] < x[i]) {
						ok = mid;
					} else {
						ng = mid;
					}
				}
				wt = t[ok];
				et = t[ok + 1];
			}
			long min = 1000000000000000000l;
			long[] ss = {ws, es};
			long[] tt = {wt, et};
			for (long S: ss) {
				for (long T: tt) {
					long d1 = Math.abs(S - x[i]) + Math.abs(T - S);
					long d2 = Math.abs(T - x[i]) + Math.abs(S - T);
					min = Math.min(min, Math.min(d1, d2));
				}
			}
			System.out.println(min);
		}
	}
}