import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int matrixA[][] = new int[n][m];
		int matrixB[] = new int[m];
		int matrixC[] = new int[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				matrixA[i][j] = sc.nextInt();
		}

		for (int i = 0; i < m; i++)
			matrixB[i] = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				matrixC[i] += matrixA[i][j] * matrixB[j];
		}

		for (int i = 0; i < n; i++)
			System.out.println(matrixC[i]);

	}

}