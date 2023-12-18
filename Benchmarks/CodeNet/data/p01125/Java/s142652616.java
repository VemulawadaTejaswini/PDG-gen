
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			boolean[][] map = new boolean[21][21];
			for (int i = 0; i < n; i++) {
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				map[y][x] = true;
			}
			int m = scanner.nextInt();
			int x = 10;
			int y = 10;
			while (m-- > 0) {
				char d = scanner.next().charAt(0);
				int ny = (d == 'N' ? 1 : 0) - (d == 'S' ? 1 : 0);
				int nx = (d == 'E' ? 1 : 0) -( d == 'W' ? 1 : 0);
				int num = scanner.nextInt();
				while (num-- > 0) {
					y += ny;
					x += nx;
					if (map[y][x]) {
						n--;
						map[y][x] = false;
					}
				}
			}
			System.out.println(n == 0 ? "Yes" : "No");
		}
	}
}