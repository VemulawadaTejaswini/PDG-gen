import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
			for (int i = 0; i < N; i++) q.add(sc.nextInt());
			for (int i = 0; i < M; i++) q.add(q.poll() / 2);
			long sum = 0;
			for (int i = 0; i < N && !q.isEmpty(); i++) sum += q.poll();
			System.out.println(sum);
		}
	}
}
