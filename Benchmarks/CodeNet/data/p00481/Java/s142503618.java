import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		char [][]c = new char[H][W];
		Queue<Point> queue = new ArrayDeque<Point>();
		for(int i = 0; i < H; i++) {
			String s = sc.next();
			for(int j = 0; j < W; j++) {
				c[i][j] = s.charAt(j);
				if(c[i][j] == 'S') {
					queue.add(new Point(j, i));
				}
			}
		}
		sc.close();
		int sum = 0;
		int []dx = {1, -1, 0, 0};
		int []dy = {0, 0, 1, -1};
		for(int i = 1; i <= N; i++) {
			int [][]color = new int[H][W];
			int [][]d = new int[H][W];
			Point p = queue.peek();
			color[p.y][p.x] = 1;
			while(true) {
				Point t = queue.poll();
				if(c[t.y][t.x] == (char)(i + '0')) {
					queue.clear();
					queue.add(t);
					sum += d[t.y][t.x];
					break;
				}
				for(int j = 0; j < 4; j++) {
					int nx = t.x + dx[j];
					int ny = t.y + dy[j];
					if(nx >= 0 && nx < W && ny >= 0 && ny < H) {
						if(color[ny][nx] == 0 && c[ny][nx] != 'X') {
							color[ny][nx] = 1;
							d[ny][nx] = d[t.y][t.x] + 1;
							queue.add(new Point(nx, ny));
						}
					}
				}
			}
		}
		System.out.println(sum);
	}
}
