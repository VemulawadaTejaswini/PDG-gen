import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		run();
	}

	static void run() {
		new Main().solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), e = sc.nextInt(), t = sc.nextInt() - 1;
		int[] w = new int[n];
		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
		}
		int[] g = new int[e];
		int[] c = new int[e];
		int[][] s = new int[e][];
		for (int i = 0; i < e; i++) {
			g[i] = sc.nextInt() - 1;
			c[i] = sc.nextInt();
			s[i] = new int[c[i]];
			for (int j = 0; j < c[i]; j++) {
				s[i][j] = sc.nextInt() - 1;
			}
		}
		long[] F = new long[n];
		Arrays.fill(F, 1L << 60);
		for (int i = 0; i < n; i++) {
			if (w[i] == 1) {
				F[i] = 1;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < e; j++) {
				ArrayList<Long> v = new ArrayList<>();
				for (int k = 0; k < s[j].length; k++) {
					v.add(F[s[j][k]]);
				}
				v.sort(new Comparator<Long>() {
					@Override
					public int compare(Long o1, Long o2) {
						return -Long.compare(o1, o2);
					}
				});
				long d = 1;
				for (int k = 0; k < s[j].length; k++) {
					if (d < v.get(k) + k) {
						d = k + v.get(k);
					}
				}
				if (F[g[j]] > d) {
					F[g[j]] = d;
				}
			}
		}
		if (F[t] > (1L << 60))
			System.out.println(-1);
		else
			System.out.println(F[t]);
	}
}