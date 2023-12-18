
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0) {
				break;
			}
			int[][] map = new int[n][n];
			int i = 1;
			int x = n / 2;
			int y = n - 1;
			while (n * n >= i) {
				map[y][x] = i;
				if (map[(y + 1) % n][(x + 1) % n] == 0) {
					y = (y + 1) % n;
					x = (x + 1) % n;
				} else {
					y = (y - 1) % n;
				}
				i++;
			}
			for (int k = 0; k < n; k++) {
				for (int j = 0; j < n; j++) {
					System.out.print(String.format("%4d", map[k][j]));
				}
				System.out.println();
			}
		}

	}
}