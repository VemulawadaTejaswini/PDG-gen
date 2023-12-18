import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		for (int i = 0; i < n; i++) {
			pq.add(sc.nextInt());
		}
		int t;
		for (int i = 0; i < m; i++) {
			t = pq.poll();
			pq.add(t / 2);
		}
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += pq.poll();
		}
		System.out.println(sum);
	}
}