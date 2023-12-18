import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int v = Integer.valueOf(line.split(" ")[0]);
		int e = Integer.valueOf(line.split(" ")[1]);
		int r = Integer.valueOf(line.split(" ")[2]);
		Graph g = new Graph();
		
		for(int i = 0; i < e; i++){
			String edge = sc.nextLine();
			int s = Integer.valueOf(edge.split(" ")[0]);
			int t = Integer.valueOf(edge.split(" ")[1]);
			int d = Integer.valueOf(edge.split(" ")[2]);
			g.set(s, t, d);
		}
		
		for(int i = 0; i < v; i++){
			List<Integer> path = Graphs.findShortestPath(g, r, i);
			path = reverse(path);
			System.out.println(path != null? Graphs.sumWeight(g, path): "INF");
		
		}
		
		sc.close();
	}
	
	static List<Integer> reverse(List<Integer> list){
		if(list == null) return null;
		List<Integer> result = new ArrayList<>();
		for(int i = list.size() - 1; i >= 0; i--){
			result.add(list.get(i));
		}
		return result;
	}
}

class Graph{
	Map<Integer, Map<Integer, Integer>> edge;
	
	void set(int from, int to, int weight){
		if(edge.containsKey(from)) edge.get(from).put(to, weight);
		else{
			Map<Integer, Integer> from_map = new HashMap<>();
			from_map.put(to, weight);
			edge.put(from, from_map);
		}
	}
	
	void setBoth(int from, int to, int weight){
		set(from, to, weight);
		set(to, from, weight);
	}
	
	OptionalInt get(int from, int to){
		if(edge.containsKey(from) && edge.get(from).containsKey(to)) return OptionalInt.of(edge.get(from).get(to));
		return OptionalInt.empty();
	}
	
	Graph(){
		this.edge = new HashMap<>();
	}
	
	Set<Integer> getNeighbour(int v){
		Set<Integer> result = new HashSet<>();
		if(edge.containsKey(v)) result.addAll(edge.get(v).keySet());
		return result;
	}
}

class Graphs{
	static List<Integer> findShortestPath(Graph g, int from, int to){
		Map<Integer, Integer> presentLength = new HashMap<>();
		Map<Integer, Integer> parent = new HashMap<>();
		Set<Integer> U = new HashSet<>();
		Set<Integer> pendingVertex = new HashSet<>();
		presentLength.put(from, 0);
		pendingVertex.add(from);
		parent.put(from, -1);
		while(pendingVertex.size() > 0){
			int pivot = pendingVertex
				.stream()
				.sorted(Comparator.comparing(presentLength::get))
				.findFirst()
				.get();
			pendingVertex.remove(pivot);
			if(pivot == to) {
				return takeWhile(to, parent::get, parent::containsKey)
						.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
			}
			Set<Integer> nbNotU = g.getNeighbour(pivot);
			nbNotU.removeAll(U);
			
			for(int i: nbNotU){
				if(!presentLength.containsKey(i)){
					pendingVertex.add(i);
					presentLength.put(i, Integer.MAX_VALUE);
				}
				int l_i = g.get(pivot, i).isPresent()?
						presentLength.get(pivot) + g.get(pivot, i).getAsInt()
						: Integer.MAX_VALUE;
				if(l_i < presentLength.getOrDefault(i, Integer.MAX_VALUE)){
					presentLength.put(i, l_i);
					parent.put(i, pivot);
				}
			}
		}
		return null;
	}
	
	static IntStream takeWhile(int seed, IntUnaryOperator ope, IntPredicate pre){
		IntStream.Builder builder = IntStream.builder();
		int next = seed;
		while(pre.test(next)){
			builder.accept(next);
			if(ope.applyAsInt(next) != -1) next = ope.applyAsInt(next);
			else break;
		}
		return builder.build();
	}
	
	static int sumWeight(Graph g, List<Integer> path){
		int result = 0;
		for(int i = 0; i < path.size()-1; i++){
			result += g.get(path.get(i), path.get(i+1)).getAsInt();
		}
		return result;
	}
}