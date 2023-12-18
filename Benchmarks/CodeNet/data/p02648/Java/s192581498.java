import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] v = new int[n];
		int[] w = new int[n];
		for (int i = 0; i < n; i++) {
			String[] sa = br.readLine().split(" ");
			v[i] = Integer.parseInt(sa[0]);
			w[i] = Integer.parseInt(sa[1]);
		}
		int q = Integer.parseInt(br.readLine());
		int[] x = new int[q];
		int[] l = new int[q];
		for (int i = 0; i < q; i++) {
			String[] sa = br.readLine().split(" ");
			x[i] = Integer.parseInt(sa[0]);
			l[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		int end = Math.min(1 << 11, n + 1);
		int[][] dp = new int[end][100001];
		for (int i = 1; i < end; i++) {
			int i1 = i - 1;
			int pre = i / 2;
			for (int j = 0; j <= 100000; j++) {
				dp[i][j] = dp[pre][j];
			}
			for (int j = 100000 - w[i1]; j >= 0; j--) {
				dp[i][j + w[i1]] = Math.max(dp[i][j + w[i1]], dp[i][j] + v[i1]);
			}
		}

		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < q; i++) {
			List<Integer> list = new ArrayList<>();
			int now = x[i];
			while (now >= end) {
				list.add(now - 1);
				now /= 2;
			}
			int ans = dp[now][l[i]];
			int size = list.size();
			int end2 = 1 << size;
			for (int j = 0; j < end2; j++) {
				int vs = 0;
				int ws = 0;
				for (int j2 = 0; j2 < size; j2++) {
					if ((j >> j2 & 1) == 1) {
						vs += v[list.get(j2)];
						ws += w[list.get(j2)];
					}
				}
				if (ws <= l[i]) {
					int val = vs + dp[now][l[i] - ws];
					ans = Math.max(ans, val);
				}
			}
			pw.println(ans);
		}
		pw.flush();
	}
}
