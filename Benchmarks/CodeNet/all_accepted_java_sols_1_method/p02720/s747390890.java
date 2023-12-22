import java.util.*;
public class Main{
	public static void main(String[] args){
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		Deque<Long> deque = new ArrayDeque<Long>();
		for (long i = 1; i < 10; i++) {
			deque.add(i);
		}
		for (int i = 1; i < K; i++) {
			long num = deque.poll();
			if (num%10 != 0) {
				deque.add(10 * num + num%10 - 1);
			}
			deque.add(10* num + num%10);
			if (num%10 != 9) {
				deque.add(10 * num + num%10 + 1);
			}
		}
		System.out.println(deque.poll());
	}
}