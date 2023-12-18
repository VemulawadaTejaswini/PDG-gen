
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			n = scanner.nextInt();
			k = scanner.nextInt();
			m = scanner.nextInt();
			r = scanner.nextInt();
			if ((n | k | m | r) == 0)
				break;
			tmp = new BigDecimal[r + 10];
			Div(n);
			BigDecimal[] res = Arrays.copyOf(tmp, tmp.length);
			if (m == 1) {
				for (int i = 1; i < n; i++) {
					Div(i * n);
					for (int j = 0; j < r + 10; j++)
						res[j] = res[j].add(tmp[j]);
				}
				for (int j = r + 10 - 1; j > 0; j--) {
					res[j - 1] = res[j - 1].add(res[j].divide(BigDecimal.TEN));
					res[j] = res[j].remainder(BigDecimal.TEN).setScale(0,
							BigDecimal.ROUND_DOWN);

				}
				res[0] = res[0].remainder(BigDecimal.TEN).setScale(0,
						BigDecimal.ROUND_DOWN);

			}
			print(res);

		}
	}

	private void print(BigDecimal[] b) {
		System.out.print(b[0] + ".");
		for (int i = 1; i <= r; i++)
			System.out.print(b[i]);
		System.out.println();
	}

	private void Div(int x) {
		int now = 1;
		for (int i = 0; i < r + 10; i++) {
			tmp[i] = new BigDecimal(now / x);
			now %= x;
			now *= 10;
		}
	}

	int n, k, m, r;
	BigDecimal[] tmp;
}