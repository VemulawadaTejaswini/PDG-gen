import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		while(true){
			//Input
			final int w = sc.nextInt(); final int h = sc.nextInt();
			if(w==0 && h==0){ break; }
			final int xs = sc.nextInt(); final int ys = sc.nextInt();
			final int xg = sc.nextInt(); final int yg = sc.nextInt();
			final int n = sc.nextInt();
			int[][] map = new int[h+2][w+2];
			for(int i=0; i<n; ++i){
				final int c = sc.nextInt();  final int d = sc.nextInt();
				final int x = sc.nextInt();  final int y = sc.nextInt();
				for(int ty=y; ty<y+2+2*d; ++ty){
					for(int tx=x; tx<x+2+2*Math.abs(d-1); ++tx){
						map[ty][tx] = c;
					}
				}
			}
			
			//algorithm(BFS)
			boolean f = true;
			final int[][] ofs = {
					{1, 0}, {0, 1}, {-1, 0}, {0, -1}
			};
			Queue<int[]> que = new LinkedList<int[]>();
			int next[] = {xs, ys};
			que.offer(next);
			final int col = map[next[1]][next[0]];
			if(col == 0){
				System.out.println("NG");
				continue;
			}
			map[next[1]][next[0]] = 0;
			while(!que.isEmpty()){
				next = que.poll();
				if(next[0] == xg && next[1] == yg){
					System.out.println("OK");
					f = false;
					break;
				}
				for(int i=0; i<4; ++i){
					if(map[next[0] + ofs[i][0] ][next[1] + ofs[i][1] ] == col){
						final int e[] = {
								next[0] + ofs[i][0], next[1] + ofs[i][1]
						};
						que.offer(e);
						map[e[1]][e[0]] = 0;
					}
				}
			}
			if(f){
				System.out.println("NG");
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}