

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();

			if (i % 2 != 0 && a % 2 != 0) {
				ans++;
			}

		}

		System.out.println(ans);

	}

}
