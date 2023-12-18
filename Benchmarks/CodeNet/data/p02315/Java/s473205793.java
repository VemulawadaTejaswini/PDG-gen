
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int w = in.nextInt();
		Obj[] object = new Obj[n+1];
		for (int i = 1; i < object.length; i++) {
			object[i] = new Obj(in.nextInt(), in.nextInt());
		}
		int[][] dp = new int[n+1][w+1];

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= w; j++) {
				if (j < object[i].weight) {
					dp[i][j] = dp[i-1][j];
				} else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-object[i].weight] + object[i].value);
				}
			}
		}

		System.out.println(dp[n][w]);

	}
	static class Obj {
		int value;
		int weight;

		public Obj(int v, int w) {
			value = v;
			weight = w;
		}
	}

}

