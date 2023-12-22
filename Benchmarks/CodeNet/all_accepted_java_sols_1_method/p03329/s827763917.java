import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		for (int i = 6; i <= N; i *= 6)
			list.add(i);
		for (int i = 9; i <= N; i *= 9)
			list.add(i);
		Collections.sort(list);

		int[] dp = new int[N + 1];
		for (int i = 1; i < dp.length; i++)
			dp[i] = i;
		for (int m : list)
			for (int i = m; i < dp.length; i++)
				if (dp[i] > dp[i - m] + 1)
					dp[i] = dp[i - m] + 1;
		System.out.println(dp[N]);
	}
}
