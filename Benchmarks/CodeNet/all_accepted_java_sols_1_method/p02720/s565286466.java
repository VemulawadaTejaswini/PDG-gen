import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		sc.close();

		Queue<Long> que = new PriorityQueue<Long>();
		List<Long> list = new ArrayList<Long>();
		for (long i = 1; i <= 9; i++) {
			que.add(i);
		}

		while (list.size() < K) {
			int c = (int) (que.peek() % 10);
			long next = que.poll();
			for (int i = Math.max(0, c - 1); i <= Math.min(c + 1, 9); i++) {
				que.add(next * 10 + i);
			}
			list.add(next);
		}

		System.out.println(list.get(K - 1));
	}
}
