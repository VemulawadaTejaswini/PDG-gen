import java.util.*;
import java.util.function.BiConsumer;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		long sum = 0;
		for(int i=0; i < N; i++) {
			long num =sc.nextLong();
			pq.add(num);
			sum += num;
		}
		sum -= pq.poll();
		System.out.println(sum);


		
	}
}
