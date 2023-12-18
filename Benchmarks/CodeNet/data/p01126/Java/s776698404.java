import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int M = sc.nextInt();
			int A = sc.nextInt();
			Seg[] segs = new Seg[M];
			for (int i = 0; i < M; ++i) {
				int h = sc.nextInt();
				int p = sc.nextInt();
				int q = sc.nextInt();
				segs[i] = new Seg(h, p, q);
			}
			Arrays.sort(segs);
			for (int i = 0; i < M; ++i) {
				Seg s = segs[i];
				if (s.p == A) {
					A = s.q;
				} else if (s.q == A) {
					A = s.p;
				}
			}
			System.out.println(A);
		}
	}

	static class Seg implements Comparable<Seg> {
		int h, p, q;

		public Seg(int h, int p, int q) {
			this.h = h;
			this.p = p;
			this.q = q;
		}

		public int compareTo(Seg o) {
			return o.h - this.h;
		}
	}

}