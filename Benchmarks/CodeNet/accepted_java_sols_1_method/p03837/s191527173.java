import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
	static List<Integer> path;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		int[] a = new int[m];
		int[] b = new int[m];
		int[] c = new int[m];
		int[][] ab = new int[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(ab[i], 100000000);
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]) - 1;
			b[i] = Integer.parseInt(sa[1]) - 1;
			c[i] = Integer.parseInt(sa[2]);
			ab[a[i]][b[i]] = c[i];
			ab[b[i]][a[i]] = c[i];
		}
		br.close();

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i == j) {
						ab[i][j] = 0;
						ab[j][i] = 0;
					} else {
						ab[i][j] = Math.min(ab[i][j], ab[i][k] + ab[k][j]);
						ab[j][i] = ab[i][j];
					}
				}
			}
		}

		int ans = 0;
		for (int k = 0; k < m; k++) {
			boolean flg = false;
			hen:
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					int ak = a[k];
					int bk = b[k];
					if (ab[i][j] == ab[i][ak] + c[k] + ab[bk][j]) {
						flg = true;
						break hen;
					}
				}
			}
			if (!flg) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
