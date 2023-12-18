import java.util.*;
import static java.lang.Math.*;
public class Main {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		final long STACK = 8*1024*1024;
		new Thread(null, new AOJ1318(), "RUN", STACK).start();
	}
	
	class AOJ1318 implements Runnable{
		AOJ1318(){}
		@Override public void run(){
			while(sc.hasNext()){
				N=sc.nextInt();
				M=sc.nextInt();
				CAP=sc.nextInt()*10;
				if((N|(CAP))==0)	break;
				solve();
			}
		}
		
		int N,M,CAP,Node;
		final int INF = 1<<29;
		HashMap<String,Integer> dic;
		ArrayList<ArrayList<Edge>> g;
		
		void solve(){
			String src=sc.next(),dest=sc.next();
			dic = new HashMap<String,Integer>();
			ArrayList<In> input = new ArrayList<In>();
			for(int i=0; i<N; ++i){
				String a=sc.next(),b=sc.next();
				int d=sc.nextInt();
				if(!dic.containsKey(a))	dic.put(a, dic.size());
				if(!dic.containsKey(b))	dic.put(b, dic.size());
				input.add(new In(a,b,d));
			}
			
			Node = dic.size();
			
			boolean[] chg = new boolean[Node];
			for(int i=0; i<M; ++i)	chg[dic.get(sc.next())]=true;
			
			g = new ArrayList<ArrayList<Edge>>();
			for(int i=0; i<Node; ++i)	g.add(new ArrayList<Edge>());
			for(In i:input){
				int a=dic.get(i.a),b=dic.get(i.b);
				g.get(a).add(new Edge(b, i.d, chg[b]));
				g.get(b).add(new Edge(a, i.d, chg[a]));
			}
			
			System.out.println( Dijkstra(dic.get(src), dic.get(dest)) );
			
		}
		
		int Dijkstra(int src,int to){
			
			PriorityQueue<State> open = new PriorityQueue<State>();
			open.add(new State(src, 0, CAP));
			
			int[][] closed = new int[Node][CAP+1];
			for(int i=0; i<Node; ++i)for(int j=0; j<=CAP; ++j)closed[i][j]=INF;
			for(int i=0; i<=CAP; ++i)closed[src][i]=0;
			
			while(!open.isEmpty()){
				State now=open.poll();
				if(now.p==to)	return now.d;
				
				ArrayList<Edge> cand = g.get(now.p);
				for(Edge e:cand){
					if(now.c < e.dis)	continue;
					
					int nextCap = e.ch? CAP : now.c-e.dis,
						nextDis = now.d + e.dis;
					
					if(closed[e.to][nextCap] <= nextDis)	continue;
					
					for(int i=nextCap; i>=0; --i){
						if(closed[e.to][i] <= nextDis)	break;
						closed[e.to][i] = nextDis;
					}
					open.add(new State(e.to, nextDis, nextCap));
					
				}
				
			}
			
			return -1;
		}
		
		class State implements Comparable<State>{
			int p,d,c;
			State(int p,int d,int c){
				this.p=p;
				this.d=d;
				this.c=c;
			}
			@Override public int compareTo(State o){
				return this.d-o.d;
			}
		}
		
		class In{
			String a,b;
			int d;
			In(String a,String b,int d){
				this.a=a;
				this.b=b;
				this.d=d;
			}
		}
		
		class Edge{
			int to,dis;
			boolean ch;
			Edge(int to,int dis,boolean ch){
				this.to=to;
				this.dis=dis;
				this.ch=ch;
			}
		}
		
	}

}