
import java.util.*;

public class Main {
	
	static final int INF = Integer.MAX_VALUE/2;
	
	static class Edge{
		int from;
		int to;
		int cost;
		Edge(int from,int to,int cost){
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int V = stdIn.nextInt();
		int E = stdIn.nextInt();
		int r = stdIn.nextInt();
		
		int[] d = new int[V];
		Arrays.fill(d,INF);
		d[r] = 0;
		
		ArrayList<Edge> list = new ArrayList<Edge>();
		for(int i=0;i<E;i++){
			int s = stdIn.nextInt();
			int t = stdIn.nextInt();
			int l = stdIn.nextInt();
			Edge edge = new Edge(s,t,l);
			list.add(edge);
		}
		
		for(int i=0;i<V;i++){
			for(int j=0;j<E;j++){
				Edge edge = list.get(j);
				if(d[edge.from]!=INF && d[edge.to]>d[edge.from]+edge.cost){
					d[edge.to] = d[edge.from]+edge.cost;
					if(i==V-1){
						System.out.println("NEGATIVE CYCLE");
						return;
					}
				}
			}
		}
		
		for(int i=0;i<V;i++){
			if(d[i]>INF/2){
				System.out.println("INF");
			}
			else{
				System.out.println(d[i]);
			}
		}
	}
}