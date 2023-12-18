import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
public class Main {
	static int w;
	static int h;
	static int gx;
	static int gy;
	public static final int INF = 100000000;
	public static final int[] vx = {1,0,-1,0};
	public static final int[] vy = {0,-1,0,1};
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		w = sc.nextInt();
		h = sc.nextInt();
		char[][] s = new char[w][h];
		for (int y=0;y<h;y++) {
			String line = sc.next();
			for (int x=0;x<w;x++) {
				s[x][y] = line.charAt(x);
				if (s[x][y]=='t') {
					gx = x;
					gy = y;
				}
			}
		}
		int n = sc.nextInt();
		int[] ox = new int[n];
		int[] oy = new int[n];
		for(int i=0;i<n;i++) {
			ox[i] = sc.nextInt();
			oy[i] = sc.nextInt();
		}

		int ans;
		if (solve(s)) {
			ans = 0;
		}else{
			ans = -1;
			for (int i=0;i<n;i++) {
				s[ox[i]][oy[i]] = '.';
				if (solve(s)) {
					ans = i+1;
					break;
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
	public static boolean solve(char[][] s) {
		int[][] d = new int[w][h];
		for (int i=0;i<w;i++) {
			for (int j=0;j<h;j++) {
				d[i][j] = INF;
			}
		}
		d[0][0] = 0;
		Queue<Pos2d> q = new ArrayDeque<Pos2d>();
		q.offer(new Pos2d(0,0));
		while(!q.isEmpty()) {
			Pos2d p = q.poll();
			for(int i=0;i<4;i++) {
				int nx = p.x + vx[i];
				int ny = p.y + vy[i];
				if (nx>= 0 && nx<w && ny>=0 && ny<h) {
					if (s[nx][ny]!='#') {
						if (d[nx][ny]>d[p.x][p.y]+1) {
							d[nx][ny] = d[p.x][p.y]+1;
							q.offer(new Pos2d(nx,ny));
						}
					}
				}
			}
		}
		return d[gx][gy]!=INF;
	}
}
class Pos2d {
	public int x = 0;
	public int y = 0;
	public Pos2d(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(Object o) {
		Pos2d p = (Pos2d) o;
		return (this.x==p.x && this.y==p.y);
	}
	public String toString() {
		return "("+x+","+y+")";
	}
}