import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = 0;
		while (sc.hasNext()) {
			m++;
			int n = sc.nextInt();
			double[] x = new double[51];
			double[] y = new double[51];
			if (n == 0) {
				break;
			}
			for (int i = 0; i < n; i++) {
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
			}
			double s = x[0] * y[n - 1] - x[n - 1] * y[0];
			for (int i = 0; i < n - 1; i++) {
				s += x[i + 1] * y[i] - x[i] * y[i + 1];
			}
			System.out.printf("%d %.1f", m, s / 2);
			System.out.println();
		}
	}
}