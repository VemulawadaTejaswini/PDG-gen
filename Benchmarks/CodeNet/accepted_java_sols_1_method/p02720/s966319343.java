import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		
		Queue<Long> queue = new LinkedList<>();
		for(long i = 1; i <= 9; i++)
			queue.add(i);
		
		for(int i = 0; i < k-1; i++) {
			long x = queue.remove();
			long rear = x%10;
			if(rear != 0) queue.add(10*x + rear-1);
			queue.add(10*x + rear);
			if(rear != 9) queue.add(10*x + rear+1);
		}
		System.out.println(queue.remove());
	}
}
