import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		int n = Integer.parseInt(line1);

		String line2 = sc.nextLine();
		String[] st2 = line2.split(" ");
		double[] x = new double[n];
		for (int i = 0; i < n; i++) {
			x[i] = Double.parseDouble(st2[i]);
		}

		String line3 = sc.nextLine();
		String[] st3 = line3.split(" ");
		double[] y = new double[n];
		for (int i = 0; i < n; i++) {
			y[i] = Double.parseDouble(st3[i]);
		}

		double D1 = 0;
		for (int i = 0; i < n; i++) {
			D1 += Math.abs(x[i] - y[i]);
		}
		System.out.println(D1);

		double D2 = 0;
		for (int i = 0; i < n; i++) {
			D2 += (x[i] - y[i]) * (x[i] - y[i]);
		}
		D2 = Math.sqrt(D2);
		System.out.println(D2);

		double D3 = 0;
		for (int i = 0; i < n; i++) {
			D3 += Math.abs((x[i] - y[i]) * (x[i] - y[i]) * (x[i] - y[i]));
		}
		D3 = Math.cbrt(D3);
		System.out.println(D3);

		double Di = 0;
		double[] doub = new double[n];
		for (int i = 0; i < n; i++) {
			doub[i] = Math.abs(x[i] - y[i]);
		}
		double max = 0;
		for (int i = 0; i < n; i++) {
			if (doub[i] > max) {
				max = doub[i];
			}
		}
		System.out.println(max);
	}

}