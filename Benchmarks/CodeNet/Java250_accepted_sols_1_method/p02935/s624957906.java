import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Nの入力
		int N = sc.nextInt();
		
		// viをPriorityQueueに格納
		PriorityQueue<Double> pq = new PriorityQueue<> ();
		for (int i = 0; i < N; i++) {
			pq.add(sc.nextDouble());
		}
		
		for (int i = 0; i < N-1; i++) {
			double x = pq.poll();
			double y = pq.poll();
			pq.add((x+y)/2);
		}
		
		System.out.println(pq.poll());
		
		sc.close();
	}
}
