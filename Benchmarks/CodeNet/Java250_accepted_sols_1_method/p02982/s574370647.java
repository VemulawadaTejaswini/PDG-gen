import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, D, ans;
		N = sc.nextInt();
		D = sc.nextInt();
		int[][] X = new int[N][D];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < D; j++) {
				X[i][j] = sc.nextInt();
			}
		}
		sc.close();
		ans = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int sum = 0;
				for (int k = 0; k < D; k++) {
					sum += Math.pow(X[i][k] - X[j][k], 2);
				}
				double rs = Math.sqrt(sum);
				if (rs == (int) rs) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
