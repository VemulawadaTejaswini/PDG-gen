import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[][] x = new int[n][d];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < d; j++) {
				x[i][j] = sc.nextInt();
			}
		}
		sc.close();

		int ans = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				long a = 0;
				for (int k = 0; k < d; k++) {
					a += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]);
				}
				int b = (int) Math.sqrt(a);
				int c = (int) Math.ceil(Math.sqrt(a));
				if (b == c) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
