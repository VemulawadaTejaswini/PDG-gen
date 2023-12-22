import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int H = sc.nextInt();
			int W = sc.nextInt();
			sc.nextLine();

			String[][] board = new String[H][W];

			for (int i = 0; i < H; i++) {
				board[i] = sc.nextLine().split("");
			}

			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if ("#".equals(board[i][j])) {
						continue;
					}

					int bombCount = 0;
					if (i > 0) {
						if (j > 0 && "#".equals(board[i - 1][j - 1])) {
							bombCount++;
						}
						if ("#".equals(board[i - 1][j])) {
							bombCount++;
						}
						if (j + 1 < W && "#".equals(board[i - 1][j + 1])) {
							bombCount++;
						}
					}
					if (i + 1 < H) {
						if (j > 0 && "#".equals(board[i + 1][j - 1])) {
							bombCount++;
						}
						if ("#".equals(board[i + 1][j])) {
							bombCount++;
						}
						if (j + 1 < W && "#".equals(board[i + 1][j + 1])) {
							bombCount++;
						}
					}
					if (j > 0 && "#".equals(board[i][j - 1])) {
						bombCount++;
					}
					if (j + 1 < W && "#".equals(board[i][j + 1])) {
						bombCount++;
					}

					board[i][j] = Integer.toString(bombCount);
				}
			}

			for (String[] sline : board) {
				System.out.println(String.join("", sline));
            }
			sc.close();
		}
}
