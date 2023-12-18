import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			if (N == 0) break;
			boolean[][] dir = new boolean[H][W];
			sc.nextLine();
			for (int i = 0; i < H; ++i) {
				String line = sc.nextLine();
				for (int j = 0; j < W; ++j) {
					dir[i][j] = line.charAt(j * 2) == '1';
				}
			}
			int[][] count = new int[H + 1][W + 1];
			count[0][0] = N - 1;
			for (int i = 0; i < H; ++i) {
				for (int j = 0; j < W; ++j) {
					count[i + 1][j] = count[i][j] / 2;
					count[i][j + 1] = count[i][j] / 2;
					if (count[i][j] % 2 == 1) {
						if (dir[i][j]) {
							count[i][j + 1] += 1;
						} else {
							count[i + 1][j] += 1;
						}
						dir[i][j] = !dir[i][j];
					}
				}
			}
			int r = 0;
			int c = 0;
			while (r < H && c < W) {
				if (dir[r][c]) {
					++c;
				} else {
					++r;
				}
			}
			System.out.println((r + 1) + " " + (c + 1));
		}
	}
}