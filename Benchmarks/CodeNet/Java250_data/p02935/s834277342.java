import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Double> queue = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
		    queue.add(sc.nextDouble());
		}
		while (queue.size() > 1) {
		    double a = queue.poll();
		    double b = queue.poll();
		    queue.add((a + b) / 2);
		}
		System.out.println(queue.poll());
	}
}
