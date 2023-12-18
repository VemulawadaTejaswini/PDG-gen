import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		PriorityQueue<Path> queue = new PriorityQueue<>();
		for (int i = 0; i < m; i++) {
		    queue.add(new Path(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		UnionFindTree uft = new UnionFindTree(n);
		long total = 0;
	    while (queue.size() > 0) {
	        Path p = queue.poll();
	        if (!uft.same(p)) {
	            total += p.value;
	            uft.unite(p);
	        }
	    }
		System.out.println(total);
	}
	
	static class UnionFindTree {
	    int[] parents;
	    
	    public UnionFindTree(int size) {
	        parents = new int[size];
	        for (int i = 0; i < size; i++) {
	            parents[i] = i;
	        }
	    }
	    
	    public int find(int x) {
	        if (parents[x] == x) {
	            return x;
	        } else {
	            return parents[x] = find(parents[x]);
	        }
	    }
	    
	    public boolean same(int x, int y) {
	        return find(x) == find(y);
	    }
	    
	    public boolean same(Path p) {
	        return same(p.left, p.right);
	    }
	    
	    public void unite(int x, int y) {
	        if (!same(x, y)) {
	            parents[find(x)] = find(y);
	        }
	    }
	    
	    public void unite(Path p) {
	        unite(p.left, p.right);
	    }
	}
	
	static class Path implements Comparable<Path> {
	    int left;
	    int right;
	    int value;
	    
	    public Path(int left, int right, int value) {
	        this.left = left;
	        this.right = right;
	        this.value = value;
	    }
	    
	    public int compareTo(Path another) {
	        return value - another.value;
	    }
	}
}

