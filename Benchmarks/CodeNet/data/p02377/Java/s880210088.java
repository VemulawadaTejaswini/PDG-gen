import java.awt.geom.Point2D;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
//		new A().doIt();
		new GRL_6().doIt();
	}
	class GRL_6{
		void doIt(){
			int n = sc.nextInt();
			int e = sc.nextInt();
			int max = sc.nextInt();
			MCF m = new MCF(n);
			for(int i = 0;i < e;i++){
				int from = sc.nextInt();
				int to = sc.nextInt();
				int cap = sc.nextInt();
				int cost = sc.nextInt();
				m.addEdge(from, to, cap, cost);
				m.addEdge(to, from, cap, cost);
			}
			System.out.println(m.minCostFlow(0, n-1, max));
		}
		class MCF{
			int INF=1<<24; ArrayList<ArrayList<Edge>> G;
			class Edge {
		        int to, cap, cost;
		        int rev;
		        public Edge(int to, int cap, int cost, int rev) {
		            this.to = to;this.cap = cap;this.cost = cost; this.rev = rev;
		        }
		    }
			MCF(int v){
				G= new ArrayList<ArrayList<Edge>>(); 
				for(int i=0;i<v;i++){
		            G.add(new ArrayList<Edge>());
		        }
			}
		    private void addEdge(int from, int to, int cap, int cost){
		        G.get(from).add(new Edge(to, cap, cost, G.get(to).size()));
		        G.get(to).add(new Edge(from, 0, -cost, G.get(from).size() - 1));
		    }
		    private int minCostFlow(int s, int t, int f) {
		    	int V = G.size();
		    	int [] dist = new int[V], prevv = new int[V], preve = new int[V]; 
		    	int res=0;
		    	while(f > 0){
		            Arrays.fill(dist, INF);
		            dist[s] = 0;
		            boolean update = true;
		            while(update) {
		                update = false;
		                for(int v = 0; v < V; v++){
		                    if(dist[v] == INF) continue;
		                    for(int i = 0 ; i < G.get(v).size(); i++){
		                        Edge  e = G.get(v).get(i);
		                        if(e.cap > 0 && dist[e.to]> dist[v] + e.cost ){
		                            dist[e.to] = dist[v] + e.cost;
		                            prevv[e.to] = v;
		                            preve[e.to] = i;
		                            update = true;
		                        }
		                    }
		                }
		            }
		            if(dist[t] == INF) return -1;
		            int d= f;
		            for(int v=t;v!= s; v = prevv[v]){
		            	d= Math.min(d, G.get(prevv[v]).get(preve[v]).cap); 
		            }
		            f -= d;
		            res += d * dist[t];
		            for(int v = t; v!= s; v = prevv[v]){
		                Edge e =G.get(prevv[v]).get(preve[v]);
		                e.cap -= d;
		                G.get(v).get(e.rev).cap += d;
		            }
		        }
		    	return res; 
		    }
		}
	}
	class A{
		BigInteger sum[] = new BigInteger[501];
		BigInteger bit[] = new BigInteger[501];
		void doIt(){
			sum[1] = new BigInteger("1");
			bit[1] = new BigInteger("1");
			for(int i = 2;i < 501;i++){
				bit[i] = bit[i-1].multiply(new BigInteger("2"));
				sum[i] = sum[i-1].add(bit[i]);
			}
			while(true){
				String str = sc.next();
				if(str.equals("0"))break;
				BigInteger num = new BigInteger(str);
				int length = num.toString(2).length() + 1;
				ArrayList<Par> array = new ArrayList<Par>(); 
				array.add(new Par(bit[length],1,length-1));
				System.out.println(bit[length - 1]+" "+sum[length - 1]);
				System.out.println(array.get(0).num+" "+array.get(0).cnt+" "+array.get(0).length);
			}
		}
		class Par{
			BigInteger num;
			int cnt,length;
			public Par(BigInteger num,int cnt,int length){
				this.num = num;
				this.cnt = cnt;
				this.length = length;
			}
		}
	}
}