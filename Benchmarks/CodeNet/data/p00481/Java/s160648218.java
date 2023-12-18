import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	final int MAX = Integer.MAX_VALUE;
	class Pair {
		int x, y;
		Pair() {}
		Pair(int y, int x) {
			this.y = y; this.x = x;
		}
	}
	
	char[][] map;
	int[][] d;
	int h,w;
	
	void run() {
		Scanner scan = new Scanner(System.in);
		h = scan.nextInt();
		w = scan.nextInt();
		int n = scan.nextInt();
		Pair p = new Pair();
		map = new char[h][w];
		d = new int[h][w];
		
		for (int i = 0; i < h; i++) {
			String str = scan.next();
			for (int j = 0; j < w; j++) {
				d[i][j] = MAX;
				map[i][j] = str.charAt(j);
				if (map[i][j] == 'S') {
					p.y = i;
					p.x = j;
				}
			}
		}
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += solve(p, i);
			for (int j = 0; j < h; j++) {
				for (int k = 0; k < w; k++) {
					d[j][k] = MAX;
					if (map[j][k] == i + '0') {
						p.y = j; p.x = k;
					}
				}
			}
		}
		System.out.println(sum);
	}
	
	int solve(Pair p, int lebel) {
		Queue<Pair> que = new ArrayDeque<Pair>();
		int[] vi = { 0, 0, -1, 1};
		int[] vj = {-1, 1,  0, 0};
		que.add(p);
		
		d[p.y][p.x] = 0;
		
		while (!que.isEmpty()) {
			Pair pair = que.poll();
			if (map[pair.y][pair.x] == lebel + '0')
				return d[pair.y][pair.x];
			int y = 0, x = 0;
			for (int i = 0; i < 4; i++) {
				y = pair.y + vi[i];
				x = pair.x + vj[i];
				if (y >= 0 && y < h && x >= 0 && x < w && map[y][x] != 'X' && d[y][x] == MAX) {
					que.add(new Pair(y, x));
					d[y][x] = d[pair.y][pair.x] + 1;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}