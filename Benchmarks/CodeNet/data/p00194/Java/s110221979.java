import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

//Byakko Delivery Company
public class Main{

	int[] trans(String s){
		String[] t = s.split("-");
		int a = t[0].charAt(0)-'a';
		int b = Integer.parseInt(t[1])-1;
		return new int[]{a, b};
	}
	
	int INF = 1<<29;
	int[][][] dist;
	int[][] move = {{-1,0},{0,1},{1,0},{0,-1}};
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int h = sc.nextInt(), w = sc.nextInt();
			if((h|w)==0)break;
			int D = sc.nextInt();
			int[][] e = new int[h*w][h*w];
			for(int[]a:e)Arrays.fill(a, D);
			int ns = sc.nextInt();
			int[] k = new int[h*w];
			while(ns--!=0){
				int[] t = trans(sc.next());
				k[t[0]*w+t[1]] = sc.nextInt();
			}
			int nc = sc.nextInt();
			while(nc--!=0){
				int[] t1 = trans(sc.next()), t2 = trans(sc.next());
				if(t1[0]==t2[0])for(int j=Math.min(t1[1], t2[1]);j<Math.max(t1[1], t2[1]);j++)e[t1[0]*w+j][t1[0]*w+j+1]=e[t1[0]*w+j+1][t1[0]*w+j]=INF;
				else for(int i=Math.min(t1[0], t2[0]); i<Math.max(t1[0], t2[0]);i++)e[i*w+t1[1]][(i+1)*w+t1[1]]=e[(i+1)*w+t1[1]][i*w+t1[1]]=INF;
			}
			int njj = sc.nextInt();
			while(njj--!=0){
				int[] t1 = trans(sc.next()), t2 = trans(sc.next());
				int d = sc.nextInt();
				if(t1[0]==t2[0])for(int j=Math.min(t1[1], t2[1]);j<Math.max(t1[1], t2[1]);j++)e[t1[0]*w+j][t1[0]*w+j+1]=e[t1[0]*w+j+1][t1[0]*w+j]=D+d;
				else for(int i=Math.min(t1[0], t2[0]); i<Math.max(t1[0], t2[0]);i++)e[i*w+t1[1]][(i+1)*w+t1[1]]=e[(i+1)*w+t1[1]][i*w+t1[1]]=D+d;
			}
			int[] start = trans(sc.next()), goal = trans(sc.next());
			dist = new int[h][w][4];
			for(int i=0;i<h;i++)for(int j=0;j<w;j++)for(int d=0;d<4;d++)dist[i][j][d] = INF;
			dist[start[0]][start[1]][1] = 0;
			PriorityQueue<int[]> q = new PriorityQueue<int[]>(h, new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
					return dist[o1[0]][o1[1]][o1[2]]-dist[o2[0]][o2[1]][o2[2]];
				}
			});
			q.add(new int[]{start[0], start[1], 1});
			while(!q.isEmpty()){
				int[] a = q.poll();
				int i = a[0], j = a[1], dir = a[2];
				if(i==goal[0]&&j==goal[1]){
					System.out.println(dist[i][j][dir]); break;
				}
				for(int m=3;m<=5;m++){
					int nd = (dir+m)%4;
					int ni = i+move[nd][0], nj = j+move[nd][1];
					if(0<=ni&&ni<h&&0<=nj&&nj<w&&e[i*w+j][ni*w+nj]!=INF){
						int nt = dist[i][j][dir] + e[i*w+j][ni*w+nj];
						if(k[ni*w+nj]==0){
							if(nt < dist[ni][nj][nd]){
								dist[ni][nj][nd] = nt;
								q.add(new int[]{ni, nj, nd});
							}
						}
						else{
							boolean nsblue = (nt/k[ni*w+nj])%2==0;
							if(nd%2==0&&!nsblue||nd%2==1&&nsblue)continue;
							if(nt < dist[ni][nj][nd]){
								dist[ni][nj][nd] = nt;
								q.add(new int[]{ni, nj, nd});
							}
						}
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}