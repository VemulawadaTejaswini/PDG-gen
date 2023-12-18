import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), m = scanner.nextInt();
		int[][] matrix = new int[n][m];
		int[] vector = new int[n];

		for (int i = 0; i < n; i++) {
			for (int i2 = 0; i2 < m; i2++) {
				matrix[i][i2] = scanner.nextInt();
			}
		}

		for (int i = 0; i < m; i++) {
			int number = scanner.nextInt();

			for (int i2 = 0; i2 < n; i2++) {
				vector[i2] += matrix[i2][i] * number;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(vector[i]);
		}
	}
}