import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		char[] S = sc.next().toCharArray();
		String ans = "Yes";

		for (int i = 0; i < S.length; i++) {
			if (i % 2 == 0 && S[i] == 'L') {
				ans = "No";
				System.out.println(ans);
				return;
			}
			if (i % 2 != 0 && S[i] == 'R') {
				ans = "No";
				System.out.println(ans);
				return;
			}

		}

		System.out.println(ans);
		sc.close();
	}
};
