import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = Integer.parseInt(sc.next());
		int h = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());
		int[][] r = new int[w + 1][h + 1];
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(sc.next());
			int y = Integer.parseInt(sc.next());
			int a = Integer.parseInt(sc.next());
			int sx = 0, sy = 0, fx = w + 1, fy = h + 1;
			if (a == 1)
				fx = x;
			else if (a == 2)
				sx = x + 1;
			else if (a == 3)
				fy = y;
			else
				sy = y + 1;
			for (int j = sx; j < fx; j++)
				for (int k = sy; k < fy; k++)
					r[j][k] = 1;
		}
		int minx = Integer.MAX_VALUE;
		int maxx = 0;
		int miny = Integer.MAX_VALUE;
		int maxy = 0;
		for (int i = 0; i <= w; i++)
			for (int j = 0; j <= h; j++) {
				if (r[i][j] != 1) {
					if (i < minx)
						minx = i;
					if (i > maxx)
						maxx = i;
					if (j < miny)
						miny = j;
					if (j > maxy)
						maxy = j;
				}
			}
		int ans = 0;
		if (minx != Integer.MAX_VALUE && miny != Integer.MAX_VALUE)
			ans = (maxx - minx) * (maxy - miny);
		System.out.println(ans);
	}
}