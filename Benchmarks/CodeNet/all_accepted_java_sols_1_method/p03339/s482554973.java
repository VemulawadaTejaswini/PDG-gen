import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String S = scan.next();
		char[] s = new char[n];
		for (int i = 0; i < n; i++) {
			s[i] = S.charAt(i);
		}
		// 一番西の人がリーダーの時
		int num = 0;
		for (int i = 1; i < n; i++) {
			if (s[i] == 'E') {
				num++;
			}
		}
		int now = num;
		for (int i = 0; i < n - 1; i++) {
			int after = now;
			if (s[i] == 'W') {
				after++;
			}
			if (s[i + 1] == 'E') {
				after--;
			}
			now = after;
			if (after < num) {
				num = after;
			}
		}
		System.out.println(num);
	}
}
