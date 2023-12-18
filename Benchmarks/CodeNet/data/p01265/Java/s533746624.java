import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

//Ninja Legend
public class Main{

	int h, w, N, INF = 1<<29;
	char[][] map;
	int[][] d = {{-1,0},{0,1},{1,0},{0,-1}}, adj, id;
	int[][] dp;
	boolean[][][][] dash, jump;
	
	int get(int S, int last){
		if(dp[S][last]!=-1)return dp[S][last];
		int res = INF;
		for(int i=0;i<N;i++){
			if(i==last||((S>>i)&1)==0||adj[i][last]==INF)continue;
			int ns = S-(1<<last);
			res = Math.min(res, adj[i][last]+get(ns, i));
		}
		return dp[S][last] = res;
	}
	
	boolean dash(int i, int j, int k, int len){
		int gi = i+len*d[k][0], gj = j+len*d[k][1];
		if(!(0<=gi&&gi<h&&0<=gj&&gj<w)||map[gi][gj]!='.')return false;
		int pi = i, pj = j;
		for(int x=0;x<len;x++){
			pi += d[k][0]; pj += d[k][1];
			if(map[pi][pj]=='#')return false;
		}
		int i1 = i+d[(k+1)%4][0], j1 = j+d[(k+1)%4][1], i2 = i+d[(k+3)%4][0], j2 = j+d[(k+3)%4][1];
		boolean f1 = true, f2 = true;
		for(int x=0;x<=len;x++){
			if(map[i1][j1]!='#')f1 = false;
			if(map[i2][j2]!='#')f2 = false;
			i1 += d[k][0]; j1 += d[k][1]; i2 += d[k][0]; j2 += d[k][1];
		}
		return f1|f2;
	}
	boolean jump(int i, int j, int k, int len){
		int gi = i+len*d[k][0], gj = j+len*d[k][1];
		if(!(0<=gi&&gi<h&&0<=gj&&gj<w)||map[gi][gj]!='.')return false;
		for(int x=1;x<len;x++){
			int ni = i+x*d[k][0], nj = j+x*d[k][1];
			if(map[ni][nj]!='^')return false;
		}
		return true;
	}
	
	int[][][][] dist;
	void bfs(int i, int j){
		int ID = id[i][j];
		adj[ID][ID] = 0;
		dist = new int[h][w][4][3];
		for(int I=0;I<h;I++)for(int J=0;J<w;J++)for(int k=0;k<4;k++)for(int c=0;c<3;c++)dist[I][J][k][c] = INF;
		PriorityQueue<int[]> q = new PriorityQueue<int[]>(h*w, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return dist[a[0]][a[1]][a[2]][a[3]] - dist[b[0]][b[1]][b[2]][b[3]];
			}
		});
		for(int k=0;k<4;k++){
			dist[i][j][k][0] = 0;
			q.add(new int[]{i, j, k, 0});
		}
