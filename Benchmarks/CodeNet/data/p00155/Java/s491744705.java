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
		new AOJ0155();
	}

	class DP{
		public DP() {
			int[] dp = new int[14];
			int[] hyou = {4,5,2,1,6};
			int[] hyou2 = {450,570,225,110,670};
			int[] memo = new int[14];
			for(int i=0;i<5;i++){
				dp[hyou[i]]=hyou2[i];
				memo[hyou[i]]=i;
			}
			for(int s=0;s<14;s++)if(dp[s]!=0){
				for(int i=0;i<5;i++)if(hyou[i]+s<=13){
					dp[hyou[i]+s]=Math.max(dp[hyou[i]+s],dp[s]+hyou2[i]);
					memo[hyou[i]+s]=i;
				}
			}
			for(int i=0;i<14;i++){
				System.out.println(dp[i]);
			}
			for(int i=0;i<14;i++)System.out.println(memo[i]);

		}
	}
	class AOJ0184{
		public AOJ0184() {
			while(true){
				int n=in.nextInt();
				if(n==0)break;
				int[] ans = new int[7];
				for(int i=0;i<n;i++){
					int num = in.nextInt();
					if(num==0)ans[0]++;
					else if (num<60)ans[num/10]++;
					else ans[6]++;
				}
				for(int i=0;i<7;i++)System.out.println(ans[i]);
			}
		}
	}

	class AOJ0097{
		public AOJ0097() {//ナップザック問題
			while(true){
				int n=in.nextInt();
				int s=in.nextInt();
				if(n+s==0)break;






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
		int n;
		Building[] build;
		double[][] cost;
		double Max;
		int[] list;

		void dijkstra(int s,int g){
			list = new int[n];
			double[] d = new double[n];
			boolean used[] = new boolean[n];
			Arrays.fill(list,-1);
			Arrays.fill(d,Max);
			Arrays.fill(used, false);
			d[s] = 0;
			while(true){
				int v=-1;
				for(int u=0;u<n;u++){//まだ使われていない頂点のうち最小のものを探す
					if(!used[u]&&(v==-1||d[u]<d[v]))v=u;
				}
				if(v==-1||v==g-1)break;
				used[v]=true;
				for(int u=0;u<n;u++){
					if(d[u]>d[v]+cost[v][u]){
						d[u]=d[v]+cost[v][u];
						list[u] = v;
					}
				}
				
			}
		}
		
		void make(int p){
			if(p<0)return;
			make(list[p]);
			list2.add(p);
			return;
		}
		
		ArrayList<Integer> list2;

		public AOJ0155() {
			Max = Integer.MAX_VALUE;
			while(true){
				n = in.nextInt();
				if(n==0)break;
				cost = new double[n][n];
				build = new Building[n];
				for(int i=0;i<n;i++){
					int ban = in.nextInt();
					int x = in.nextInt();
					int y = in.nextInt();
					build[i] = new Building(x, y, ban);
				}
				for(int s=0;s<n;s++){
					for(int i=0;i<n;i++){
						cost[s][i] =  Math.hypot(build[s].x-build[i].x, build[s].y-build[i].y);
						cost[s][i] = cost[s][i]>50? Max:cost[s][i]; 
						cost[i][s]=cost[s][i];
					}
				}

				int k = in.nextInt();
				for(int i=0;i<k;i++){
					int a = in.nextInt();
					int b = in.nextInt();
					int from = -1,goal = -1;
					for(int s=0;s<build.length;s++){
						if(a==build[s].ban)from = s+1;
						else if(b==build[s].ban)goal = s+1;
					}
					dijkstra(from-1,goal);
					list2 = new ArrayList<Integer>();
					make(goal-1);
					if(build[list2.get(0)].ban==from){
						for(int s=0;s<list2.size()-1;s++){
							System.out.print(build[list2.get(s)].ban+" ");
						}
						System.out.println(build[list2.get(list2.size()-1)].ban);
					}else System.out.println("NA");
				}
			}
		}

		class Building{
			int x,y,ban;
			public Building(int x,int y,int ban) {
				this.x = x;
				this.y = y;
				this.ban = ban;
			}
		}

	}
}