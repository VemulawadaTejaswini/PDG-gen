import java.awt.CardLayout;
import java.awt.geom.Point2D;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Main {	
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new AOJ0149();
	}
	
	class AOJ0149{
		public AOJ0149() {
			int[] left = new int[4];
			int[] right = new int[4];
			double[] hyou = {0.2,0.6,1.1,10000.0};
			while (in.hasNext()) {
				double a = in.nextDouble();
				double b = in.nextDouble();
				for(int i=0;i<4;i++)if(hyou[i]>a){
					left[i]++;
					break;
				}
				for(int i=0;i<4;i++)if(hyou[i]>b){
					right[i]++;
					break;
				}
			}
			for(int i=3;i>=0;i--){
				System.out.println(left[i]+" "+right[i]);
			}
			
			
		}
	}
	
	class AOJ0106{
		int n;
		int bfs(int kei,int kin){
			if(kei>=n)return kin;
			int[] ryou = {200,300,500};
			int[] kakaku = {380,550,850};
			int[] tani = {5,4,3};
			double wari[] = {0.8,0.85,0.88};
			int result = Integer.MAX_VALUE/2;
			if(n-kei>=1000)for(int i=0;i<3;i++){
				double kane = (kakaku[i]*tani[i])*wari[i];
				int souryou = ryou[i]*tani[i];
				result = Math.min(result,bfs(souryou+kei,(int)kane+kin));
			}else for(int i=0;i<3;i++){
				result = Math.min(result,bfs(kei+ryou[i],kin+kakaku[i]));
			}
			return result;
		}
		public AOJ0106() {
			while(true){
				n = in.nextInt();
				if(n==0)break;
				System.out.println(bfs(0,0));
				
				
				
				
				
				
			}
		}
		
		
		
	}
	
	class AOJ2503{
		int MAX = 0;
		public AOJ2503() {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int m = in.nextInt();

			int[][] cost = new int[n][n];

			int[] dp = new int[n];
			for(int i=0;i<n*n;i++){
				cost[i/n][i%n]=MAX;
			}
			for(int i=0;i<m;i++){
				int a = in.nextInt();
				int b = in.nextInt();
				cost[a][b]=in.nextInt();
			}	
			//			TODO 一番大きいパスを0のポイントからn-1のポイントまでの

			for(int s=1;s<n;s++){
				for(int i=0;i<=s;i++){
					if(cost[i][s]==MAX)continue;
					dp[s]=Math.max(dp[s],dp[i]+cost[i][s]);
				}
			}
			for(int s=0;s<n;s++)for(int i=0;i<n;i++){
				if(cost[s][i]==MAX)continue;
				dp[i]=Math.max(dp[s]+cost[s][i],dp[i]);
			}
			for(int i=0;i<n;i++)System.out.print(dp[i]+" ");
			System.out.println();
			System.out.println(dp[n-1]);
		}
	}



	class  AOJ0155{
		int d[];
		int n;
		int x[];
		int y[];
		int ban[];
		boolean sw;
		ArrayList<Integer> result;
		int back[];
		int[][] cost;
		void dijkstra(int s,int g){
			d = new int[n+1];d[s]=0;
			Arrays.fill(d,0);
			boolean used[] = new boolean[n+1];
			int sumn[] = new int[n+1];
			int v=s;
			int save = -1;
			back = new int[n+1];
			while(true){
				save = v;
				v=-1;
				for(int u=1;u<n+1;u++)if(!used[u]&&(v==-1||d[u]<d[v])){
					v=u;
				}
				System.out.println(v);
				if(v==-1)break;
				else back[v]=save;
				used[v]=true;
				for(int u=1;u<n+1;u++)if(cost[v][u]!=100000)d[u]=Math.min(1+d[v],d[u]);
			}
			for(int i=1;i<d.length;i++){
				System.out.println(i+" "+d[i]);
			}
			int now=g;
			result = new ArrayList<Integer>();
			int a=0;
			//			for(int i=0;i<back.length;i++){
			//				System.out.println(i+" "+back[i]);
			//			}
			while(true){
				if(cost[a][now]==1000000)sw = true;
				result.add(now);
				if(now==s)break;
				a = now;
				now=back[now];
			}
			return;
		}
		public AOJ0155(){
			Scanner in = new Scanner(System.in);
			while(true){
				n = in.nextInt();
				if(n==0)break;
				cost = new int[n+1][n+1];
				ban = new int[n+1];
				x = new int[n+1];
				y = new int[n+1];
				for(int i=1;i<n+1;i++){
					ban[i] = in.nextInt();
					x[ban[i]] = in.nextInt();
					y[ban[i]] = in.nextInt();
				}
				for(int i=1;i<n+1;i++){
					for(int s=i+1;s<n+1;s++){
						int x1 = x[i],y1= y[i],x2=x[s],y2=y[s];
						int costs = (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));		
						cost[i][s] = costs > 50 ? 1000000:costs;
						cost[s][i] = cost[i][s];
					}
				}
				int kai = in.nextInt();
				for(int i=0;i<kai;i++){
					int s = in.nextInt();
					int g = in.nextInt();
					dijkstra(s, g);
//					if(sw){
//						System.out.println("NA");
//						break;
//					}
					for(int a=result.size()-1;a>=0;a--){
						System.out.print(result.get(a)+" ");
					}
					System.out.println();
				}
			}
		}
	}
}