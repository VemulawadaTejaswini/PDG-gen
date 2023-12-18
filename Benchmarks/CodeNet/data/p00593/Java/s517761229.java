import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		int case_ = 1;
		int[][] jpg;
		final String FORMAT = "%3d";
		while ((n = in.nextInt()) != 0) {
			jpg = new int[n][n];
			System.out.println("Case " + case_++ + ":");
			int num = 1;
			for (int col = 0; col < n; col++) {
				jpg[0][col] = num;
				if (col % 2 == 1) {
					num += 2 * (col + 1);
				} else {
					num++;
				}
			}
			for (int row = 1; row < n; row++) {
				boolean isUp = (row % 2 != 0);
				for (int col = 0; col < n; col++) {
					if (col != n - 1) {
						num = jpg[row - 1][col + 1];
						num += ((isUp) ? +1 : -1);
					} else {
						num = jpg[row - 1][col];
						num += (isUp) ? +1 : ((n - row) * 2);
					}
					jpg[row][col] = num;
					isUp = !isUp;
				}
			}
			for (int[] row : jpg) {
				for (int col : row) {
					System.out.print(String.format(FORMAT, col));
				}
				System.out.println();
			}
		}
	}
}