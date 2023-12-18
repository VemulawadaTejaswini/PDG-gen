import java.awt.geom.Point2D;
import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ1169();
	}
	class AOJ1169{
		int N,A,S,G;
		final int INF=1<<29;
		AOJ1169(){
			while(true){
				N=sc.nextInt(); A=sc.nextInt(); S=sc.nextInt(); G=sc.nextInt();
				if(N==0)	break;
				solve();
			}
		}
		void solve(){
			ArrayList<Edge> es=new ArrayList<Edge>();
			for(int i=0; i<A; ++i){
				int x=sc.nextInt(),y=sc.nextInt();
				es.add(new Edge(y,x,sc.next()));
			}
			bellmanFord bf=new bellmanFord(N,es);
			String[] ans=bf.shortestPath2(G);
			System.out.println(ans==null? "NO": ans[S]==null? "NO": ans[S]);
		}
		class Edge implements Comparable<Edge>{
			int from,to;
			String cost;
			Edge(int from,int to,String cost){
				this.from=from;	this.to=to;	this.cost=cost;
			}
			@Override public int compareTo(Edge e){
//				return this.cost-e.cost;
				return this.cost.compareTo(e.cost);
			}
			@Override public String toString(){
				return from+"->"+to+":"+cost;
			}
		}
		class bellmanFord{
			int V,E;
			ArrayList<Edge> es;
			int[] d;
			bellmanFord(int V,ArrayList<Edge> es){
				this.V=V; this.es=es; this.E=es.size();
			}
			// グラフ上にstartから到達可能な負の閉路があればnullを返す
//			int[] shortestPath(int start){
//				d=new int[V];
//				for(int i=0; i<V; ++i)	d[i]=INF;
//				d[start]=0;
//				for(int i=1; i<=V; ++i){
//					boolean update=false;
//					for(Edge e:es){
//						if(d[e.from]<INF && d[e.to]>d[e.from]+e.cost){
//							d[e.to]=d[e.from]+e.to;
//							update=true;
//							if(i==V)	return null;
//						}
//					}
//					if(!update)	break;
//				}
//				return d;
//			}
			String[] shortestPath2(int start){
				String[] ds=new String[V];
				ds[start]=new String();
				for(int i=1; i<=6*V; ++i){
					boolean update=false;
					for(Edge e:es){
						if(ds[e.from]!=null){
							String tmp=e.cost+ds[e.from];
							if(ds[e.to]==null || ds[e.to].compareTo(tmp)>0){
								ds[e.to]=tmp;
								update=true;
								if(e.to==S && i>=V)	return null;
							}
						}
					}
					if(!update)	break;
				}
				return ds;
			}
		}
	}
}