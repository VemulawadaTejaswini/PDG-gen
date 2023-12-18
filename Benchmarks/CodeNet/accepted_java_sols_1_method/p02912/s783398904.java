import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<n;i++) 	pq.add(sc.nextInt());

		for(int i=0;i<m;i++) {
			int waribiki = pq.poll();
			waribiki /= 2;
			pq.add(waribiki);
		}

		long ans =0;
		for(int i=0; i<n; i++) ans +=pq.poll();
		System.out.println(ans);
	}
}
