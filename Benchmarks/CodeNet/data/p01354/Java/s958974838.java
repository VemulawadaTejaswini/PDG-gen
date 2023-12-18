
import java.util.Arrays;
import java.util.Scanner;

class Main {

	public void run() {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();//猫の数
		int n = sc.nextInt();//部屋の数
		double[][] p = new double[m][n];
		for (int i = 0; i < m; ++i) {
			for (int j = 0; j < n; ++j) {
				p[i][j] = sc.nextDouble();
			}
		}
		double[][] prob = new double[n + 1][1 << m];
		Arrays.fill(prob[n], 1);
		for (int s = (1 << m) - 2; s >= 0; --s) {
			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < m; ++j) {
					if ((s >> j) % 2 == 1)
						continue;
					double tmp = 0;
					double mul = 1;
					for (int k = i; k <= n; ++k) {
						tmp += prob[k][s | 1 << j] * mul * (1 - (k == n ? 0 : p[j][k]));
						if (k < n)
							mul *= p[j][k];
					}
					prob[i][s] = Math.max(prob[i][s], tmp);
				}
			}
		}
		System.out.println(prob[0][0]);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}

