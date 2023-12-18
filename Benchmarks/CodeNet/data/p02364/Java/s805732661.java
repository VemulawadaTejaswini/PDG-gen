import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new A().doIt();
	}
	class A{
		void doIt(){
			int V = sc.nextInt();
	        int E = sc.nextInt();
	 
	        ArrayList<Edge> array = new ArrayList<Edge>();
	        for (int i = 0; i < E; i++) {
	            int s = sc.nextInt();
	            int t = sc.nextInt();
	            int w = sc.nextInt();
	            array.add(new Edge(s, t, w));
	            array.add(new Edge(t, s, w));
	        }
	        System.out.println(kruskal(array,V));
		}
		int kruskal(ArrayList<Edge> edgelist, int nodesize) {
		    int m = edgelist.size();
		    Collections.sort(edgelist);
		    UnionFind uf = new UnionFind(nodesize);
		    int res = 0;
		    for(int i = 0 ; i < m; i++){
		        Edge e = edgelist.get(i);
		        if(! uf.same(e.from, e.to)){
		            uf.unite(e.from, e.to);
		            res += e.cost;
		        }
		    }
		    return res;
		}
		class Edge implements Comparable<Edge>{
		    int from,to, cost;
		    public Edge(int from, int to, int cost) {
		        this.from = from; this.to = to; this.cost = cost;
		    }
		    public int compareTo(Edge o) {
		        return this.cost - o.cost;
		    } 
		}
		class UnionFind{
			int [] par, rank; // par -> rootnumber, rank -> height 
			int num; // ?????¨???????????????????????°
			public UnionFind(int n) {
				par = new int[n];
				rank = new int[n]; for(int i=0;i<n;i++){
					par[i] = i;
		            //rank[i] = 0;
				}
				num=n; 
			}
			int find(int x){ //?????????????????????????????¢??? 
				if(par[x] == x)return x;
				else return par[x] = find(par[x]);
			}
			void unite(int x, int y){ //????????????
				x = find(x);
				y = find(y);
				if(x == y) return ;
				if(rank[x] < rank[y]) par[x] = y;
				else{
					par[y] = x;
					if(rank[x] == rank[y]) rank[x]++;
				}
				num--; 
			}
			boolean same(int x, int y){ //????????????????????????????????¨?????????????????? 
				return find(x) == find(y);
			} 
		}
		
	}
}