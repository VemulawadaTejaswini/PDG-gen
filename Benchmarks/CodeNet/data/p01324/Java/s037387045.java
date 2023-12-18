import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			boolean noFlg = false;
			int n = sc.nextInt();
			if(n == 0) break;
			map = new HashMap< String, ArrayList<Edge> >();

			while(n-- > 0){
				sc.next();
				String from = sc.next();
				sc.next();
				int cost = Integer.parseInt(sc.next().split("\\^")[1]);
				String to = sc.next();

				if(noFlg) continue;

				int res = calCost(from,to,0,new HashSet<String>());
				if(res != Integer.MAX_VALUE && res != cost){
					noFlg = true;
					continue;
				}

				if(map.get(from) == null) map.put(from,new ArrayList<Edge>());
				if(map.get(to) == null) map.put(to,new ArrayList<Edge>());
				map.get(from).add(new Edge(from,to,cost));
				map.get(to).add(new Edge(to,from,-cost));
			}

			System.out.println(noFlg ? "No" : "Yes");
		}
	}

	private static HashMap<String,ArrayList<Edge>> map;

	private static int calCost(String from,String to,int cost,HashSet<String> used){
		if(from.equals(to)) return cost;
		if(used.contains(from) || map.get(from) == null) return Integer.MAX_VALUE;

		used.add(from);
		for(Edge e : map.get(from)){
			int res = calCost(e.to,to,cost+e.cost,used);
			if(res != Integer.MAX_VALUE) return res;
		}

		return Integer.MAX_VALUE;
	}
}

class Edge{
	String from,to;
	int cost;

	public Edge(String from,String to,int cost){
		this.from = from;
		this.to = to;
		this.cost = cost;
	}

	public String toString(){
		return String.format("[%s->%s,%d]",from,to,cost);
	}
}