import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int matrix[][] = new int[n+1][n+1];
		for (int i = 0; i < n; i++) {
			int v = scanner.nextInt();
			int k = scanner.nextInt();
			for (int j = 0; j < k; j++) {
				int vn = scanner.nextInt();
				matrix[v][vn] = 1;
			}
		}
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		scanner.close();

	}

}