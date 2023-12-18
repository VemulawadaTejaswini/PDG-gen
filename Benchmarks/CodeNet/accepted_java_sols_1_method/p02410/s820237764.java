import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int matrix[][] = new int[m][n];
		int last[] = new int[m];
		int small[] = new int[n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			small[i] = scan.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < m; i++) {
			for (int p = 0; p < n; p++) {
				sum += matrix[i][p] * small[p];
			} last[i] = sum;
			sum = 0;
		}

		for (int i = 0; i < m; i++) {
			System.out.println(last[i]);
		}
}
}

