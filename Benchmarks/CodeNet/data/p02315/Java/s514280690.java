import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int wt = in.nextInt();
		Item[] items = new Item[n];
		for (int i = 0; i < n; i++) {
			Item m = new Item(in.nextInt(), in.nextInt());
			items[i] = m;
		}
		int[][] dp = new int[n+1][wt+1];

		// solve
		for (int i = 0; i < n; i++) {
			for (int w = 0; w <= wt; w++) {
				if (items[i].weight <= w) {
					dp[i+1][w] = Math.max(dp[i][w-items[i].weight] + items[i].value
							, dp[i][w]);
				} else {
					dp[i+1][w] = dp[i][w];
				}
			}
		}
		System.out.println(dp[n][wt]);
	}

	static class Item {
		int value;
		int weight;

		public Item(int v, int w) {
			value = v;
			weight = w;
		}
	}
}

