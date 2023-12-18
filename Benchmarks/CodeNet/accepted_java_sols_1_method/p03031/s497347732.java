import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] light = new int[m][n];
		int k, s;
		for (int i = 0; i < m; i++) {
			k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				s = sc.nextInt() - 1;
				light[i][s]++;
			}
		}
		int[] p = new int[m];
		for (int i = 0; i < m; i++) {
			p[i] = sc.nextInt();
		}
		int t, d, idx, cnt, ans = 0;
		int[] sw;
		boolean ok;
		for (int i = 0; i < Math.pow(2, n); i++) {
			t = i;
			d = 512;
			idx = 9;
			sw = new int[n];
			while (t != 0) {
				if (t >= d) {
					t = t - d;
					sw[idx]++;
				}
				d = d / 2;
				idx--;
			}
			ok = true;
			for (int j = 0; j < m; j++) {
				cnt = 0;
				for (int l = 0; l < n; l++) {
					if (sw[l] == light[j][l] && sw[l] == 1) {
						cnt++;
					}
				}
				if (cnt % 2 == p[j]) {

				} else {
					ok = false;
					break;
				}
			}
			if (ok) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}