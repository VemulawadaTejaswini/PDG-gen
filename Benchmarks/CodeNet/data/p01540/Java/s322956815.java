import java.awt.Point;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Point[] t = new Point[n];
		for (int i = 0; i < n; i++) {
			t[i] = new Point(sc.nextInt(), sc.nextInt());
		}
		for (int i = 0; i < m; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int c = 0;
			for (int j = 0; j < n; j++) {
				int x = t[j].x;
				int y = t[j].y;
				if (x >= x1 && x <= x2 && y >= y1 && y <= y2)
					c++;
			}
			System.out.println(c);
		}

	}
}