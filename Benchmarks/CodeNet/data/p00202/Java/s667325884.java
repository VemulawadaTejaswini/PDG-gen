import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new B();
	}
	
	class C{
		int n, m;
		C(){
			while(true){
				n = sc.nextInt();
				m = sc.nextInt();
				if((n|m) == 0 )break;
				int [][] data  = new int[n][n];
				for(int i = 0 ; i < n; i++){
					for(int j = 0 ; j < n; j++){
						data[i][j] = sc.nextInt();
					}
				}
				int [][][] mlist = new int[4][m][m];
				for(int i = 0 ; i < m; i++){
					for(int j = 0 ; j < m; j++){
						mlist[0][i][j] = sc.nextInt();
					}
				}
				//4-th
				for(int  i = 1 ; i < 4; i++){
					for(int y = 0 ; y < m; y++){
						for(int x = 0; x < m; x++){
							mlist[i][x][m- y - 1] = mlist[i-1][y][x];
						}
					}
				}
				
				//debug
//				for(int times = 0;times < 4; times++){
//					for(int i = 0 ; i < m; i++){
//						for(int j = 0 ; j < m; j++){
//							System.out.print(mlist[times][i][j]);
//						}
//						System.out.println();
//					}
//					System.out.println("----");
//					
//				}
				
				int [] xx = new int[4];
				int [] yy = new int[4];
				for(int times = 0 ; times < 4; times++){
					boolean flg = true;
					for(int i = 0 ; i < m; i++){
						for(int j = 0 ; j < m; j++){
							if(mlist[times][i][j] == -1){
								
							}
							else{
								xx[times] = j;
								yy[times] = i;
								flg = false;
							}
						}
						if(! flg){
							break;
						}
					}
					
				}
				
				//comp
				int ansx = -1, ansy = -1;
				for(int i = 0; i < n; i++){
					for(int j = 0 ; j < n; j++){
						for(int time = 0; time < 4; time++){
							boolean res = comp(i,j, data, mlist[time]);
							
							if(res){
								int candx = j + xx[time];
								int candy = i + yy[time];
								if(ansy > i || (ansy == i && ansx > j )){
									ansx = candx;
									ansy = candy;
								}
							}
						}
					}
				}
				if(ansx == -1){
					System.out.println("NA");
				}
				else{
					
					System.out.println(ansx + " " + ansy);
				}
			}
		}

		private boolean comp(int y, int x, int[][] data, int[][] mlist) {
			for(int i = 0 ; i < m;i++){
				for(int j = 0 ; j < m; j++){
					if(mlist[i][j] == -1)continue;
					if(i + y < n && j + x < n){
						
						if(data[i + y][j + x] == mlist[i][j]){
							
						}
						else{
							return false;
						}
					}
					else{
						return false;
					}
				}
			}
			return false;
		}
	}
	
	class B{
		final int MAX=1000001,INF=1<<29;
		int N,X;
		boolean[] prime;
		B(){
			prime=sieve(MAX);
			while(sc.hasNext()){
				N=sc.nextInt();
				X=sc.nextInt();
				if((N|X)==0)	break;
				solve();
			}
		}
		boolean[] sieve(int MAX){
			boolean[] list=new boolean[MAX+1];
			list[0]=true;
			list[1]=true;
			for(int i=2; i*i<=MAX; i++){
				if(!list[i])for(int j=i+i; j<=MAX; j+=i)list[j]=true;
			}
			return list;
		}
		void solve(){
			TreeSet<Integer> aa=new TreeSet<Integer>();
			for(int i=0; i<N; i++)	aa.add(sc.nextInt());
			N=aa.size();
			int[] a=new int[N];
			int idx=0;
			for(int i:aa)	a[idx++]=i;
			int[] dp=new int[X+1];
			int ans=-1;
			for(int i=0; i<N; i++){
				for(int j=1; j<=X; j++){
					if(j<a[i]){
						dp[j]=dp[j-1];
					}else{
						dp[j]=max(dp[j], dp[j-a[i]]+a[i]);
						if(!prime[dp[j-a[i]]+a[i]])ans=max(ans,dp[j-a[i]]+a[i]);
					}
				}
			}
			//System.out.println(Arrays.toString(dp));
			System.out.println(ans>0?ans:"NA");
		}
	}
	
	class B2{
		final int MAX=1000001,INF=1<<29;
		int N,X;
		boolean[] prime;
		int[] vtd;
		B2(){
			prime=sieve(MAX);
			while(sc.hasNext()){
				N=sc.nextInt();
				X=sc.nextInt();
				if((N|X)==0)	break;
				solve();
			}
		}
		boolean[] sieve(int MAX){
			boolean[] list=new boolean[MAX+1];
			list[0]=true;
			list[1]=true;
			for(int i=2; i*i<=MAX; i++){
				if(!list[i])for(int j=i+i; j<=MAX; j+=i)list[j]=true;
			}
			return list;
		}
		void solve(){
			int[] a=new int[N];
			for(int i=0; i<N; i++)	a[i]=sc.nextInt();
			int[][] dp=new int[N+1][X+1];
			int ans=-1;
			for(int i=0; i<N; i++){
				for(int j=0; j<=X; j++){
					if(j<a[i]){
						dp[i+1][j]=dp[i][j];
					}else{
						dp[i+1][j]=max(dp[i][j], dp[i+1][j-a[i]]+a[i]);
						if(!prime[dp[i+1][j]])ans=max(ans,dp[i+1][j]);
					}
				}
			}
			System.out.println(ans>0?ans:"NA");
		}
	}
}