
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
			int[][] map = new int[n][2];
			for (int i = 0; i < n; i++) {
				map[i][0] = scanner.nextInt();
			}
			for (int i = 0; i < n; i++) {
				map[i][1] = scanner.nextInt();
			}

			int[] ans = new int[2];
			for (int i = 0; i < 2; i++) {
				int x = i;
				int y = 0;
				int count = 0;
				boolean[][] b = new boolean[n][2];
				while (true) {
					if (b[y][x]) {
						ans[i] = Integer.MAX_VALUE;
						break;
					}
					if (y == n - 1 && map[y][x] != 2) {
						ans[i] = count;
						break;
					}
					b[y][x] = true;
					if ( map[y][x] == 1 && map[y + 1][x] == 1)
						y++;
					else if (map[y][x] == 2)
						y--;
					else {
						if (x == 0)
							x = 1;
						else
							x = 0;
						if (y == n - 2)
							y += 1;
						else
							y += 2;
						count++;
					}
				}
			}
			if (ans[0] == Integer.MAX_VALUE && ans[1] == Integer.MAX_VALUE)
				System.out.println("NA");
			else
				System.out.println(ans[0] < ans[1] ? ans[0] : ans[1]);
		}
	}
}