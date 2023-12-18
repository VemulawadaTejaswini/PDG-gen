import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			int n = sc.nextInt();
			double [] x = new double[n];
			double [] y = new double[n];

			double[] p = new double[4];

			for (int i=0; i<n; i++) {
				x[i] = sc.nextDouble();
			}

			for (int i=0; i<n; i++) {
				y[i] = sc.nextDouble();
			}

			double max = 0;
			
			for (int i=0; i<n; i++) {
				p[0] += Math.abs(x[i]-y[i]);  //p1
				p[1] += Math.pow(Math.abs(x[i]-y[i]),2);  //p2
				p[2] += Math.pow(Math.abs(x[i]-y[i]),3);  //p3
				max = Math.max(max,Math.abs(x[i]-y[i]));
			}
			p[1] = Math.sqrt(p[1]);
			p[2] = Math.cbrt(p[2]);
			p[3] = max;


			for (int i=0; i<4; i++) System.out.printf("%.8f\n", p[i]);
		}
	}
}

