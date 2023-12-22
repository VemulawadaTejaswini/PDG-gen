import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int r = sc.nextInt();
		int matrix[][] = new int[c + 1][r + 1];
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				matrix[i][r] += matrix[i][j];
			}
		}

		for (int i = 0; i < c; i++) {
			for (int j = 0; j <= r; j++) {
				matrix[c][j] += matrix[i][j];
			}
		}

		for (int i = 0; i <= c; i++) {
			for (int j = 0; j <= r; j++) {
				System.out.print(matrix[i][j]);
				if (!(j == r))
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}