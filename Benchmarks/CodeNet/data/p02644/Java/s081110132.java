import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int solve(int K , int sx , int sy , int ex , int ey , char map[][]){
		int H = map.length;
		int W = map[0].length;
		int vis[][] = new int[H][W];
		for(int i = 0 ; i < vis.length ; ++i){
			Arrays.fill(vis[i], -1);
		}
		boolean queued[][] = new boolean[H][W];
		int dx[] = {1 , -1 , 0 , 0};
		int dy[] = {0 ,  0 , 1 , -1};
		int sp = sy * W + sx;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(sp);
		vis[sy][sx] = 0;
		queued[sy][sx] = true;
		while(!q.isEmpty()){
			int cp = q.poll();
			int cx = cp % W;
			int cy = cp / W;
			int d = vis[cy][cx];
			for(int dir = 0 ; dir < dx.length ; ++dir){
				for(int k = 1 ; k <= K ; ++k){
					int nx = dx[dir] * k + cx;
					int ny = dy[dir] * k + cy;
					if(nx < 0 || nx >= W){
						break;
					}
					if(ny < 0 || ny >= H){
						break;
					}
					if(map[ny][nx] == '@'){
						break;
					}
					if(vis[ny][nx] >= 0){ // ?
						break;
					}
					if(queued[ny][nx]){
						break;
					}
					queued[ny][nx] = true;
					vis[ny][nx] = d + 1;
					q.add(ny * W + nx);
				}
			}
		}
		return vis[ey][ex];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		int sx = sc.nextInt() - 1;
		int sy = sc.nextInt() - 1;
		int ex = sc.nextInt() - 1;
		int ey = sc.nextInt() - 1;
		char map[][] = new char[H][W];
		for(int i = 0 ; i < H ; ++i){
			map[i] = sc.next().toCharArray();
		}
		int ret = solve(K , sy , sx , ey , ex , map);
		System.out.println(ret);
	}
}
