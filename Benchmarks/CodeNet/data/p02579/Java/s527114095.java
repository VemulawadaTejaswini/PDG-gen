import java.util.*;

public class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int h = sc.nextInt();
    	int w = sc.nextInt();
    	int ch = sc.nextInt() - 1;
    	int cw = sc.nextInt() - 1;
    	int dh = sc.nextInt() - 1;
    	int dw = sc.nextInt() - 1;
    	char[][] field = new char[h][];
    	int[][] costs = new int[h][w];
    	for (int i = 0; i < h; i++) {
    	    field[i] = sc.next().toCharArray();
    	    Arrays.fill(costs[i], Integer.MAX_VALUE);
    	}
    	PriorityQueue<Path> queue = new PriorityQueue<>();
    	queue.add(new Path(ch, cw, 0));
    	while (queue.size() > 0) {
    	    Path p = queue.poll();
    	    if (costs[p.h][p.w] <= p.value) {
    	        continue;
    	    }
    	    costs[p.h][p.w] = p.value;
    	    for (int i = Math.max(p.h - 2, 0); i <= p.h + 2 && i < h; i++) {
    	        for (int j = Math.max(p.w - 2, 0); j <= p.w + 2 && j < w; j++) {
    	            if (field[i][j] == '#' || costs[i][j] != Integer.MAX_VALUE) {
    	                continue;
    	            }
    	            int next = p.value;
    	            if (Math.abs(p.h - i) + Math.abs(p.w - j) > 1) {
    	                next++;
    	            }
    	            Path np = new Path(i, j, next);
    	            queue.add(np);
    	        }
    	    }
    	}
    	if (costs[dh][dw] == Integer.MAX_VALUE) {
    	    System.out.println(-1);
    	} else {
    	    System.out.println(costs[dh][dw]);
    	}
    }
    
    static class Path implements Comparable<Path> {
        int h;
        int w;
        int value;
        
        public Path(int h, int w, int value) {
            this.h = h;
            this.w = w;
            this.value = value;
        }
        
        public int compareTo(Path another) {
            return value - another.value;
        }
        
        public String toString() {
            return h + ":" + w + ":" + value;
        }
    }
}

