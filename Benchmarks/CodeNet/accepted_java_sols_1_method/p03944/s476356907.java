import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int W = scanner.nextInt();
			int H = scanner.nextInt();
			int N = scanner.nextInt();

			int[][] coodinate = new int[W][H];
			// ironuri
			int x, y, action;
			while (N-- > 0) {
				x = scanner.nextInt();
				y = scanner.nextInt();
				action = scanner.nextInt();
				switch (action) {
				case 1:
					for (int i = 0; i < x; i++)
						for (int j = 0; j < H; j++)
							coodinate[i][j] = 1;
					break;
				case 2:
					for (int i = x; i < W; i++)
						for (int j = 0; j < H; j++)
							coodinate[i][j] = 1;
					break;
				case 3:
					for (int i = 0; i < W; i++)
						for (int j = 0; j < y; j++)
							coodinate[i][j] = 1;
					break;
				case 4:
					for (int i = 0; i < W; i++)
						for (int j = y; j < H; j++)
							coodinate[i][j] = 1;
					break;
				default:
					break;
				}
			}

			int cnt = 0;
			for (int i = 0; i < W; i++) {
				for (int j = 0; j < H; j++) {
					if (coodinate[i][j] == 0)
						cnt++;
				}
			}
			// output
			System.out.println(cnt);
		}
	}
}