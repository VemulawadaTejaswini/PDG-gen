import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
		long sum = 0;
		for(int i=0; i<n; i++) {
		    pq.add(Double.parseDouble(sc.next()));
		}
		

		while(m > 0) {
		    double w = ((double)(pq.poll()) / 2.0);
		    pq.add(w);
		    m--;
		}
		
		for(int i=0; i<n; i++) {
		    sum += pq.poll();
		}
		System.out.println(sum);
	}
	
}
