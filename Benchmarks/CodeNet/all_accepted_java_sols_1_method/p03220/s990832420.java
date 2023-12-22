import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			double t = sc.nextDouble();
			double a = sc.nextDouble();
			double h[] = new double[n];
			double p[] = new double[n];
			double tmp = 1000000;
			int ans = 0;
			for (int i = 0; i < n; i++) {
				h[i] = sc.nextDouble();
				p[i] = Math.abs(t - h[i] * 0.006 - a);
				if (tmp > p[i]) {
					tmp = p[i];
					ans = i + 1;
				}
			}
			System.out.println(ans);
		}
	}
}