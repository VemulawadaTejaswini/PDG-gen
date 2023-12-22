import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		long c = Long.parseLong(sa[1]);
		long[] x = new long[n + 2];
		long[] v = new long[n + 1];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			x[i + 1] = Long.parseLong(sa[0]);
			v[i + 1] = Long.parseLong(sa[1]);
		}
		x[n + 1] = c;
		br.close();

		long[] r1 = new long[n + 1];
		long[] r2 = new long[n + 1];
		for (int i = 1; i <= n; i++) {
			r1[i] = v[i] - (x[i] - x[i - 1]);
			r1[i] += r1[i - 1];
			r2[i] = v[i] - (x[i] - x[i - 1]) * 2;
			r2[i] += r2[i - 1];
		}
		for (int i = 1; i <= n; i++) {
			r1[i] = Math.max(r1[i], r1[i - 1]);
			r2[i] = Math.max(r2[i], r2[i - 1]);
		}

		long[] l1 = new long[n + 2];
		long[] l2 = new long[n + 2];
		for (int i = n; i >= 0; i--) {
			l1[i] = v[i] - (x[i + 1] - x[i]);
			l1[i] += l1[i + 1];
			l2[i] = v[i] - (x[i + 1] - x[i]) * 2;
			l2[i] += l2[i + 1];
		}
		for (int i = n; i >= 0; i--) {
			l1[i] = Math.max(l1[i], l1[i + 1]);
			l2[i] = Math.max(l2[i], l2[i + 1]);
		}

		long ans = 0;
		for (int i = 0; i <= n; i++) {
			long val1 = r1[i] + l2[i + 1];
			ans = Math.max(ans, val1);
			long val2 = r2[i] + l1[i + 1];
			ans = Math.max(ans, val2);
		}
		System.out.println(ans);
	}
}
