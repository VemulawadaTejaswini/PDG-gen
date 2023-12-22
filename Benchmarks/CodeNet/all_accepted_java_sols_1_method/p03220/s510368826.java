import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		double h[] = new double[N];
		Double min = Double.MAX_VALUE;

		int ans = 0;

		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
			double tmp = Math.abs(T - h[i]*0.006 - A);
			if (tmp <= min) {
				min = tmp;
				ans = i+1;
			}
		}
		System.out.println(ans);
	}
}
