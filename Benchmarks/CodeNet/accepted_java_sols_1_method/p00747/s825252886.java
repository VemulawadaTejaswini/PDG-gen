import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] DR = { 1, 0, -1, 0 };
	static int[] DC = { 0, 1, 0, -1 };

	public static void main(String[] args) throws Exception {
		while (true) {
			int W = sc.nextInt();
			int H = sc.nextInt();
			if (W == 0) break;
			int[][] f = new int[2 * H - 1][2 * W - 1];
			sc.nextLine();
			for (int i = 0; i < 2 * H - 1; ++i) {
				String line = sc.nextLine();
				for (int j = i % 2 == 0 ? 1 : 0; j < 2 * W - 1; j += 2) {
					f[i][j] = line.charAt(j) - '0';
				}
			}
			ArrayList<Point> list = new ArrayList<Point>();
			list.add(new Point(0, 0));
			int ans = 0;
			OUT: for (int i = 1; !list.isEmpty(); ++i) {
				ArrayList<Point> next = new ArrayList<Point>();
				for (Point p : list) {
					if (p.x == 2 * W - 2 && p.y == 2 * H - 2) {
						ans = i;
						break OUT;
					}
					for (int j = 0; j < 4; ++j) {
						int nr = p.y + DR[j];
						int nc = p.x + DC[j];
						if (nr < 0 || 2 * H - 1 <= nr || nc < 0 || 2 * W - 1 <= nc) continue;
						if (f[nr][nc] == 1 || f[nr + DR[j]][nc + DC[j]] == 1) continue;
						next.add(new Point(nc + DC[j], nr + DR[j]));
						f[nr + DR[j]][nc + DC[j]] = 1;
					}
				}
				list = next;
			}
			System.out.println(ans);
		}
	}

}