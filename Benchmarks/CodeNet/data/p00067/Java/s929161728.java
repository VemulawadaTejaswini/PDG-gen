import java.util.*;

public class Main {	
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new AOJ0067();
	}
	
	class AOJ0067{
		boolean sw[][] = new boolean[12][12];
		
		void dfs(int x,int y){
			sw[y][x]=false;
			int[] sx={1,0,-1,0},sy = {0,1,0,-1};
			for(int i=0;i<4;i++){
				int nx = x+sx[i],ny=y+sy[i];
				if(nx<0||nx>=12||ny<0||ny>=12)continue;
				if(sw[ny][nx]==true)dfs(nx,ny);
			}
			return;
		}
		
		public AOJ0067() {
			Scanner in = new Scanner(System.in);
			while(in.hasNext()){
				for(int s=0;s<12;s++){
					String a = in.next();
					for(int i=0;i<12;i++)sw[s][i]=a.charAt(i)=='1'? true:false;
				}
				int cnt = 0;
				for(int s=0;s<12;s++)for(int i=0;i<12;i++)if(sw[s][i]==true){
					cnt++;
					dfs(i,s);
				}
				System.out.println(cnt);
			}
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
			Arrays.fill(d,100000);
			boolean used[] = new boolean[n+1];
			int sumn[] = new int[n+1];
			int v=s;
			int save = -1;
			back = new int[n+1];
			while(true){
				save = v;
				v=-1;
				for(int u=1;u<n+1;u++)if(!used[u]&&(v==-1||(d[u]<d[v]))){
					v=u;
				}
				if(v==-1)break;
				else back[v]=save;
				used[v]=true;
				for(int u=1;u<n+1;u++)d[u]=Math.min(cost[u][v]+d[v],d[u]);
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