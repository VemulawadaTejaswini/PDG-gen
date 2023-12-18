import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Manhattan Wiring
public class Main{

	int h, w, res, INF = 1<<29, D3, L = 200000, X;
	int[][] a, dist;
	boolean[][] u;
	int[][] p2, p3;
	int[][] d = {{-1,0},{0,1},{1,0},{0,-1}};
	int[][] bad = {
			{0,1,2},
			{1,0,3},
			{1,2,3},
			{2,1,0},
			{3,2,1},
			{2,3,0},
			{3,0,1},
			{0,3,2}
	};
	int[][] no = {
			{3,0,0,1,0},
			{3,2,2,1,2},
			{0,1,1,2,1},
			{0,3,3,2,3},
			{1,2,2,3,2},
			{1,0,0,3,0},
			{2,3,3,0,3},
			{2,1,1,0,1}
	};
	int[][] bp = {
			{2,0},
			{-2,0},
			{0,-2},
			{0,2},
			{-2,0},
			{2,0},
			{0,2},
			{0,-2}
	};
	int[][] b = {{3,5},{4,6},{0,7},{1,2}};
	int[][] b5 = {{0,5},{2,7},{1,4},{3,6}};
	int[] p;
	
	void dfs(int i, int j, int c, int pre){
		if(L<=X&&res==INF)return;
		if(3<=c){
			for(int k=0;k<2;k++){
				if(p[c-3]==bad[b[pre][k]][0]&&p[c-2]==bad[b[pre][k]][1]&&p[c-1]==bad[b[pre][k]][2])return;
			}
		}
		if(5<=c){
			for(int k=0;k<2;k++){
				if(p[c-5]==no[b5[pre][k]][0]&&p[c-4]==no[b5[pre][k]][1]&&p[c-3]==no[b5[pre][k]][2]&&p[c-2]==no[b5[pre][k]][3]&&p[c-1]==no[b5[pre][k]][4]&&a[i+bp[b5[pre][k]][0]][j+bp[b5[pre][k]][1]]==0)return;
			}
		}
		if(i==p2[1][0]&&j==p2[1][1]){
			X++;
			res = Math.min(res, c+bfs());
			return;
		}
		if(res<=c+Math.abs(i-p2[1][0])+Math.abs(j-p2[1][1])+D3)return;
		for(int K=pre;K<pre+4;K++){
			int k = K%4;
			int ni = i+d[k][0], nj = j+d[k][1];
			if(0<=ni&&ni<h&&0<=nj&&nj<w&&a[ni][nj]!=1&&a[ni][nj]!=3&&!u[ni][nj]){
				u[ni][nj] = true;
				p[c] = k;
				dfs(ni, nj, c+1, k);
				u[ni][nj] = false;
			}
		}
	}
	
	int bfs(){
		for(int[]x:dist)Arrays.fill(x, INF);
		dist[p3[0][0]][p3[0][1]] = 0;
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[]{p3[0][0], p3[0][1]});
		int r = INF;
		while(!q.isEmpty()){
			int[] x = q.poll();
			int pi = x[0], pj = x[1];
			if(pi==p3[1][0]&&pj==p3[1][1]){
				r = dist[pi][pj]; break;
			}
			for(int k=0;k<4;k++){
				int ni = pi+d[k][0], nj = pj+d[k][1];
				if(0<=ni&&ni<h&&0<=nj&&nj<w&&!u[ni][nj]&&dist[ni][nj]==INF&&a[ni][nj]!=1){
					dist[ni][nj] = dist[pi][pj]+1;
					q.add(new int[]{ni, nj});
				}
			}
		}
		return r;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		dist = new int[9][9];
		for(;;){
			h = sc.nextInt(); w = sc.nextInt();
			if((h|w)==0)break;
			a = new int[h][w];
			u = new boolean[h][w];
			p2 = new int[2][2]; p3 = new int[2][2];
			int I2 = 0, I3 = 0;
			for(int i=0;i<h;i++)for(int j=0;j<w;j++){
				a[i][j]=sc.nextInt();
				if(a[i][j]==2){
					p2[I2][0] = i; p2[I2][1] = j; I2++;
				}
				if(a[i][j]==3){
					p3[I3][0] = i; p3[I3][1] = j; I3++;
				}
			}
			res = INF;
			p = new int[100];
			u[p2[0][0]][p2[0][1]] = true;
			X = 0;
			D3 = Math.abs(p3[0][0]-p3[1][0])+Math.abs(p3[0][1]-p3[1][1]);
			dfs(p2[0][0], p2[0][1], 0, 0);
			System.out.println(res==INF?0:res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}