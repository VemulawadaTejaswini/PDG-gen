import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			// input
			int n = sc.nextInt();
			if (n == 0) {
				return;
			}
			double[] x = new double[n];
			double[] y = new double[n];
			for (int i = 0; i < n; i++) {
				String str = sc.next();
				String[] s = new String[2];
				s = str.split(",");
				x[i] = Double.parseDouble(s[0]);
				y[i] = Double.parseDouble(s[1]);
			}

			int max = 0;
			for (int i = 0; i < n; i++) {
				int count = 0;
				for (int j = 0; j < n; j++) {
					double d = distance(x[i], y[i], x[j], y[j]);
					if (d <= 4) {
						count++;
						// System.out.println("i:" + i + " j:" + j);
						// System.out.println(d);
					}
				}
				max = Math.max(max, count);
			}
			System.out.println(max);
		}
	}

	public double distance(double x0, double y0, double x1, double y1) {
		return (((x0 - x1) * (x0 - x1)) + ((y0 - y1) * (y0 - y1)));
	}

	public static void main(String[] args) {
		new Main().run();
	}

}