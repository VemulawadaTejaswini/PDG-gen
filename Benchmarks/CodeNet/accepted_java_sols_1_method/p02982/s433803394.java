
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int D = sc.nextInt();
		double X[][] = new double[N][D];

		double ans = 0;
		int count = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < D; j++) {
				X[i][j] = sc.nextDouble();
			}
		}

		for (int i = 0; i < N; i++) {
			for (int k = i + 1; k < N; k++) {
				for (int j = 0; j < D; j++) {
					ans += Math.pow(X[i][j] - X[k][j], 2);
				}

				for (int l = 0; l * l <= ans; l++) {
					if (l * l == ans) {
						count++;
					}
				}
				ans = 0;
			}
		}
		System.out.print(count);
	}
}