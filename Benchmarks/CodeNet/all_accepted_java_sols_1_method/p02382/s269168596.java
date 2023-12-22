
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int[] x = new int[a];
		for (int i = 0; i < a; i++) {
			x[i] = scanner.nextInt();
		}
		int[] y = new int[a];
		for (int i = 0; i < a; i++) {
			y[i] = scanner.nextInt();
		}
		double[] p = new double[4];
		for (int i = 0; i < a; i++) {
			double p0 = Math.abs(x[i] - y[i]);
			p[1] += Math.pow(p0, 2);
			p[2] += Math.pow(p0, 3);
			p[3] = Math.max(p[3], p0);
			p[0] += p0;
		}
		p[1] = Math.sqrt(p[1]);
		p[2] = Math.cbrt(p[2]);
		for (double aa : p)
			System.out.println(aa);
	}
}