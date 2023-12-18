import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws java.io.IOException {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			Point[] tile = new Point[n];
			tile[0] = new Point(0, 0);

			for (int i = 1; i <= n - 1; i++) {
				tile[i] = new Point();
				int near = sc.nextInt();
				int d = sc.nextInt();
				switch (d) {
				case 0:
					tile[i].x = tile[near].x - 1;
					tile[i].y = tile[near].y;
					break;
				case 1:
					tile[i].x = tile[near].x;
					tile[i].y = tile[near].y - 1;
					break;
				case 2:
					tile[i].x = tile[near].x + 1;
					tile[i].y = tile[near].y;
					break;
				case 3:
					tile[i].x = tile[near].x;
					tile[i].y = tile[near].y + 1;
					break;

				}

			}
			int w_max = 0;
			int h_max = 0;
			int w_min = 0;
			int h_min = 0;
			for (Point p : tile) {
				w_max = Math.max(w_max, p.x);
				w_min = Math.min(w_min, p.x);
				h_max = Math.max(h_max, p.y);
				h_min = Math.min(h_min, p.y);
			}
			// System.out.println(h_max);
			// System.out.println(h_min);
			w_max++;
			// w_min--;
			h_max++;
			// h_min--;
			// System.out.println(Arrays.toString(tile));
			System.out.println((w_max - w_min) + " " + (h_max - h_min));
		}
	}
}