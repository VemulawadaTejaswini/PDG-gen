import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		br.close();

		char[] c = s.toCharArray();
		int n = c.length + 1;
		int[] a = new int[n];
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '<') {
				a[i + 1] = a[i] + 1;
			}
		}
		for (int i = c.length - 1; i >= 0; i--) {
			if (c[i] == '>') {
				a[i] = Math.max(a[i], a[i + 1] + 1);
			}
		}
		long ans = 0;
		for (int i = 0; i < n; i++) {
			ans += a[i];
		}
		System.out.println(ans);
	}
}
