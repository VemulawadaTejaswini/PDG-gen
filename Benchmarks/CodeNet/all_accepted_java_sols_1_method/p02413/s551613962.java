import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int r, c;
		Scanner stdIn = new Scanner(System.in);

		r = stdIn.nextInt();
		c = stdIn.nextInt();

		int[][] ss = new int[r + 1][c + 1];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				ss[i][j] = stdIn.nextInt();
				ss[i][c] += ss[i][j];
				ss[r][j] += ss[i][j];
				ss[r][c] += ss[i][j];
			}
		}

		for (int i = 0; i < r + 1; i++) {
			for (int j = 0; j < c + 1; j++) {
				System.out.print(ss[i][j]);
				if (j != c) {
					System.out.print(" ");
				}
			}
			
				System.out.println();
			
		}

	}
}