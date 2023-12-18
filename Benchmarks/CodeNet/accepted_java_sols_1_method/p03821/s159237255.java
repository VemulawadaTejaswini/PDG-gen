import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]);
			b[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		long ans = 0;
		for (int i = n - 1; i >= 0; i--) {
			long c = (a[i] + ans) % b[i];
			if (c > 0) {
				ans += b[i] - c;
			}
		}
		System.out.println(ans);
	}
}
