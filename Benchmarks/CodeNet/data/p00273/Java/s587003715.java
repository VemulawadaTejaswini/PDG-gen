import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) solve();
		}
	}
	void solve() {
		int price1 = sc.nextInt();
		int price2 = sc.nextInt();
		int need1 = sc.nextInt();
		int need2 = sc.nextInt();
		
		int ans = buy(price1, price2, need1, need2);
		for (int buy1 = need1; buy1 <= Math.max(need1, 5); buy1++) {
		for (int buy2 = need2; buy2 <= Math.max(need2, 2); buy2++) {
			int k = buy(price1, price2, buy1, buy2);
			if (ans > k) ans = k;
		}
		}
		System.out.println(ans);
	}
	
	int buy(int price1, int price2, int q1, int q2) {
		int k = price1 * q1 + price2 * q2;
		if (q1 >= 5 && q2 >= 2) k = k * 4 / 5;
		return k;
	}
}