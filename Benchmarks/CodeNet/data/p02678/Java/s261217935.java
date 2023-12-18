import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
		    graph.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    graph.get(a).add(b);
		    graph.get(b).add(a);
		}
		int[] goals = new int[n + 1];
		PriorityQueue<Path> queue = new PriorityQueue<>();
		queue.add(new Path(1, 1, 0));
		while (queue.size() > 0) {
		    Path p = queue.poll();
		    if (goals[p.idx] != 0) {
		        continue;
		    }
		    goals[p.idx] = p.from;
		    for (int x : graph.get(p.idx)) {
		        queue.add(new Path(x, p.idx, p.value + 1));
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 2; i <= n; i++) {
		    if (goals[i] == 0) {
		        System.out.println("No");
		        return;
		    }
		    sb.append(goals[i]).append("\n");
		}
		System.out.println("Yes");
		System.out.print(sb);
	}
	
	static class Path implements Comparable<Path> {
	    int idx;
	    int from;
	    int value;
	    
	    public Path(int idx, int from, int value) {
	        this.idx = idx;
	        this.from = from;
	        this.value = value;
	    }
	    
	    public int compareTo(Path another) {
	        return value - another.value;
	    }
	}
}
 