import java.util.*;

public class Main {
    static int n;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] costs = new int[n * n];
		boolean[] selected = new boolean[n * n];
		PriorityQueue<Path> queue = new PriorityQueue<>();
	    Arrays.fill(costs, Integer.MAX_VALUE);
		for (int i = 0; i < n * n; i++) {
		    costs[i] = Math.min(Math.min(i / n, n - 1 - i / n), Math.min(i % n, n - 1 - i % n));
		}
		int ans = 0;
		for (int i = 0; i < n * n; i++) {
		    int x = sc.nextInt() - 1;
		    int row = x / n;
		    int col = x % n;
		    int value = costs[x];
		    selected[x] = true;
	        if (x / n > 0) {
	            if (costs[x - n] > value) {
	                queue.add(new Path(x - n, value));
	            }
	        }
	        if (x / n < n - 1) {
	            if (costs[x + n] > value) {
	                queue.add(new Path(x + n, value));
	            }
	        }
	        if (x % n > 0) {
	            if (costs[x - 1] > value) {
	                queue.add(new Path(x - 1, value));
	            }
	        }
	        if (x % n < n - 1) {
	            if (costs[x + 1] > value) {
	                queue.add(new Path(x + 1, value));
	            }
	        }
		    ans += value;
		    fill(queue, costs, selected);
		}
		System.out.println(ans);
	}
	
	static void fill(PriorityQueue<Path> queue, int[] costs, boolean[] selected) {
	    while (queue.size() > 0) {
	        Path p = queue.poll();
	        if (costs[p.idx] <= p.value) {
	            continue;
	        }
	        costs[p.idx] = p.value;
	        int next = p.value;
	        if (!selected[p.idx]) {
	            next++;
	        }
	        if (p.idx / n > 0) {
	            if (costs[p.idx - n] > next) {
	                queue.add(new Path(p.idx - n, next));
	            }
	        }
	        if (p.idx / n < n - 1) {
	            if (costs[p.idx + n] > next) {
	                queue.add(new Path(p.idx + n, next));
	            }
	        }
	        if (p.idx % n > 0) {
	            if (costs[p.idx - 1] > next) {
	                queue.add(new Path(p.idx - 1, next));
	            }
	        }
	        if (p.idx % n < n - 1) {
	            if (costs[p.idx + 1] > next) {
	                queue.add(new Path(p.idx + 1, next));
	            }
	        }
	    }
	}
	
	
	static class Path implements Comparable<Path> {
	    int idx;
	    int value;
	    
	    public Path(int idx, int value) {
	        this.idx = idx;
	        this.value = value;
	    }
	    
	    public int compareTo(Path another) {
	        return value - another.value;
	    }
	}
}
