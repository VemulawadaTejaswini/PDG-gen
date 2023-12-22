import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		br.close();

		int n = s.length();
		int ans = n;
		for (int i = 1; i < n; i++) {
			if (s.charAt(i - 1) != s.charAt(i)) {
				int m = Math.max(i, n - i);
				ans = Math.min(ans, m);
			}
		}
		System.out.println(ans);
	}
}
