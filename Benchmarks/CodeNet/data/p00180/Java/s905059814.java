import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		final long STACK=8*1024*1024;
		new Thread(null, new AOJ0180(), "RUN!", STACK).start();
	}
	
	class AOJ0180 implements Runnable{
		AOJ0180(){}
		@Override public void run(){
			while(sc.hasNext()){
				int N=sc.nextInt(),E=sc.nextInt();
				if((N|E)==0)	break;
				solve(N,E);
			}
		}
		void solve(int N,int E){
			int[][] g=new int[N][N];
			for(int i=0; i<N; i++)for(int j=0; j<N; j++)g[i][j]=1<<29;
			for(int i=0; i<E; i++){
				int u=sc.nextInt(),v=sc.nextInt(),c=sc.nextInt();
				g[u][v]=c;
				g[v][u]=c;
			}
			System.out.println(prim(g,N));
		}
		
		final int INF=1<<29;
		int prim(int[][] g,int N){
			int[] mincost=new int[N];
			boolean[] used=new boolean[N];
			for(int i=0; i<N; i++)	mincost[i]=INF;
			
			mincost[0]=0;
			int ret=0;
			
			while(true){
				int v=-1;
				for(int u=0; u<N; u++){
					if(!used[u] && (v==-1 || mincost[u] < mincost[v]))	v=u;
				}
				if(v < 0)	break;
				used[v]=true;
				ret+=mincost[v];
				
				for(int u=0; u<N; u++)	mincost[u]=min(mincost[u], g[v][u]);
			}
			return ret;
		}
	}
}