import java.util.*;

public class Main {
    static ArrayList<HashMap<Integer, Integer>> graph;
    static int[] counts;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		counts = new int[n];
		for (int i = 1; i < n; i++) {
		    counts[i] = sc.nextInt();
		}
		graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
		    graph.add(new HashMap<>());
		}
		for (int i = 0; i < n - 1; i++) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    graph.get(a).put(b, c);
		    graph.get(b).put(a, c);
		}
		System.out.println(getCost(0, 0));
	}
	
	static int getCost(int from, int to) {
	    int sum = 0;
	    if (counts[to] != 0) {
	        return graph.get(from).get(to);
	    }
	    for (Map.Entry<Integer, Integer> entry : graph.get(to).entrySet()) {
	        if (entry.getKey() == from) {
	            continue;
	        }
	        if (getCount(to, entry.getKey()) == 0) {
	            continue;
	        }
	        sum += Math.min(getCost(to, entry.getKey()), entry.getValue());
	    }
	    return sum;
	}
	
	static int getCount(int from, int to) {
	    int sum = counts[to];
	    for (int x : graph.get(to).keySet()) {
	        if (x == from) {
	            continue;
	        }
	        sum += getCount(to, x);
	    }
	    return sum;
	}
}

