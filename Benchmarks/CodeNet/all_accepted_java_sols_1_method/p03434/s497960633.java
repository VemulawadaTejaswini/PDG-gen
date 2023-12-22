import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>(100, Collections.reverseOrder());
		for (int i=0; i<n; i++ ) {
			pq.add(sc.nextInt());
		}
		int i=0;
		long sum = 0l;
		while (i<n) {
			if (i%2 == 0) {
				sum += pq.poll();
			} else {
				sum -= pq.poll();
			}
			i++;
		}
		System.out.println(sum);
		sc.close();
	}

}
