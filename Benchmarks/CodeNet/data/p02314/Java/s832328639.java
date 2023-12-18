
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] coins = new int[m];
		for (int i = 0; i < m; i++) {
			coins[i] = in.nextInt();
		}
		int[] c = new int[200001];
		Arrays.fill(c, Integer.MAX_VALUE);
		for (int i = 0; i < m; i++) {
			c[coins[i]] = 1;
		}

		for (int i = 2; i < c.length; i++) {
			for (int j = 0; j < m; j++) {
				if (i-coins[j] <= 0) continue;
				int a = c[i-1]+1;
				int b = c[i-coins[j]]+1;
				c[i] = Math.min(c[i], Math.min(a, b));
			}
		}

		System.out.println(c[n]);


	}

}

