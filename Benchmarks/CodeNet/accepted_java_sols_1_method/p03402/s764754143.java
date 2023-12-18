import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = 100;
		int w = 100;
		char[][] c = new char[h][w];

		// Initialize
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (i < h/2) {
					c[i][j] = '#';
				} else {
					c[i][j] = '.';
				}
			}
		}

		for (int i = 0; i < a - 1; i++) {
			int y = (i * 2 / w) * 2;
			int x = (i * 2) % w;
			c[y][x] = '.';
		}
		for (int i = 0; i < b - 1; i++) {
			int y = (h - 1) - (i * 2 / w) * 2;
			int x = (i * 2) % w;
			c[y][x] = '#';
		}

		System.out.println(h + " " + w);
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(c[i][j]);
			}
			System.out.print("\n");
		}
	}
}
