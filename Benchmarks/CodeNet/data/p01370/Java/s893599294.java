import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class Main {
	final int N = 30;
	final int[][] ofs = {
			{1, 0}, {1, 1}, {0, 1}, {-1, 0}, {-1,-1}, {0, -1}
	};
	boolean[][] visited;
	int[][] d;
	
	int bfs(int sx, int sy, int t){
		int c = 1;
		visited[sy+N][sx+N] = true;
		
		Queue<int[]> q = new LinkedList<int[]>();
		int[] ne = {sx, sy};
		q.offer(ne);
		while(true){
			if(q.isEmpty()){ break; };
			ne = q.poll();
			if(d[ne[1]+N][ne[0]+N] >= t){ continue; };
			
			for(int i=0; i<ofs.length; ++i){
				final int[] e = {
						ne[0] + ofs[i][0], ne[1] + ofs[i][1]
				};
				if(-N<=e[0] && e[0]<=N && -N<=e[1] && e[1]<=N){
					if(!visited[e[1]+N][e[0]+N]){
						visited[e[1]+N][e[0]+N] = true;
						c++;
						q.offer(e);
						d[e[1]+N][e[0]+N] = d[ne[1]+N][ne[0]+N] + 1;
					}
				}
			}
		}
		
		return c;
	}
	
	
	
	void io(){
		Scanner sc = new Scanner(System.in);
		while(true){
			visited = new boolean[N*2+1][N*2+1];	//filled false
			d = new int[N*2+1][N*2+1];	//filled 0
			
			final int t = sc.nextInt();  final int n = sc.nextInt();
			if(t==0 && n==0){ return; }
			for(int i=0; i<n; ++i){
				final int x = sc.nextInt();  final int y = sc.nextInt();
				visited[y+N][x+N] = true;
			}
			final int sx = sc.nextInt();  final int sy = sc.nextInt();
			
			System.out.println(bfs(sx, sy, t));
		}
	}
	
	public static void main(String[] args) {
		new Main().io();
	}
}