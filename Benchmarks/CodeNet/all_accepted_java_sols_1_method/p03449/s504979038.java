import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[2][n];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		sc.close();

		int ans = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				if (j < i) {
					sum += a[0][j];
				} else if (j == i) {
					sum += a[0][j];
					sum += a[1][j];
				} else {
					sum += a[1][j];
				}
			}
			ans = Math.max(ans, sum);
		}
		System.out.println(ans);
	}
}
