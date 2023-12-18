package cad.week2.a2;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Scanner;

import cad.week2.a.Main.P;

public  class Main{
	public static class P{
		int x;
		int y;
		public P(){
			
		}
		public P(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
	}
	
	static P s = new P();
	static P g = new P();
	static int[][] graph = new int[1000][1000];
	static int[][] vis = new int[1000][1000];
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	static int n,w,h;
	static int step;
	static P[] aim = new P[10];
	
	public static int bfs(P s, P g){
		LinkedList<P> que = new LinkedList<>();
		
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 1000; j++) {
				vis[i][j] = -1;
			}
		}
		que.add(s);
		vis[s.x][s.y] = 0;
		while(!que.isEmpty()){
			P p = que.poll();
			//que.pop();
			if (p.x == g.x && p.y == g.y) {
				break;
			}
			for (int i = 0; i < 4; i++) {
				P n = new P();
				n.x = p.x + dx[i];
				n.y = p.y + dy[i];
				if(0<=n.x&&n.x<h&&0<=n.y&&n.y<w&&graph[n.x][n.y]!='X'&&vis[n.x][n.y]==-1){
		             
					   que.add(n);
		               vis[n.x][n.y] = vis[p.x][p.y]+1;
		           }
			}
		}
		return vis[g.x][g.y];
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner fin = new Scanner(System.in);		
		//?入数据
		h = fin.nextInt();
		w = fin.nextInt();
		n = fin.nextInt();
		fin.nextLine();
		for(int i=0; i<h; i++){
			String line = fin.nextLine().replace(" ", "");
			for(int j=0; j<w; j++){
				graph[i][j] = line.charAt(j);
				if(graph[i][j] == 'S'){
					s.x = i;
					s.y = j;
				}
				if(graph[i][j] >= '1' && graph[i][j] <= '9'){
					int t = graph[i][j] -'0';
					aim[t] = new P(i,j);
				}
			}
		}
		int step = 0; 
		for(int i=1; i<=n; i++){
			g.x = aim[i].x;
			g.y = aim[i].y;
			step += bfs(s,g);
			s.x = g.x;
			s.y = g.y;
		}		
		System.out.printf("%d\n", step);
	}
}