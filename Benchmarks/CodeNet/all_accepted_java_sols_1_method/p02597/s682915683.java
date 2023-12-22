import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		StringBuilder sb = new StringBuilder(str);
		int ans = 0;
		int l = 0;
		int r = N - 1;
		while (true) {
			if (sb.charAt(l) == 'R') {
				l++;
			}
			if (sb.charAt(r) == 'W') {
				r--;
			}
			if (l < r && sb.charAt(l) == 'W' && sb.charAt(r) == 'R') {
				sb.setCharAt(l, 'R');
				sb.setCharAt(r, 'W');
				ans++;
				l++;
				r--;
			}
			if (l >= r || l >= N || r < 0) {
				break;
			}
		}
		System.out.println(ans);
	}

}