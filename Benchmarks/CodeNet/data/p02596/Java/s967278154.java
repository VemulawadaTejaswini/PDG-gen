import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		br.close();

		if (k % 2 == 0 || k % 5 == 0) {
			System.out.println(-1);
			return;
		}

		long now = 0;
		int ans = 0;
		while (true) {
			for (int i = 0; i <= 9; i++) {
				long val = now + k * i;
				String s = String.valueOf(val);
				boolean flg = true;
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(j) != '7') {
						flg = false;
						break;
					}
				}
				if (flg) {
					ans += s.length();
					System.out.println(ans);
					return;
				}
				if (s.charAt(s.length() - 1) == '7') {
					now = val / 10;
					ans++;
				}
			}
		}
	}
}