//		for(int k=0;k<4;k++){
//			int ni = i+d[k][0], nj = j+d[k][1];
//			if(map[ni][nj]=='.'){
//				dist[ni][nj][k][0] = 1;
//				q.add(new int[]{ni, nj, k, 0});
//				continue;
//			}
//			ni += d[k][0]; nj += d[k][1];
////			if(jump(i, j, k, 2)){
//			if(jump[i][j][k][2]){
//				dist[ni][nj][k][1] = 2;
//				q.add(new int[]{ni, nj, k, 1});
//			}
//		}
		while(!q.isEmpty()){
			int[] a = q.poll();
			int pi = a[0], pj = a[1], dir = a[2], pc = a[3], cost = dist[pi][pj][dir][pc];
			if(id[pi][pj]!=-1)adj[ID][id[pi][pj]] = Math.min(adj[ID][id[pi][pj]], cost);
			//dash mode
			if(pc==2){
				//run along wall
				for(int len=2;len<=5;len++){
//					if(dash(pi, pj, dir, len)){
					if(dash[pi][pj][dir][len]){
						int w = cost+len;
						if(w < dist[pi+len*d[dir][0]][pj+len*d[dir][1]][dir][0]){
							dist[pi+len*d[dir][0]][pj+len*d[dir][1]][dir][0] = w;
							q.add(new int[]{pi+len*d[dir][0], pj+len*d[dir][1], dir, 0});
						}
					}
				}
				//jump just two falls
//				if(jump(pi, pj, dir, 3)){
				if(jump[pi][pj][dir][3]){
					int w = cost+3;
					if(w < dist[pi+3*d[dir][0]][pj+3*d[dir][1]][dir][2]){
						dist[pi+3*d[dir][0]][pj+3*d[dir][1]][dir][2] = w;
						q.add(new int[]{pi+3*d[dir][0], pj+3*d[dir][1], dir, 2});
					}
				}
			}
			for(int k=0;k<4;k++){
				int ni = pi+d[k][0], nj = pj+d[k][1];
				if(map[ni][nj]=='.'){
					int w = cost + 1;
					int nc = dir==k?Math.min(2, pc+1):1;
					if(w < dist[ni][nj][dir][nc]){
						dist[ni][nj][dir][nc] = w;
						q.add(new int[]{ni, nj, dir, nc});
						continue;
					}
				}
				ni += d[k][0]; nj += d[k][1];
//				if(jump(pi, pj, k, 2)){
				if(jump[pi][pj][k][2]){
					int w = cost+2;
					int nc = 2;
					if(w < dist[ni][nj][dir][nc]){
						dist[ni][nj][dir][nc] = w;
						q.add(new int[]{ni, nj, dir, nc});
					}
				}
			}
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			h = sc.nextInt(); w = sc.nextInt();
			if((h|w)==0)break;
			map = new char[h][w];
			id = new int[h][w];
			for(int[]a:id)Arrays.fill(a, -1);
			N = 0;
			int si = 0, sj = 0;
			List<int[]> mark = new ArrayList<int[]>();
			for(int i=0;i<h;i++){
				map[i] = sc.next().toCharArray();
				for(int j=0;j<w;j++){
					if(map[i][j]=='%'){
						map[i][j] = '.'; si = i; sj = j;
						mark.add(new int[]{i, j});
					}
					if(map[i][j]=='*'){
						map[i][j] = '.'; id[i][j] = N++;
						mark.add(new int[]{i, j});
					}
				}
			}
			dash = new boolean[h][w][4][6];
			for(int i=0;i<h;i++)for(int j=0;j<w;j++){
				if(map[i][j]!='.')continue;
				for(int k=0;k<4;k++)for(int len=2;len<=5;len++)dash[i][j][k][len] = dash(i, j, k, len);
			}
			jump = new boolean[h][w][4][4];
			for(int i=0;i<h;i++)for(int j=0;j<w;j++){
				if(map[i][j]!='.')continue;
				for(int k=0;k<4;k++)for(int len=2;len<=3;len++)jump[i][j][k][len] = jump(i, j, k, len);
			}
			id[si][sj] = N;
			adj = new int[N+1][N+1];
			for(int[]a:adj)Arrays.fill(a, INF);
			for(int i=0;i<h;i++)for(int j=0;j<w;j++)if(id[i][j]!=-1)bfs(i, j);
//			for(int i=0;i<=N;i++){
//				for(int j=0;j<=N;j++)System.out.printf("%10d", adj[i][j]);
//				System.out.println();
//			}
			dp = new int[1<<(N+1)][N+1];
			for(int[]a:dp)Arrays.fill(a, -1);
			for(int i=0;i<=N;i++)dp[(1<<N)|(1<<i)][i] = adj[N][i];
			int max = 0, min = INF;
			for(int i=(1<<N)-1;i>=0;i--){
				int c = 0;
				for(int j=0;j<N;j++)if(((i>>j)&1)>0)c++;
				if(c<max)continue;
				int r = INF;
				for(int j=0;j<N;j++){
					if(((i>>j)&1)==0||adj[j][N]==INF)continue;
					r = Math.min(r, get(i+(1<<N), j) + adj[j][N]);
				}
				if(r==INF)continue;
				if(max<c){
					max = c; min = r;
				}
				else if(max==c&&r<min)min = r;
			}
			if(max==0)min = 0;
			System.out.println(max+" "+min);
		}
	}
	
	void debug(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}