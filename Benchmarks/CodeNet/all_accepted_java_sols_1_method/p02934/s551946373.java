import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] a = new double[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextDouble();
		}

		double tmp = 0;
		for (int i = 0; i < N; i++) {
			tmp += 1 / a[i];
		}

		double ans = 1 / tmp;

		System.out.printf("%.6f", ans);
	}
}