import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Queue<Long> A = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < N; i++) {
			A.add(sc.nextLong());
		}
		sc.close();

		for (int i = 0; i < M; i++) {
			long max = A.poll();
			A.add(max / 2);
		}

		long ans = 0;
		while (!A.isEmpty()) {
			ans += A.poll();
		}
		System.out.println(ans);
	}
}
