import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);
	int n;
	boolean[][] dp;
	boolean[][] schedule;
	
	public void  run() {
		while (true) {
			n = in.nextInt();
			if (n == 0) break;
			schedule = new boolean[n][31];
			dp = new boolean[n][n];
			for (int i = 0; i < schedule.length; i++) {
				int schen = in.nextInt();
				for (int j = 0; j < schen; j++) {
					int x = in.nextInt();
					schedule[i][x] = true;
				}
			}

			for (int i = 0; i < dp.length; i++) {
				dp[i][i] = true;
			}
			
			boolean[] temp = new boolean[n];
			end : for (int i = 1; i < schedule[0].length; i++) {
				Arrays.fill(temp, false);
				for (int j = 0; j < schedule.length; j++) {
					if (schedule[j][i]) {
						temp[j] = true;
					}
				}
				for (int j = 0; j < temp.length; j++) {
					if (temp[j]) {
						for (int k = 0; k < schedule.length; k++) {
							if (temp[k]) {
								for (int l = 0; l < dp.length; l++) {
									if (dp[k][l]) dp[j][l] = true;	
								}
							}
						}
					}
				}
				for (int j = 0; j < n; j++) {
					for (int k = 0; k < dp.length; k++) {
						if (!dp[j][k]) break;
						else if (k == dp.length - 1) {
							System.out.println(i);
							break end;
						}
					}
				}
				if (i == schedule[0].length - 1) System.out.println("-1");
			}
		}
	}
	
	public static void main(String args[]) {
		new Main().run();
	}
}