import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		Deque<Long> deq = new ArrayDeque<>();
		for(long i = 1; i <= 9; i++)
			deq.offer(i);
		for(int i = 0; i < K-1; i++) {
			long x = deq.poll();
			if(x % 10 != 0)
				deq.offer(10*x+x%10-1);
			deq.offer(10*x+x%10);
			if(x % 10 != 9)
				deq.offer(10*x+x%10+1);
		}
		System.out.println(deq.poll());
	}

}
