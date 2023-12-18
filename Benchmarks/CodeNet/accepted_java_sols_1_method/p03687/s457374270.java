import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < 26; i++) {
			char ch = (char) ('a' + i);
			StringBuilder sb = new StringBuilder(s);
			int cnt = 0;
			while (true) {
				boolean flg = true;
				for (int j = 0; j < sb.length(); j++) {
					if (sb.charAt(j) != ch) {
						flg = false;
						break;
					}
				}
				if (flg) {
					break;
				}

				for (int j = 0; j < sb.length() - 1; j++) {
					if (sb.charAt(j) == ch || sb.charAt(j + 1) == ch) {
						sb.setCharAt(j, ch);
					}
				}
				sb.deleteCharAt(sb.length() - 1);
				cnt++;
			}
			ans = Math.min(ans, cnt);
		}
		System.out.println(ans);
	}
}
