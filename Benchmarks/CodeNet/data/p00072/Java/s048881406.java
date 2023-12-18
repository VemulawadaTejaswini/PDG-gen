import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int m = sc.nextInt();

			ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
			for(int i=0;i<n;i++) graph.add(new ArrayList<Edge>());

			while(m-- > 0){
				String[] s = sc.next().split(",");
				int a = Integer.parseInt(s[0]);
				int b = Integer.parseInt(s[1]);
				int cost = Integer.parseInt(s[2]) / 100 - 1;

				graph.get(a).add(new Edge(b,cost));
				graph.get(b).add(new Edge(a,cost));
			}

			System.out.println(prim(graph));
		}
	}

	private static int prim(ArrayList<ArrayList<Edge>> graph){
		PriorityQueue<Edge> open = new PriorityQueue<Edge>();
		HashSet<Integer> closed = new HashSet<Integer>();
		int total = 0;

		open.add(new Edge(0,0));
		while(closed.size() != graph.size()){
			Edge st = open.poll();
			if(closed.contains(st.to)){
				continue;
			}
			closed.add(st.to);
			total += st.cost;
			for(Edge e : graph.get(st.to)){
				if(!closed.contains(e.to)){
					open.add(e);
				}
			}
		}

		return total;
	}
}

class Edge implements Comparable<Edge>{
	int to, cost;

	Edge(int to,int cost){
		this.to = to;
		this.cost = cost;
	}

	public int compareTo(Edge e){
		return this.cost - e.cost;
	}
}