

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int K = scan.nextInt();

		int ans = 0;

		if (A > K) {
			ans = 1 * K;
			System.out.println(ans);
		} else {
			K = K - A;
			ans = 1 * A;
			if (K == 0) {
				System.out.println(ans);
			} else {
				K = K - B;
				ans = ans + (B * 0);
				if (K <= 0) {
					System.out.println(ans);
				} else {
					ans = ans + (K * -1);
					System.out.println(ans);
				}

			}

		}
	}

}
