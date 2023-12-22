
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int limit = sc.nextInt();
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < a; i++) {
			int c = sc.nextInt();
			int t = sc.nextInt();
			if (t <= limit) {
				if (c < ans) {
					ans = c;
				}
			}
		}

		if (ans == Integer.MAX_VALUE) {
			System.out.println("TLE");
		} else {
			System.out.println(ans);
		}

	}

}
