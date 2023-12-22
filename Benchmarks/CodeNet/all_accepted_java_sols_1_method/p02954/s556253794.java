import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();

		int[] ans = new int[s.length];
		int r = 0;
		int l = 0;
		boolean rflg = true;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'R') {
				r++;
				rflg = true;
			} else {
				l++;
				rflg = false;
			}

			if (!rflg && (i == s.length - 1 || s[i + 1] == 'R')) {
				if (r % 2 == 0) {
					ans[i - l] = r / 2;
					ans[i - l + 1] = r / 2;
				} else {
					ans[i - l] = r / 2 + 1;
					ans[i - l + 1] = r / 2;
				}
				if (l % 2 == 0) {
					ans[i - l] += l / 2;
					ans[i - l + 1] += l / 2;
				} else {
					ans[i - l] += l / 2;
					ans[i - l + 1] += l / 2 + 1;
				}
				r = 0;
				l = 0;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ans.length; i++) {
			sb.append(ans[i]).append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}
}
