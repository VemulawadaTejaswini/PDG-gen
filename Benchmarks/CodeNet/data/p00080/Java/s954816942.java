import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			while (sc.hasNext()) {
				double res = 0.0;
				int q = sc.nextInt();

					if (q < 0) {
						break;
					}

					for (int i = 2; Math.abs(f(i , q)) >= 0.00001 * q; i++) {
						res = x(i, q);
					}

				System.out.println(res);
			}

		sc.close();
	}

	private static double x(int n, double q) {

		if (n == 1) {
			return q / 2;
		} else {
			return x(n - 1, q) - f(n - 1, q) / ( 3 * Math.pow( x(n - 1, q), 2) );
		}
	}

	private static double f(int i, double q) {
		return  Math.pow( x(i, q), 3) - q;
	}

}
