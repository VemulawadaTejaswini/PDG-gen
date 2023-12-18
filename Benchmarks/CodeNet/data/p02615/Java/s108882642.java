import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		long ans = 0;
		PriorityQueue<Pair> queue = new PriorityQueue<>();
		queue.add(new Pair(arr[n - 1], arr[n - 2]));
		queue.add(new Pair(arr[n - 1], arr[n - 2]));
		ans += arr[n - 1];
		for (int i = n - 3; i >= 0; i--) {
		    Pair p = queue.poll();
		    ans += p.value();
		    queue.add(new Pair(arr[i], p.left));
		    queue.add(new Pair(arr[i], p.right));
		}
		System.out.println(ans);
	}
	
	static class Pair implements Comparable<Pair> {
	    int left;
	    int right;
	    
	    public Pair(int left, int right) {
	        this.left = left;
	        this.right = right;
	    }
	    
	    public int value() {
	        return Math.min(left, right);
	    }
	    
	    public int compareTo(Pair another) {
	        return another.value() - value();
	    }
	}
}
