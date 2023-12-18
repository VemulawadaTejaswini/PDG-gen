import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
public class Main {
	public static final int[] blockW = {4,2};
	public static final int[] blockH = {2,4};
	public static final int INF = 100000000;
	public static final int[] vx = {1,0,-1,0};
	public static final int[] vy = {0,-1,0,1};
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if (w+h==0) {
				break;
			}

			Pos2d start = new Pos2d(sc.nextInt()-1,sc.nextInt()-1);
			Pos2d goal = new Pos2d(sc.nextInt()-1,sc.nextInt()-1);

			int n = sc.nextInt();
			int[][] maze = new int[w][h];
			for (int i=0;i<n;i++) {
				int c = sc.nextInt();
				int d = sc.nextInt();
				int x = sc.nextInt()-1;
				int y = sc.nextInt()-1;
				for (int j=0;j<blockW[d];j++) {
					for (int k=0;k<blockH[d];k++) {
						maze[x+j][y+k] = c;
					}
				}
			}

			boolean ans = false;
			if (maze[start.x][start.y]!=0) {
				int mc = maze[start.x][start.y];
				boolean[][] reach = new boolean[w][h];
				Queue<Pos2d> q = new ArrayDeque<Pos2d>();
				q.offer(start);
				while(!q.isEmpty()) {
					Pos2d p = q.poll();
					for(int i=0;i<4;i++) {
						int nx = p.x + vx[i];
						int ny = p.y + vy[i];
						if (nx>= 0 && nx<w && ny>=0 && ny<h) {
							if (maze[nx][ny]==mc) {
								if (!reach[nx][ny]) {
									reach[nx][ny]=true;
									q.offer(new Pos2d(nx,ny));
								}
							}
						}
					}
				}
				ans = reach[goal.x][goal.y];
			}
			System.out.println(ans ? "OK" : "NG");
		}
	}
}