/**
 * 
 */

import java.util.Scanner;

/**
 * @author kumar1
 * 
 */
public class Main {

	void solve() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int y = scanner.nextInt();
			int m = scanner.nextInt();
			int d = scanner.nextInt();
			int ans = 0;
			while(y < 1000) {
				while(m <= 10) {
					int md = y % 3 == 0 ? 20 : m % 2 == 0 ? 19 : 20;
					while(d <= md) {
						d++;
						ans++;
					}
					d = 1;
					m++;
				}
				m = 1;
				y++;
			}
			System.out.println(ans);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().solve();
	}

}