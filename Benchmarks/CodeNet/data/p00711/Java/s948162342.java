import static java.lang.System.in;
import static java.lang.System.out;

import java.util.*;


public class Main {
	Scanner sc = new Scanner(in);
	
	void run() {
		StringTokenizer st;
		while (true) {
			st = new StringTokenizer(sc.nextLine());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());

			if (w == 0 && h == 0)
				break;
			boolean[][] room = new boolean[h][w];
			String s;
			int posx, posy;
			posx = posy = 0;
			for (int i = 0; i < h; i++) {
				s = sc.nextLine();
				for (int j = 0; j < w; j++) {
					if (s.substring(j,j+1).equals("."))
						room[i][j] = true;
					else if (s.substring(j,j+1).equals("@")) {
						room[i][j] = true;
						posx = i;
						posy = j;
					}
				}
			}

			
			int[] dx = {-1, 0, 1, 0};
			int[] dy = {0, -1, 0, 1};
			
			Queue<Integer> qx = new LinkedList<Integer>();
			Queue<Integer> qy = new LinkedList<Integer>();
			qx.add(posx);
			qy.add(posy);
			int ans = -1;
			int x, y;
			while (!qx.isEmpty()) {
				x = qx.poll();
				y = qy.poll();
				ans++;
				for (int i = 0; i < 4; i++) {
					if (x+dx[i] >= 0 && x+dx[i] < h 
							&& y+dy[i] >= 0 && y+dy[i] < w
							&& room[x+dx[i]][y+dy[i]]) {
						room[x+dx[i]][y+dy[i]] = false;
						qx.add(x+dx[i]);
						qy.add(y+dy[i]);
					}
				}
			}
			
			out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}
}