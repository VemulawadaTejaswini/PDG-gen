import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String str = sc.next();

		int result = 0;

		int l = 0;
		int r = n - 1;

		while (true) {

			// 最も左にある 'W' を探す
			while (true) {
				if (str.length() == l) {
					break;
				}
				if (str.charAt(l) == 'W') {
					break;
				}
				l++;
			}

			// 最も右にある 'R' を探す
			while (true) {
				if (r == -1) {
					break;
				}
				if (str.charAt(r) == 'R') {
					break;
				}
				r--;
			}

			//System.out.println("swap! " + " " + l + " " + r);

			// 次へ
			if (l > r) {
				break;
			}
			result++;
			l++;
			r--;
		}

		System.out.println(result);

	}
}
