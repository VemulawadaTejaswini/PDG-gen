
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();

			int[][] result = new int[h][w];
			int x = 0;
			int y = 0;
			int number = 1;
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();

				for (int j = 0; j < a; j++) {
					result[x][y] = number;
					if (x == h - 1 && y % 2 == 0) {
						y++;
					} else if(x == 0 && y % 2 == 1) {
						y++;
					} else {
						if (y % 2 == 0) {
							x++;
						} else {
							x--;
						}
					}
				}
				number++;
			}

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					System.out.print(result[i][j]);
					if (j != w - 1) {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}
