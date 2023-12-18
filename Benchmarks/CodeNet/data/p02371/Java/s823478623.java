import java.util.*;

public class Main {
	static boolean[] visited;
	static HashSet<Integer> used = new HashSet<>();
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    ArrayList<HashMap<Integer, Integer>> graph = new ArrayList<>();
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
		PriorityQueue<Path> queue = new PriorityQueue<>();
		int[] costsA = new int[n];
		queue.add(new Path(0, 0));
		search(costsA, queue, graph);
		int maxA = 0;
		int maxIdxA = 0;
		for (int i = 0; i < n; i++) {
		    if (maxA < costsA[i]) {
		        maxA = costsA[i];
		        maxIdxA = i;
		    }
		}
		queue.add(new Path(maxIdxA, 0));
		int[] costsB = new int[n];
		search(costsB, queue, graph);
		Arrays.sort(costsB);
		System.out.println(costsB[n - 1]);
	}
	
	static void search(int[] costs, PriorityQueue<Path> queue, ArrayList<HashMap<Integer, Integer>> graph) {
	    Arrays.fill(costs, Integer.MAX_VALUE);
	    while (queue.size() > 0) {
	        Path p = queue.poll();
	        if (costs[p.idx] <= p.value) {
	            continue;
	        }
	        costs[p.idx] = p.value;
	        for (Map.Entry<Integer, Integer> entry : graph.get(p.idx).entrySet()) {
	            queue.add(new Path(entry.getKey(), entry.getValue() + p.value));
	        }
	    }
	}
	
	static class Path implements Comparable<Path> {
	    int idx;
	    int value;
	    
	    public Path (int idx, int value) {
	        this.idx = idx;
	        this.value = value;
	    }
	    
	    public int compareTo(Path another) {
	        return value - another.value;
	    }
	}
}

