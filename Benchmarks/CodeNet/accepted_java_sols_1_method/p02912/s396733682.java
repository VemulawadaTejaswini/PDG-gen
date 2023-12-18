import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		PriorityQueue<Integer> stock = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
		    stock.add(- sc.nextInt());
		}
		for (int i = 0; i < m; i++) {
		    stock.add(stock.poll() / 2);
		}
		long sum = 0;
		while (stock.size() > 0) {
		    sum -= stock.poll();
		}
		System.out.println(sum);
   }
}
