import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int M = sc.nextInt();
		int[] h = new int[H+1];
		int[] w = new int[W+1];
		HashSet<Long> set = new HashSet<>();
		int maxh = 0;
		int maxw = 0;
		for (int i = 0; i < M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			h[x]++;
			w[y]++;
			maxh = Math.max(maxh, h[x]);
			maxw = Math.max(maxw, w[y]);
			set.add(x * (W + 1L) + y);
		}
		int[] mh = new int[H];
		int[] mw = new int[W];
		int nh = 0;
		int nw = 0;
		for (int i = 1; i <= H; i++) {
			if (h[i] == maxh) {
				mh[nh++] = i;
			}
		}
		for (int i = 1; i <= W; i++) {
			if (w[i] == maxw) {
				mw[nw++] = i;
			}
		}
		if (nw * nh > M) {
			System.out.println(maxh + maxw);
			return;
		}
		for (int i = 0; i < nh; i++) {
			for (int j = 0; j < nw; j++) {
				if (!set.contains(mh[i] * (W + 1L) + mw[j])) {
					System.out.println(maxh + maxw);
					return;
				}
			}
		}
		System.out.println(maxh + maxw - 1);
		
	}

}
