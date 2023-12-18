import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s = br.readLine().toCharArray();
		br.close();

		int ans = 0;
		String t = "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length; i++) {
			sb.append(s[i]);
			String u = sb.toString();
			if (t.equals(u)) {
				sb.append(s[i]);
			} else {
				t = u;
				sb = new StringBuilder();
				ans++;
			}
		}
		System.out.println(ans);
	}
}
