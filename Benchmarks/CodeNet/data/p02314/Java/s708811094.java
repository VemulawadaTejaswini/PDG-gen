import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[] DP = new int[n + 1];
		for (int i = 1; i < n + 1; i++) {
			DP[i] = Integer.MAX_VALUE;
		}

		for (int j = 0; j < m; j++) {
			int val = scn.nextInt();
			for (int i = 1; i < n + 1; i++) {
				if (i >= val) {
					DP[i] = Math.min(DP[i], DP[i - val] + 1);
				}
			}
		}
		System.out.println(DP[n]);
		scn.close();
	}
}

