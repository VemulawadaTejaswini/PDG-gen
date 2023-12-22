import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		String s = br.readLine();
		br.close();

		int ans = 0;
		int idx = 0;
		while (idx < n) {
			idx = s.indexOf("ABC", idx);
			if (idx >= 0) {
				ans++;
				idx++;
			} else {
				break;
			}
		}
		System.out.println(ans);
	}
}
