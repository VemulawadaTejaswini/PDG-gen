import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] cells = new int[N];
		for (int i = 0; i < cells.length; i++) {
			cells[i] = sc.nextInt();
		}
		sc.close();

		Deque<Integer> bfs = new ArrayDeque<Integer>();
		bfs.add(0);
		int[] dp = new int[N];
		Arrays.fill(dp, 10000000);
		dp[0] = 0;
		while (!bfs.isEmpty()) {
			int poll = bfs.pollFirst();
			if (cells[poll] == 0) {
				for (int d = 1; d <= 6; d++) {
					int jump = Math.min(poll + d, N - 1);
					if (dp[jump] > dp[poll] + 1) {
						dp[jump] = dp[poll] + 1;
						bfs.addLast(jump);
					}
				}
			} else {
				int jump = poll + cells[poll];
				if (dp[jump] > dp[poll]) {
					dp[jump] = dp[poll];
					bfs.addFirst(jump);
				}
			}
		}
		System.out.println(dp[N - 1]);

	}
}