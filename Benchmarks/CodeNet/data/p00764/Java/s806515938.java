import java.awt.geom.Line2D;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			double[] x = new double[n];
			double[] y = new double[n];
			double[] r = new double[n];
			for (int i = 0; i < n; ++i) {
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
				r[i] = sc.nextDouble();
			}

			double[][] p = new double[2 * n][];
			p[0] = new double[] { x[0], y[0] };
			p[2 * n - 1] = new double[] { x[n - 1], y[n - 1] };

			for (int i = 0; i < n - 1; ++i) {
				double a = -2 * (x[i] - x[i + 1]);
				double b = -2 * (y[i] - y[i + 1]);
				double c = x[i] * x[i] - x[i + 1] * x[i + 1] + y[i] * y[i] - y[i + 1] * y[i + 1] - r[i] * r[i]
						+ r[i + 1] * r[i + 1];

				double w = -c * a / (a * a + b * b);
				double v = -c * b / (a * a + b * b);

				double f = 1 / (a * a + b * b) * (-b * (w - x[i]) + a * (v - y[i]));
				double g = 1 / (a * a + b * b) * ((w - x[i]) * (w - x[i]) + (v - y[i]) * (v - y[i]) - r[i] * r[i]);
				double t1 = -f + Math.sqrt(f * f - g);
				double t2 = -f - Math.sqrt(f * f - g);
				p[2 * i + 1] = new double[] { w - b * t1, v + a * t1 };
				p[2 * i + 2] = new double[] { w - b * t2, v + a * t2 };

			}

			Line2D.Double[] seg = new Line2D.Double[n - 1];
			for (int i = 0; i < n - 1; ++i) {
				seg[i] = new Line2D.Double(p[2 * i + 1][0], p[2 * i + 1][1], p[2 * i + 2][0], p[2 * i + 2][1]);
			}

			double[][] dis = new double[2 * n][2 * n];
			for (int i = 0; i < 2 * n; ++i) {
				for (int j = 0; j < 2 * n; ++j) {
					if (i != j)
						dis[i][j] = Double.MAX_VALUE / 100;
				}
			}
			for (int src = 0; src < 2 * n; ++src) {
				for (int dst = src + 1; dst < 2 * n; ++dst) {
					int s = (src == 0 ? -1 : (src - 1) / 2) + 1;
					int d = (dst - 1) / 2 - 1;
					boolean f = true;
					Line2D.Double path = new Line2D.Double(p[src][0], p[src][1], p[dst][0], p[dst][1]);
					for (int i = s; i <= d; ++i) {
						if (!path.intersectsLine(seg[i]))
							f = false;

					}
					if (f) {
						double distance = Math.sqrt((p[src][0] - p[dst][0]) * (p[src][0] - p[dst][0])
								+ (p[src][1] - p[dst][1]) * (p[src][1] - p[dst][1]));
						dis[src][dst] = distance;
						dis[dst][src] = distance;
					}
				}
			}
			for (int mid = 0; mid < 2 * n; ++mid) {
				for (int src = 0; src < 2 * n; ++src) {
					for (int dst = 0; dst < 2 * n; ++dst) {
						dis[src][dst] = Math.min(dis[src][dst], dis[src][mid] + dis[mid][dst]);
					}
				}
			}
			pw.println(dis[0][2 * n - 1]);

		}
		sc.close();
		pw.close();
	}
}