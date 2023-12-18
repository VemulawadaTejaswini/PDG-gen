import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
	static List<Integer> path;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = br.readLine();
		}
		br.close();

		int ans = 0;
		int a = 0;
		int b = 0;
		int ab = 0;
		for (int i = 0; i < n; i++) {
			ans += s[i].split("AB", -1).length - 1;
			if (s[i].charAt(s[i].length() - 1) == 'A') {
				if (s[i].charAt(0) == 'B') {
					ab++;
				} else {
					a++;
				}
			} else {
				if (s[i].charAt(0) == 'B') {
					b++;
				}
			}
		}

		int cnt = 0;
		if (ab > 0) {
			if (a > 0) {
				a--;
				cnt++;
			}
			cnt += ab - 1;
			if (b > 0) {
				b--;
				cnt++;
			}
		}
		cnt += Math.min(a, b);
		System.out.println(ans + cnt);
	}
}
