import java.awt.geom.Point2D;
import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ2021();
	}
	class AOJ2021{
		int N,M,L,K,A,H;
		final int INF=1<<28;
		AOJ2021(){
			while(true){
				N=sc.nextInt(); M=sc.nextInt(); L=sc.nextInt();
				K=sc.nextInt(); A=sc.nextInt(); H=sc.nextInt();
				if(N==0)	break;
				solve();
			}
		}
		void solve(){
			int[][] map=new int[N][N];
			for(int i=0; i<N; ++i)for(int j=0; j<N; ++j)	map[i][j]=INF;
			int[] list=new int[L+2];
			list[0]=A; list[L+1]=H;
			for(int i=0; i<L; ++i)	list[i+1]=sc.nextInt();
			for(int i=0; i<K; ++i){
				int x=sc.nextInt(),y=sc.nextInt(),t=sc.nextInt();
				map[x][y]=t;
				map[y][x]=t;
			}
			for(int j=0; j<N; ++j)for(int i=0; i<N; ++i)for(int k=0; k<N; ++k)	map[i][k]=min(map[i][k], map[i][j]+map[j][k]);
			ArrayList<ArrayList<Edge>> map2=new ArrayList<ArrayList<Edge>>(L+2);
			for(int i=0; i<L+2; ++i)	map2.add(new ArrayList<Edge>());
			for(int f=0; f<L+2; ++f)for(int t=f+1; t<L+2; ++t)if(map[list[f]][list[t]]<INF){
				map2.get(f).add(new Edge(t, map[list[f]][list[t]]));
				map2.get(t).add(new Edge(f, map[list[t]][list[f]]));
			}
			
			PriorityQueue<State> open=new PriorityQueue<State>();
			open.add(new State(0,M,0));
			int[][] closed=new int[L+2][M+1];
			for(int i=0; i<L+2; ++i)for(int j=0; j<=M; ++j)	closed[i][j]=INF;
			closed[0][M]=0;
			
			int ans=INF;
			while(!open.isEmpty()){
				State now=open.poll();
				if(now.p==L+1){
					ans=now.t;
					break;
				}
				for(Edge e:map2.get(now.p))if(e.t<=M){
					int nr=(now.r>=e.t? now.r-e.t: 0),
						nt=(now.r>=e.t? e.t: e.t+(e.t-now.r))+now.t;
					if(closed[e.p][nr]<=nt)	continue;
					open.add(new State(e.p, nr, nt));
					closed[e.p][nr]=nt;
				}
			}
			System.out.println((ans>=INF? "Help!": ans));
		}
		class Edge{
			int p,t;
			Edge(int p,int t){
				this.p=p;	this.t=t;
			}
		}
		class State implements Comparable<State>{
			int p,r,t;
			State(int p,int r,int t){
				this.p=p;	this.r=r;	this.t=t;
			}
			@Override public int compareTo(State o){
				return this.t-o.t;
			}
		}
	}
}