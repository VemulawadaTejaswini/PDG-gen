import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(solve());
	}

	public static long solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		Queue<Integer> q = new PriorityQueue<Integer>();
		for (int i = 0; i < N; i++) {
			q.add(sc.nextInt());
		}

		int[] t = new int[N];
		for (int j = q.size() - 1; j >= 0; --j) {
			t[j] = q.poll();
		}

		long sum = 0;
		if (K <= N)
			for (int l = K; l < t.length; l++) {
				sum += t[l];
			}
		return sum;
	}
}
	