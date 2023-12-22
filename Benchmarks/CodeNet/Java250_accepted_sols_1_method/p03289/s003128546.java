import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] s = br.readLine().toCharArray();
		br.close();

		if (s[0] != 'A') {
			System.out.println("WA");
			return;
		}

		int cnt = 0;
		for (int i = 2; i < s.length - 1; i++) {
			if (s[i] == 'C') {
				cnt++;
			}
		}
		if (cnt != 1) {
			System.out.println("WA");
			return;
		}

		for (int i = 1; i < s.length; i++) {
			if (s[i] != 'C') {
				int x = s[i] - 'a';
				if (x < 0 || 26 <= x) {
					System.out.println("WA");
					return;
				}
			}
		}
		System.out.println("AC");
	}
}
