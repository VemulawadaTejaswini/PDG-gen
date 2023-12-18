import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int[] maxes = new int[c + 1];
		for (int i = 1; i <= c; i++) {
		    maxes[i] = sc.nextInt();
		}
		PriorityQueue<Ball> queue = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
		    queue.add(new Ball(sc.nextInt(), sc.nextInt()));
		}
		long total = 0;
		while (queue.size() > 0 && m > 0) {
		    Ball b = queue.poll();
		    if (maxes[b.color] == 0) {
		        continue;
		    }
		    maxes[b.color]--;
		    total += b.value;
		    m--;
		}
		System.out.println(total);
	}
	
	static class Ball implements Comparable<Ball> {
	    int color;
	    int value;
	    
	    public Ball(int color, int value) {
	        this.color = color;
	        this.value = value;
	    }
	    
	    public int compareTo(Ball another) {
	        return another.value - value;
	    }
	}
}

