import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int a = Integer.parseInt(sa[1]);
		int b = Integer.parseInt(sa[2]);
		sa = br.readLine().split(" ");
		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		long ans = 0;
		for (int i = 1; i < n; i++) {
			long c = x[i] - x[i - 1];
			c *= a;
			ans += c < b ? c : b;
		}
		System.out.println(ans);
	}
}
