import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] ab = new int[n][2];

		for (int i = 0; i < n; i++) {
			ab[i][0] = sc.nextInt();
			ab[i][1] = sc.nextInt();
		}
		Arrays.sort(ab, (x, y) -> x[0] - y[0]);
		PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> o2 - o1);

		int sum = 0;

		int index = 0;
		for (int i = 1; i <= m; i++) {
			while (index < n && ab[index][0] <= i) {
				q.add(ab[index][1]);
				index++;
			}

			if (q.size() != 0) {
				sum += (int) q.poll();
			}
		}

		System.out.println(sum);

		sc.close();

	}
}