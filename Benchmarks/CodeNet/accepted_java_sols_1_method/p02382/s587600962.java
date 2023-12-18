import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		String[] xstr = sc.nextLine().split(" ");
		String[] ystr = sc.nextLine().split(" ");

		double[] x = new double[n];
		double[] y = new double[n];
		for (int i=0; i < n; i++) {
			x[i] = Double.parseDouble(xstr[i]);
			y[i] = Double.parseDouble(ystr[i]);
		}

		double d1 = 0;
		double d2 = 0;
		double d3 = 0;
		double dinfi = 0;

		for (int i=0; i < n; i++) {
			double xy = Math.abs( x[i] - y[i] );

			d1 += xy;

			d2 += xy * xy;

			d3 += xy * xy * xy;

			if (xy > dinfi) dinfi = xy;
		}

		d2 = Math.sqrt(d2);
		d3 = Math.cbrt(d3);

		System.out.printf("%.6f\n", d1);
		System.out.printf("%.6f\n", d2);
		System.out.printf("%.6f\n", d3);
		System.out.printf("%.6f\n", dinfi);
	}

}