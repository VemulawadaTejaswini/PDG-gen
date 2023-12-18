import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	static class Axis{
		TreeSet<Integer> nonvis;
		public Axis() {
			nonvis = new TreeSet<Integer>();
		}
		void add(int p){
			nonvis.add(p);
		}
		
	}
	static int solve(int K , int sx , int sy , int ex , int ey , char map[][]){
		int H = map.length;
		int W = map[0].length;
		int vis[][] = new int[H][W];
		Axis rows[] = new Axis[H];
		Axis cols[] = new Axis[W];
		for(int i = 0 ; i < H ; ++i){
			rows[i] = new Axis();
			for(int j = 0 ; j < W ;  ++j){
				if(map[i][j] == '@'){
					continue;
				}
				rows[i].add(j);
			}
		}
		for(int i = 0 ; i < W ; ++i){
			cols[i] = new Axis();
			for(int j = 0 ; j < H ; ++j){
				if(map[j][i] == '@'){
					continue;
				}
				cols[i].add(j);
			}
		}
		for(int i = 0 ; i < vis.length ; ++i){
			Arrays.fill(vis[i], -1);
		}
		int sp = sy * W + sx;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(sp);
		vis[sy][sx] = 0;
		while(!q.isEmpty()){
			int cp = q.poll();
			int cx = cp % W;
			int cy = cp / W;
			int d = vis[cy][cx];
			Axis row = rows[cy];
			Axis col = cols[cx];
//			System.out.println(cx+" "+cy+" "+d+" "+row.nonvis+" "+col.nonvis);
			for(int dir = -1 ; dir <= 1 ; dir += 2){
				for(int k = 1 ; k <= K ; ++k){
					int nx = dir * k + cx;
					if(nx < 0 || nx >= W){
						break;
					}
					if(row.nonvis.contains(nx)){
						row.nonvis.remove(nx);						
					}else{
						break;
					}
					if(vis[cy][nx] >= 0){
						continue;
					}
					vis[cy][nx] = d + 1;
					q.add(cy * W + nx);
				}
			}
			for(int dir = -1 ; dir <= 1 ; dir += 2){
				for(int k = 1 ; k <= K ; ++k){
					int ny = dir * k + cy;
					if(ny < 0 || ny >= H){
						break;
					}
					if(col.nonvis.contains(ny)){
						col.nonvis.remove(ny);						
					}else{
						break;
					}
					if(vis[ny][cx] >= 0){
						continue;
					}
					vis[ny][cx] = d + 1;
					q.add(ny * W + cx);
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
