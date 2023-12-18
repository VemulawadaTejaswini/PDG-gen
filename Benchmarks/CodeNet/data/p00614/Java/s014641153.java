import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] price = { 1, 5, 10, 50, 100, 500 };
	static int ans;
	static int[] N = new int[6];

	public static void main(String[] args) throws Exception {
		while (true) {
			int P = sc.nextInt();
			if (P == 0) break;
			ans = Integer.MAX_VALUE;
			int sum = 0;
			for (int i = 0; i < 6; ++i) {
				N[i] = sc.nextInt();
				sum += N[i] * price[i];
			}
			for (int i = P; i <= sum; ++i) {
				int give = give(i);
				if (give == -1) continue;
				ans = Math.min(ans, give + take(i - P));
			}
			System.out.println(ans);
		}
	}

	static int give(int p) {
		int c = 0;
		for (int i = 5; i >= 0; --i) {
			int max = p / price[i];
			if (max > N[i]) {
				p -= N[i] * price[i];
				c += N[i];
			} else {
				p -= max * price[i];
				c += max;
			}
		}
		return p != 0 ? -1 : c;
	}

	static int take(int p) {
		int c = 0;
		for (int i = 5; i >= 0; --i) {
			int coin = p / price[i];
			p -= coin * price[i];
			c += coin;
		}
		return c;
	}

}