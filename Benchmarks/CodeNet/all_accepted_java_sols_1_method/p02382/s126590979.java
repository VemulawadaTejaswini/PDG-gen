import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] x = new int[n];
		for (int i=0; i<n; i++) { x[i] = sc.nextInt(); }
		int[] y = new int[n];
		for (int i=0; i<n; i++) { y[i] = sc.nextInt(); }

		double D1 = 0;
		double D2 = 0;
		double D3 = 0;
		double Di = Double.MIN_VALUE;

		for (int i = 0; i < x.length; i++) {

			double abs = Math.abs(x[i] - y[i]);
			D1 += abs;
			D2 += Math.pow(abs, 2);
			D3 += Math.pow(abs, 3);
			if (Di < abs) { Di = abs; }
		}
		D2 = Math.sqrt(D2);
		D3 = Math.pow(D3,1/3.0);

		System.out.printf("%.5f\n", D1);
		System.out.printf("%.5f\n", D2);
		System.out.printf("%.5f\n", D3);
		System.out.printf("%.5f\n", Di);

	}
}
