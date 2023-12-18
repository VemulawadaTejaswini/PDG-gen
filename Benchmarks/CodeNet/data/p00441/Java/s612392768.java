import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		boolean[][] map = new boolean[5001][5001];
		int[] xs = new int[3001];
		int[] ys = new int[3001];
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			for (int i = 0; i <= 5000; i++)
				for (int j = 0; j <= 5000; j++)
					map[i][j] = false;
			
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt(), y = sc.nextInt();
				map[x][y] = true;
				xs[i] = x;
				ys[i] = y;
			}
			int res = 0;
			for (int i = 0; i < n-1; i++) {
				for (int j = i+1; j < n; j++) {
					int dx = Math.abs(ys[i] -ys[j]), dy = Math.abs(xs[i] -xs[j]);
					if ((xs[i] >= xs[j]) == (ys[i] >= ys[j])) {
						int X1 = xs[i]-dx, X2 = xs[j]-dx, Y1 = ys[i]+dy, Y2 =ys[j]+dy;
						if (0 <= X1 && X1 <= 5000 && 0 <= X2 && X2 <= 5000 &&
								0 <= Y1 && Y1 <= 5000 && 0 <= Y2 && Y2 <= 5000 &&
								map[X1][Y1] && map[X2][Y2]) {
							res = Math.max(res, dx*dx+dy*dy);
						} else {
							X1 = xs[i]+dx; X2 = xs[j]+dx; Y1 = ys[i]-dy; Y2 =ys[j]-dy;
							if (0 <= X1 && X1 <= 5000 && 0 <= X2 && X2 <= 5000 &&
									0 <= Y1 && Y1 <= 5000 && 0 <= Y2 && Y2 <= 5000 &&
									map[X1][Y1] && map[X2][Y2]) {
								res = Math.max(res, dx*dx+dy*dy);
							}
						}
					} else {
						int X1 = xs[i]+dx, X2 = xs[j]+dx, Y1 = ys[i]+dy, Y2 =ys[j]+dy;
						if (0 <= X1 && X1 <= 5000 && 0 <= X2 && X2 <= 5000 &&
								0 <= Y1 && Y1 <= 5000 && 0 <= Y2 && Y2 <= 5000 &&
								map[X1][Y1] && map[X2][Y2]) {
							res = Math.max(res, dx*dx+dy*dy);
						} else {
							X1 = xs[i]-dx; X2 = xs[j]-dx; Y1 = ys[i]-dy; Y2 =ys[j]-dy;
							if (0 <= X1 && X1 <= 5000 && 0 <= X2 && X2 <= 5000 &&
									0 <= Y1 && Y1 <= 5000 && 0 <= Y2 && Y2 <= 5000 &&
									map[X1][Y1] && map[X2][Y2]) {
								res = Math.max(res, dx*dx+dy*dy);
							}
						}
					}
				}
			}
			out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}