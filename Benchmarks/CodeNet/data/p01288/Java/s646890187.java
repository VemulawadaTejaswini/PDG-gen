
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	int uf(int[] t, int q) {
		if (q < 0 || q >= t.length) {
			System.out.println("assertion");
			return -1234;
		}
		if (t[q] == q) {
			return q;
		}
		int v = uf(t, t[q]);
		t[q] = v;
		return v;
	}

	void run() {
		for (;;) {
			int n = 0;
			int m = 0;
			try {
				n = sc.nextInt();
				m = sc.nextInt();
			} catch (Exception e) {
				break;
			}
			if ((n | m) == 0) {
				break;
			}

			int[] t = new int[n];
			int[] d = new int[n];
			for (int i = 1; i < n; i++) {
				try {
					t[i] = sc.nextInt() - 1;
				} catch (Exception e) {
					break;
				}

				d[i] = t[i];
			}

			int Query[] = new int[m];

			for (int i = 0; i < m; i++) {
				char c = 0;
				int v = 0;
				try {
					c = sc.next().charAt(0);
					v = sc.nextInt();
				} catch (Exception e) {
					break;
				}

				if (c == 'Q') {
					Query[i] = v;
				} else {
					Query[i] = -v;
					if(v-1 < 0 || v-1>= t.length){
						return;
					}
					t[v - 1] = v - 1;
				}
			}
			t[0] = 0;
			d[0] = 0;

			long ans = 0;
			for (int i = 0; i < m; i++) {
				int ii = m - i - 1;
				if(ii < 0 || ii >= t.length){
					return;
				}
				if (Query[ii] > 0) {
					int u = uf(t, Query[ii] - 1);
					if (u == -1234) {
						return;
					}
					ans += 1 + u;

				} else {
					int v = -Query[ii] - 1;
					if( v < 0 || v >= t.length){
						return;
					}
					t[v] = d[v];
				}
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}