
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for(int i=0; i < N; i++) {
			pq.add(sc.nextInt());
		}
		
		
		int[] p = new int[N];
		
		int j = 0;
		while(! pq.isEmpty()) {
			p[j] = pq.poll();
			j ++;
		}
		
		int total = 0;

		
		for(int i=0; i<K; i++){
			total += p[i];
		}
		
		System.out.println(total);

	}
}

