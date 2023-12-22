import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long m = in.nextLong();
		
		Queue<Long> queue = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < n; i++)
		        queue.add(in.nextLong());
		for (int i = 0; i < m; i++) 
		        queue.add(queue.poll() / 2);
		
		long ans = 0;
		int size = queue.size();
		for(int i = 0 ; i < size;i++)
		        ans += queue.poll();
		System.out.println(ans);
		
	}
}
