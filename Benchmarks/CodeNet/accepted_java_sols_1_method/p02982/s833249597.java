import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), d = sc.nextInt(), i, j;
		int[][] p = new int[n][d];
		for (i = 0; i < n; i++) {
			for (j = 0; j < d; j++) {
				p[i][j] = sc.nextInt();
			}
		}
		int count = 0;
		for (i = 0; i < n - 1; i++) {
			for (j = i + 1; j < n; j++) {
				int sum = 0;
				for (int k = 0; k < d; k++) {
					sum += (p[i][k] - p[j][k]) * (p[i][k] - p[j][k]);
				}
				double sqrt = Math.sqrt(sum);
				if (0 == sqrt % 1) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
