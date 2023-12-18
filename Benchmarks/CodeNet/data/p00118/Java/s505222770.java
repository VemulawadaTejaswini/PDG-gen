

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	int[][] map;
	int X,Y;
	boolean[][] visited;
	
	void run(){
		while(true){
			X = sc.nextInt();
			Y = sc.nextInt();
			sc.nextLine();
			if((X|Y)==0) break;
			map = new int[Y][X];
			visited = new boolean[Y][X];
			for (int i = 0; i < Y; i++) {
				String temp = sc.nextLine();
				for (int j = 0; j < X; j++) {
					switch(temp.charAt(j)){
						case '@':
							map[i][j] = 0;
							break;
						case '#':
							map[i][j] = 1;
							break;
						case '*':
							map[i][j] = 2;
							break;
					}
				}
			}
			
			solve();
			
		}
	}
	
	void solve(){
		int ans = 0;
		for (int i = 0; i < Y; i++) {
			for (int j = 0; j < X; j++) {
				if(!visited[i][j]){
					ans++;
					bfs(i,j);
				}
			}
		}
		System.out.println(ans);
		
	}
	
	void bfs(int y,int x){
		LinkedList<P> que = new LinkedList<P>();
		que.offer(new P(x,y));
		visited[y][x] = true;
		int[] dx = {0,0,-1,1};
		int[] dy = {-1,1,0,0};
		while(!que.isEmpty()){
			P p = que.poll();
			for (int i = 0; i < 4; i++) {
				P q = new P(p.x+dx[i],p.y+dy[i]);
					if(q.x>=0&&q.x<X&&q.y>=0&&q.y<Y&&!visited[q.y][q.x]&&map[q.y][q.x]==map[p.y][p.x]){
						que.offer(q);
						visited[q.y][q.x] = true;
					}
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}

class P{
	int x,y;

	public P(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public P() {
		super();
	}
	
	
}

