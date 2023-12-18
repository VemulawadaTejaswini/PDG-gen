import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		long c = Long.parseLong(sa[1]);
		long[] x = new long[n + 2];
		long[] v = new long[n + 2];
		for (int i = 1; i <= n; i++) {
			sa = br.readLine().split(" ");
			x[i] = Long.parseLong(sa[0]);
			v[i] = Long.parseLong(sa[1]);
		}
		x[n + 1] = c;
		br.close();

		long[] maxR = new long[n + 1];
		long val = 0;
		for (int i = 1; i <= n; i++) {
			val -= x[i] - x[i - 1];
			val += v[i];
			maxR[i] = Math.max(val, maxR[i - 1]);
		}

		val = 0;
		long ansR = maxR[n];
		for (int i = n; i >= 1; i--) {
			val -= (x[i + 1] - x[i]) * 2;
			val += v[i];
			ansR = Math.max(ansR, val + maxR[i - 1]);
		}

		long[] maxL = new long[n + 2];
		val = 0;
		for (int i = n; i >= 1; i--) {
			val -= x[i + 1] - x[i];
			val += v[i];
			maxL[i] = Math.max(val, maxL[i + 1]);
		}

		val = 0;
		long ansL = maxL[1];
		for (int i = 1; i <= n; i++) {
			val -= (x[i] - x[i - 1]) * 2;
			val += v[i];
			ansL = Math.max(ansL, val + maxL[i + 1]);
		}
		System.out.println(Math.max(ansR, ansL));
	}
}
