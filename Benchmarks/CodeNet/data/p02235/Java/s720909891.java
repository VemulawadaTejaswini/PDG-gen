import java.util.*;

class LongCommSubs {
	int lcs(char[] X, char[] Y, int m, int n) {
		int[][] table = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0) {
					table[i][j] = 0;
				} else if (X[i - 1] == Y[j - 1]) {
					table[i][j] = table[i - 1][j - 1] + 1;
				} else {
					table[i][j] = max(table[i - 1][j], table[i][j - 1]);
				}
			}
		}
		return table[m][n];
	}

	/* Utility function to get max of 2 integers */
	int max(int x, int y) {
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LongCommSubs lcs = new LongCommSubs();
		int q = in.nextInt();
		in.nextLine();
		char[] X, Y;
		for (int i = 0; i < q; i++) {
			X = in.nextLine().trim().toCharArray();
			Y = in.nextLine().trim().toCharArray();
			System.out.println(lcs.lcs(X, Y, X.length, Y.length));
		}
		in.close();
	}
}

