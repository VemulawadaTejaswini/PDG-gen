import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int r = scan.nextInt();
		int c = scan.nextInt();

		int[][] det = new int[r + 1][c + 1];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				det[i][j] = scan.nextInt();
				det[i][c] += det[i][j];
				det[r][j] += det[i][j];
			}
		}

		det[r][c] = det[r][c - 1] + det[r - 1][c];

		for (int i = 0; i < r + 1; i++) {
			for (int j = 0; j < c + 1; j++) {
				System.out.print(det[i][j] + " ");
			}
			System.out.println();
		}

	}
}