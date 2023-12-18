import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		new Main().solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);

		int n = -1;
		while (n != 0) {
			n = sc.nextInt();
			if(n==0)
				break;
			double[] x = new double[n];
			double[] y = new double[n];
			for (int i = 0; i < n; i++) {
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
			}
			long ans = 1;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (dis_sq(x[i], y[i], x[j], y[j]) > 4)
						continue;
					double[][] c = calc_center(x[i], y[i], x[j], y[j]);
					for (int sign = 0; sign < 2; sign++) {
						long sum = 2;
						double cx = c[sign][0];
						double cy = c[sign][1];
						for (int k = 0; k < n; k++) {
							if (k == i || k == j)
								continue;
							if (dis_sq(cx, cy, x[k], y[k]) <= 1) {
								sum++;
							}
						}
						ans= Math.max(ans, sum);
					}
				}
			}
			System.out.println(ans);
		}
	}

	double[][] calc_center(double x1, double y1, double x2, double y2) {
		double[][] c = new double[2][2];
		double t = Math.sqrt(1 / ((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) - 1.0 / 4.0);
		c[0][0] = (x1 + x2) / 2 + (y1 - y2) * t;
		c[0][1] = (y1 + y2) / 2 + (x2 - x1) * t;
		c[1][0] = (x1 + x2) / 2 - (y1 - y2) * t;
		c[1][1] = (y1 + y2) / 2 - (x2 - x1) * t;
		return c;
	}

	double dis_sq(double x1, double y1, double x2, double y2) {
		return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
	}
}