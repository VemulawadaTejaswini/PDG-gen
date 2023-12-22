import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		PriorityQueue<Double> q = new PriorityQueue<>();
		for (int i = 0; i < N; i++) {
			q.add((double) sc.nextInt());
		}
		while (q.size() > 1) {
			double x = q.poll();
			double y = q.poll();
			q.add((x + y) / 2);
		}
		System.out.println(q.poll());
	}
}
