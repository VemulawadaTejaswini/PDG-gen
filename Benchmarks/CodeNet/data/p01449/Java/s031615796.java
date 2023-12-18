import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static final int MAX = 1000000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] cells = new int[N];
		for (int i = 0; i < cells.length; i++) {
			cells[i] = sc.nextInt();
		}

		int[] dp = new int[N];
		boolean[] checked = new boolean[N];
		Arrays.fill(dp, MAX);
		dp[0] = 0;

		for (int i = 0; i < dp.length; i++) {
			if (dp[i] == MAX || cells[i] != 0) {
				continue;
			}
			for (int d = 1; d <= 6; d++) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				int jump = Math.min(i + d, N - 1);
				if (checked[jump]) {
					continue;
				}

				list.add(jump);
				checked[jump] = true;
				while (cells[jump] != 0) {
					jump += cells[jump];
					jump = Math.max(0, jump);
					jump = Math.min(N - 1, jump);

					if (list.contains(jump)) {
						// ループ
						break;
					} else {
						list.add(jump);
						checked[jump] = true;
					}
				}

				dp[jump] = Math.min(dp[jump], dp[i] + 1);

			}
		}
		System.out.println(dp[N - 1]);

		sc.close();
	}
}