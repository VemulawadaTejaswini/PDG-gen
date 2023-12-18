import java.awt.Point;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int m = 1; m <= n; m++) {
			sc.nextLine();
			sc.nextLine();
			System.out.println("Data " + m+":");
			int[][] map = new int[14][14];
			for (int i = 0; i < 14; i++) {
				Arrays.fill(map[i], -1);
			}
			for (int i = 3; i <= 10; i++) {
				char tmp[] = sc.nextLine().toCharArray();
				for (int j = 0; j < 8; j++) {
					map[i][j + 3] = tmp[j] - '0';
				}
			}
			int sx = sc.nextInt()+2;
			int sy = sc.nextInt()+2;
			Queue<Point> q = new LinkedList<Point>();
			q.add(new Point(sx, sy));
			map[sy][sx] = 0;
			while (q.peek() != null) {
				Point p = q.poll();
				int x = p.x;
				int y = p.y;
				int dx[] = { 0, 1, 0, -1, 0, 2, 0, -2, 0, 3, 0, -3 };
				int dy[] = { 1, 0, -1, 0, 2, 0, -2, 0, 3, 0, -3, 0 };
				for (int i = 0; i < 12; i++) {
					int nx = x + dx[i];
					int ny = y + dy[i];
					if (map[ny][nx] == -1)
						continue;
					if (map[ny][nx] == 1) {
						map[ny][nx] = 0;
						q.add(new Point(nx, ny));
					}
				}
			}
			for (int i = 3; i <= 10; i++) {
				for (int j = 3; j <= 10; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
		}
	}
}