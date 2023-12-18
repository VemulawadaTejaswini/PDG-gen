import java.util.*;
import static java.lang.System.*;

public class Main {

	
	class P {
		int x, y, count;
		P(int x, int y, int count) {
			this.x = x;
			this.y = y;
			this.count = count;
		}
	}
	
	Scanner sc = new Scanner(in);
	
	void run() {
		int w, h;
		while (true) {
			w = sc.nextInt(); h = sc.nextInt();
			if (w == 0) break;
			boolean[][] mapr = new boolean[h][w-1];
			boolean[][] mapc = new boolean[h-1][w];
			for (int i = 0; i < 2*h-1; i++) {
				if (i % 2 == 0) {
					for (int j = 0; j < w-1; j++) {
						mapr[i/2][j] = sc.nextInt() == 0;
					}
				} else {
					for (int j = 0; j < w; j++) {
						mapc[i/2][j] = sc.nextInt() == 0;
					}
				}
			}
			
			int[][] check = new int[h][w];
			Queue<P> q = new LinkedList<P>();
			q.add(new P(0,0,1));
			check[0][0] = 1;
			while(!q.isEmpty()) {
				P p = q.poll();
				if (p.x-1 >= 0 && mapr[p.y][p.x-1] && check[p.y][p.x-1] == 0) {
					check[p.y][p.x-1] = p.count+1;
					q.add(new P(p.x-1,p.y,p.count+1));
				}
				if (p.x+1 < w && mapr[p.y][p.x] && check[p.y][p.x+1] == 0) {
					check[p.y][p.x+1] = p.count+1;
					q.add(new P(p.x+1,p.y,p.count+1));
				}
				if (p.y-1 >= 0 && mapc[p.y-1][p.x] && check[p.y-1][p.x] == 0) {
					check[p.y-1][p.x] = p.count+1;
					q.add(new P(p.x,p.y-1,p.count+1));
				}
				if (p.y+1 < h && mapc[p.y][p.x] && check[p.y+1][p.x] == 0) {
					check[p.y+1][p.x] = p.count+1;
					q.add(new P(p.x,p.y+1,p.count+1));
				}
			}
			
			out.println(check[h-1][w-1]);
			
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}