import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int productCount = sc.nextInt();
			int numOfDiscountTicket = sc.nextInt();

			long[] products = new long[productCount];
			PriorityQueue<Long> queue = new PriorityQueue<>(productCount, (x,y) -> (int)(y - x));

			for(int i = 0 ; i < products.length ; i++ ) {
				//			products[i] = sc.nextInt();
				queue.offer(sc.nextLong());
			}

			for(int i = 0 ; i < numOfDiscountTicket ; i++) {
				Long v = queue.poll();
				queue.offer(v/2);
			}

			long sum = queue.stream().mapToLong(p -> p).sum();

			System.out.println(sum);
		}
	}
}
