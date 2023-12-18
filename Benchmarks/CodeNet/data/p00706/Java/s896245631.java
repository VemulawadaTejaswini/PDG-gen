import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		while (true) {
			int n = s.nextInt();
			if (n == 0)
				break;

			int W = s.nextInt();
			int H = s.nextInt();

			int[][] field = new int[H][W];

			for (int i = 0; i < n; i++) {
				int x = s.nextInt();
				int y = s.nextInt();
				field[y - 1][x - 1] = 1;
			}

			int S = s.nextInt();
			int T = s.nextInt();

			int count = 0;
			int max = 0;

			for (int y = 0; y < H - T + 1; y++) {
				for (int x = 0; x < W - S + 1; x++) {
					for (int i = 0; i < T; i++) {
						for (int j = 0; j < S; j++) {
							// field[i + y][j + x] = 2;
							if (field[i + y][j + x] == 1)
								count++;
						}
					}
					if (max < count)
						max = count;
					count = 0;
				}
			}

			/*
			 * for (int i = 0; i < H; i++) { for (int j = 0; j < W; j++) {
			 * System.out.print(field[i][j]); } System.out.println(); }
			 */
			System.out.println(max);
		}
		s.close();
	}
}