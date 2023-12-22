import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double t = sc.nextDouble();
		double a = sc.nextDouble();
		int[] arr = new int[n];
		double min = Double.MAX_VALUE;
		int res = -1;
		for (int i = 0; i<n; i++) {
			double tmp = Math.abs(a - (t - 0.006 * sc.nextInt()));
			if (tmp < min) {
				res = i+1;
				min = tmp;
			}
		}
		System.out.println(res);

	}
}
