import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String[] tmpArray = br.readLine().split(" ");
			
			int n = Integer.parseInt(tmpArray[0]);
			int m = Integer.parseInt(tmpArray[1]);
			
			if(n == 0 && m == 0){
				break;
			}
			
			@SuppressWarnings("unchecked")
	        ArrayList<Edge> edges[] = new ArrayList[n];
	 
	        for(int i = 0; i < n; i++){
	            if(edges[i] == null){
	                edges[i] = new ArrayList<Edge>();
	            }
	        }
	        
//	        int cost[] = new int[m];
			for(int i = 0; i < m ; i++){
				tmpArray = br.readLine().split(" ");
				int u = Integer.parseInt(tmpArray[0]) - 1;
				int v = Integer.parseInt(tmpArray[1]) - 1;
				int d = Integer.parseInt(tmpArray[2]);
				int c = Integer.parseInt(tmpArray[3]);
				
				edges[u].add( new Edge(v, d, c));
				edges[v].add( new Edge(u, d, c));
				
//				cost[i] = c;
			}
			
//			int dist[] = dijkstra(edges, 0, n, preEdge);
			solve(edges, n, 0);
		}

	}

	static void solve(ArrayList<Edge>[] edges,  int n, int x){
        //xからそれぞれのfarmへの帰り道の最短距離
		int preCost[] = new int[n];
        int[] dist = dijkstra(edges, x, n, preCost);
 
//        for(int i = 0; i < n; i++){
//            if(dist[i] == INF){
//                System.out.println("INF");
//            }
//            else {
//                System.out.println(dist[i]);
//            }
//        }
        
        //debug
//        for(int i = 0; i < n; i++){
//        	System.out.println("i = "+i+" cost "+preCost[i]);
//        }
        
        long sum = 0;
        
        for(int i = 0; i < n; i++){
        	if(i == x){
        		continue;
        	}
        	
        	sum += preCost[i];
        }
        
        System.out.println(sum);
 
    }
	
	static final int INF = Integer.MAX_VALUE;

	//ダイクストラ法（記録型）
	static int[] dijkstra(ArrayList<Edge>[] edges, int s, int n, int cost[]){
		//	      if(n == 1){
		//	          return new int[]{0};
		//	      }

		PriorityQueue<Distance> que = new PriorityQueue<Distance>();
		int[] dist = new int[n];

		Arrays.fill(dist, INF);
		dist[s] = 0;
		que.add(new Distance(0, s));

		while(!que.isEmpty()){
			Distance tmpDist = que.poll();
			int tmpV = tmpDist.id;

			if(dist[tmpV] < tmpDist.dist){
				continue;
			}
			//	          System.out.println(tmpV);
			for(int i = 0; i < edges[tmpV].size() ; i++){
				//	              System.out.println(i);
				Edge e = (Edge) edges[tmpV].get(i);
				if((dist[e.to] == dist[tmpV] + e.dist && cost[e.to] > e.cost) || (dist[e.to] > dist[tmpV] + e.dist)){
					
//					System.out.println("update "+e.to+" "+e.dist+" "+e.cost);
					dist[e.to] = dist[tmpV] + e.dist;
					que.add(new Distance(dist[e.to], e.to));
					
					//cost情報の記憶
					cost[e.to] = e.cost;
					
				}
			}
		}

		return dist;
	}

}

class Distance implements Comparable<Distance>{
	int dist;
	int id;

	Distance(int dist, int id){
		this.dist = dist;
		this.id = id;
	}

	@Override
	public int compareTo(Distance d) {
		return this.dist - d.dist;
	}
}

class Edge {
	int to;
	int dist;
	int cost;

	Edge(int to, int dist, int cost){
		this.to = to;
		this.dist = dist;
		this.cost = cost;
	}
}
