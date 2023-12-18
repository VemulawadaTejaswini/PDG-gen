import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int d = Integer.parseInt(sa[1]);
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			x[i] = Integer.parseInt(sa[0]);
			y[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (Math.hypot(x[i], y[i]) <= d) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
