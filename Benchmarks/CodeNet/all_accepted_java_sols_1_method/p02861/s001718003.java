import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double[] x = new double[n];
		double[] y = new double[n];

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextDouble();
			y[i] = sc.nextDouble();
		}

		double sum = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				double distance = Math.sqrt(
						Math.pow(x[i] - x[j], 2) +
								Math.pow(y[i] - y[j], 2));
				sum += distance;

			}

		}

		System.out.println(sum * (2) / n);

	}


}