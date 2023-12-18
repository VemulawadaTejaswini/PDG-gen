import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int[] p = new int[4];
		for (int i = 0; i < 4; ++i) {
			p[i] = sc.nextInt() - 1;
		}
		int[] x = new int[4];
		int[] y = new int[4];
		int ans = 999;
		for (int i = 1; i <= N; ++i) {
			for (int j = 0; j < 4; ++j) {
				x[j] = p[j] % i;
				y[j] = p[j] / i;
			}
			ans = Math
					.min(ans, Math.abs(x[0] - x[1]) + Math.abs(y[0] - y[1]) + Math.abs(x[2] - x[3]) + Math.abs(y[2] - y[3]));
		}
		System.out.println(ans);
	}
}