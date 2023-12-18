import java.util.*;

public class Main {
    static int n;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[][] costs = new int[n][n];
		boolean[][] selected = new boolean[n][n];
		PriorityQueue<Path> queue = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
		    Arrays.fill(costs[i], Integer.MAX_VALUE);
		    queue.add(new Path(0, i, 0));
		    queue.add(new Path(n - 1, i, 0));
		    queue.add(new Path(i, 0, 0));
		    queue.add(new Path(i, n - 1, 0));
		}
		fill(queue, costs, selected);
		int ans = 0;
		for (int i = 0; i < n * n; i++) {
		    int x = sc.nextInt() - 1;
		    int row = x / n;
		    int col = x % n;
		    int value = costs[row][col];
		    selected[row][col] = true;
		    queue.add(new Path(row, col, value));
		    ans += value;
		    fill(queue, costs, selected);
		}
		System.out.println(ans);
	}
	
	static void fill(PriorityQueue<Path> queue, int[][] costs, boolean[][] selected) {
	    while (queue.size() > 0) {
	        Path p = queue.poll();
	        if (costs[p.row][p.col] <= p.value) {
	            continue;
	        }
	        costs[p.row][p.col] = p.value;
	        int next = p.value;
	        if (!selected[p.row][p.col]) {
	            next++;
	        }
	        if (p.row > 0) {
	            queue.add(new Path(p.row - 1, p.col, next));
	        }
	        if (p.row < n - 1) {
	            queue.add(new Path(p.row + 1, p.col, next));
	        }
	        if (p.col > 0) {
	            queue.add(new Path(p.row, p.col - 1, next));
	        }
	        if (p.col < n - 1) {
	            queue.add(new Path(p.row, p.col + 1, next));
	        }
	    }
	}
	
	
	static class Path implements Comparable<Path> {
	    int row;
	    int col;
	    int value;
	    
	    public Path(int row, int col, int value) {
	        this.row = row;
	        this.col = col;
	        this.value = value;
	    }
	    
	    public int compareTo(Path another) {
	        return value - another.value;
	    }
	}
}
