import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0200();
	}
	
	class AOJ0200{
		int[] list;
		int cost[][]; //コスト
		int money[][];
		int time[][];
		int d[];//頂点sからの最短距離
		boolean used[];//素手に使用されたかのフラグ
		int V;//頂点数
		int INF;
		void dijkstra(int s,int k){
			if(k==0)cost = money;
			else cost = time;
			INF = Integer.MAX_VALUE;
			d = new int[V+1];
			used = new boolean[V+1];
			Arrays.fill(d,INF);
			Arrays.fill(used, false);
			d[s] = 0;
			while(true){
				int v=-1;
				for(int u=1;u<V+1;u++)if(!used[u]&&(v==-1||d[u]<d[v]))v=u;
				if(v==-1)break;
				used[v]=true;
				for(int u=1;u<V+1;u++)d[u] = Math.min(d[u],d[v]+cost[v][u]);
			}
//			for(int i=1;i<d.length;i++)System.out.println(d[i]);
		}
		public AOJ0200() {
			int lines = in.nextInt();
			int station = in.nextInt();
			V = station;
			money = new int[V+1][V+1];
			time = new int[V+1][V+1];
			for(int i=0;i<V+1;i++){
				Arrays.fill(money[i],Integer.MAX_VALUE/2);
				Arrays.fill(time[i],Integer.MAX_VALUE/2);
			}
			for(int i=0;i<lines;i++){
				int a = in.nextInt();
				int b = in.nextInt();
				money[a][b] = money[b][a] = in.nextInt();
				time[a][b] = time[b][a] = in.nextInt();
			}
			
//			for(int i=1;i<V+1;i++){
//				for(int s=1;s<V+1;s++)System.out.print(money[i][s]+" ");
//				System.out.println();
//			}
			
			int k = in.nextInt();
			for(int s=0;s<k;s++){
				int start = in.nextInt();
				int end = in.nextInt();
				int sw = in.nextInt();
				dijkstra(start, sw);
				System.out.println(d[end]);
			}
		}
	}
	

	class ACR007{
		public ACR007() {
			String input = in.next();
			int N = input.length();
			boolean[] pattn = new boolean[N];
			for(int i=0;i<N;i++)pattn[i]= input.charAt(i)=='o'? true:false;
			int result = 0;
			for(int s = 0;s < (1<<N); s++){
				
			}
		}
	}

}