import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int r = scan.nextInt();
		int c = scan.nextInt();
		scan.nextLine();

		int[][] arr = new int[r + 1][c + 1];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = scan.nextInt();
				arr[i][c] += arr[i][j];
				arr[r][j] += arr[i][j];
				arr[r][c] += arr[i][j];
			}
			scan.nextLine();
		}

		for (int i = 0; i <= r; i++) {
			for (int j = 0; j <= c; j++) {
				System.out.print(arr[i][j]);
				if (j != c) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		scan.close();
	}
}

