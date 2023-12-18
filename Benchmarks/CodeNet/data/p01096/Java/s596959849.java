import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] darmas;
	static int[][] memo;
	static int max(int i, int j) {
		if(memo[i][j] == -1) {
			int n = j - i;
			if(n == 1) {
				memo[i][j] = 0;
			}
			else if(n == 2) {
				assert(j-1 == i+1);
				memo[i][j] = (Math.abs(darmas[i] - darmas[i+1]) <= 1) ? 2 : 0;
			}
			else {
				int lmax = 0;
				if(n >= 4) {
					lmax = max(i+1, j-1);
					lmax += (lmax == n-2) ? ( Math.abs(darmas[i] - darmas[j-1]) <= 1 ? 2 : 0) : 0;
				}
				for(int k = i + 1; k + 1 < j; k++) {
					int top = max(i,k);
					int bot = max(k, j);
					if(lmax < top + bot) {
						lmax = top + bot;
					}
				}
				memo[i][j] = lmax;
			}
		}
		return memo[i][j];
	}

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			for(int n = sc.nextInt(); n!= 0; n = sc.nextInt()) {
				darmas = new int[n];
				memo = new int[n][n+1];
				for(int i = 0; i < n; i++) {
					darmas[i] = sc.nextInt();
					Arrays.fill(memo[i], -1);
				}
				System.out.println(max(0, n));
			}
		}
	}
}

