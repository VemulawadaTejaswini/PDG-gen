import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		int[] c = new int[4];
		int[] best = new int[4];
		int[] coin = { 10, 50, 100, 500 };
		for (int t = 0;; ++t) {
			int P = sc.nextInt();
			if (P == 0) break;
			for (int i = 0; i < 4; ++i) {
				c[i] = sc.nextInt();
			}
			int min = 100;
			for (int i = 0; i <= c[0]; ++i) {
				for (int j = 0; j <= c[1]; ++j) {
					for (int k = 0; k <= c[2]; ++k) {
						for (int l = 0; l <= c[3]; ++l) {
							int sum = i * 10 + j * 50 + k * 100 + l * 500;
							if (sum < P) continue;
							int rest = sum - P;
							int ret = 0;
							ret += rest / 500;
							rest -= rest / 500 * 500;
							ret += rest / 100;
							rest -= rest / 100 * 100;
							ret += rest / 50;
							rest -= rest / 50 * 50;
							ret += rest / 10;
							if (ret < min) {
								min = ret;
								best[0] = i;
								best[1] = j;
								best[2] = k;
								best[3] = l;
							}
						}
					}
				}
			}
			if (t > 0) System.out.println();
			for (int i = 0; i < 4; ++i) {
				if (best[i] != 0) {
					System.out.println(coin[i] + " " + best[i]);
				}
			}
		}
	}
}