import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] x = new double[n];
		double[] y = new double[n];

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			y[i] = sc.nextInt();
		}

		double D1 = 0, D2 = 0,D3=0, D = 0;

		for (int i = 0; i < n; i++) {
			D1 += Math.abs(x[i] - y[i]);
            D2 += Math.pow(Math.abs(x[i] - y[i]), 2);
            D3 += Math.pow(Math.abs(x[i] - y[i]), 3);
            D=Math.max(D,Math.abs(x[i]-y[i]));
		}
		System.out.printf("%.6f\n",D1);
		System.out.printf("%.6f\n",Math.sqrt(D2));
		System.out.printf("%.6f\n",Math.cbrt(D3));
        System.out.printf("%.6f\n",D);
        
		sc.close();

	}

}

