import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();

		int sum = 0;

		int[][] arr = new int[r + 1][c + 1];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sum += arr[i][j] = sc.nextInt();
			}
			arr[i][c] = sum;
			sum = 0;
		}

		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				sum += arr[j][i];
			}
			arr[r][i] = sum;
			sum = 0;
		}

		for (int i = 0; i < r; i++) {
			sum += arr[i][c];
		}
		arr[r][c] = sum;

		for (int i = 0; i < r + 1; i++) {
			for (int j = 0; j < c + 1; j++) {
				if (!(j == 0)) {
					System.out.print(" ");
				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}
}
