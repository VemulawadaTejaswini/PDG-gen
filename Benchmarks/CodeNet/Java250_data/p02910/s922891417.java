import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		boolean isStepable = true;
		String ans = "";

		// 奇数文字にLがくるとだめ。偶数にRが来てもだめ。
		for (int i = 0; i < S.length(); i++) {
			if (i % 2 == 0) {
				// 偶数
				if (S.charAt(i) == 'L') {
					isStepable = false;
				}
			} else {
				// 奇数
				if (S.charAt(i) == 'R') {
					isStepable = false;
				}
			}
		}

			if (isStepable) {
				ans = "Yes";
			} else {
				ans = "No";
			}
			System.out.println(ans);

		

	}
}
