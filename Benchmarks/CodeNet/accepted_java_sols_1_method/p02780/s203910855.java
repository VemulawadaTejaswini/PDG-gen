import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		double ans = 0;
		for (int i = 0; i < k; i++) {
			ans += (p[i] + 1) / 2.0;
		}

		double val = ans;
		for (int i = k; i < n; i++) {
			val -= (p[i - k] + 1) / 2.0;
			val += (p[i] + 1) / 2.0;
			ans = Math.max(ans, val);
		}
		System.out.println(ans);
	}
}
