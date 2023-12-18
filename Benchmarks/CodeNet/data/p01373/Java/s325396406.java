import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int w = sc.nextInt(), h = sc.nextInt(), n = sc.nextInt();
			if (w == 0 && h == 0 && n == 0)
				break;
			n *= 2;
			double[] x = new double[n];
			double[] y = new double[n];
			for (int i = 0; i < n; i++) {
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
			}
			ArrayList<Double> y1 = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (x[i] != x[j]) {
						double tmp = (y[i] - y[j]) / (x[i] - x[j]) * (-x[i]) + y[i];
						if (0 <= tmp && tmp <= h) {
							y1.add(tmp);
						}
					}
				}
			}
			y1.sort(null);
			for (int i = 0; i < y1.size() - 1; i++) {
				while (i < y1.size() - 1 && y1.get(i) == y1.get(i + 1)) {
					y1.remove(i);
				}
			}
			double ans = 0;
			double[] y2 = new double[n];

			for (int i = 0; i < y1.size() - 1; i++) {
				double y_mid = (y1.get(i) + y1.get(i + 1)) / 2;
				for (int j = 0; j < n; j++) {
					double tmp = (x[j] - 0) / (y[j] - y_mid) * (w - x[j]) + y[j];
					if (tmp < 0)
						tmp = 0;
					if (tmp > h)
						tmp = h;
					y2[j] = tmp;
				}
				Arrays.sort(y2);
				ans += (y2[n / 2] - y2[n / 2 - 1]) * (y1.get(i + 1) - y1.get(i));
			}
			System.out.println(ans / h / h);
		}
	}
}