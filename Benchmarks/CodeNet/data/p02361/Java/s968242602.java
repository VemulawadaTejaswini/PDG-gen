import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args){
		int V, E, r;
		BufferedReader br = null;
		
		try{
		   br = new BufferedReader(new InputStreamReader(System.in));
		   String[] data = br.readLine().split(" ");
		   V = Integer.valueOf(data[0]);
		   E = Integer.valueOf(data[1]);
		   r = Integer.valueOf(data[2]);
		   
		   ArrayList<ArrayList<PairValue>> graph = new ArrayList<ArrayList<PairValue>>();
		   for(int i=0; i<V; i++){
			   graph.add(new ArrayList<PairValue>());
		   }
		   
		   for(int i=0; i<E; i++){
			   data = br.readLine().split(" ");
			   int s = Integer.valueOf(data[0]);
			   int t = Integer.valueOf(data[1]);
			   int d = Integer.valueOf(data[2]);
			   graph.get(s).add(new PairValue(t,d));
			   
		   }
		   
		 solve(V,E,r,graph);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	private static void solve(int V, int E, int r, ArrayList<ArrayList<PairValue>> graph){
		if(E==0){
			for(int i=0; i<V; i++){
				if(i==r){
					System.out.println(0);
				}else{
					System.out.println("INF");
				}
			}
			
			return;
		}
		boolean spSet[] = new boolean[V];
		int dist[] = new int[V];
		
		for(int i=0; i<V; i++){
			spSet[i] = false;
			dist[i] = Integer.MAX_VALUE;
		}
		
		dist[r] = 0;
		
		// find shortest path for all vertices
		for(int count =0; count < V-1; count++){
			int u = minDist(dist, spSet);
			spSet[u] = true;
			
			ArrayList<PairValue> neighbours = graph.get(u);
			for(int i=0; i<neighbours.size(); i++){
				int v = neighbours.get(i).index;
				int w = neighbours.get(i).weight;
				if(!spSet[v] && dist[v] > dist[u]+w){
					dist[v] = dist[u]+ w;
				}
			}
		}
		
		for(int i=0; i<V; i++){
			if(dist[i] == Integer.MAX_VALUE){
				System.out.println("INF");
			}else{
				System.out.println(dist[i]);
			}
		}
	}
	
	private static int minDist(int[] dist, boolean[] spSet){
		int min = Integer.MAX_VALUE;
		int index = -1;
		for(int i=0; i<dist.length; i++){
			if(!spSet[i] && dist[i] <= min){
				min = dist[i];
				index = i;
			}
		}
		//System.out.println("index: "+index);
		return index;
	}
	
}


class PairValue{
	int index, weight;
	public PairValue(int a, int b){
		index = a;
		weight = b;
	}
}