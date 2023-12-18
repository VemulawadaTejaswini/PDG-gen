import java.util.Scanner;
import java.util.Arrays;
import static java.lang.Math.max;
class Main {

	int len(int i, int j, char[][] board) {
		if (board[i][j]=='*') return 0;
		int n = board.length;
		for (int k = 1; k < n; k++) {
			for (int l = 0; l <= k; l++) {
				if (i+k>=n||j+l>=n||i+l>=n||j+k>=n) return k;
				if (board[i+k][j+l]=='*') return k;
				if (board[i+l][j+k]=='*') return k;
			}
		}
		return n;
	}

	int solve(int n, char[][] board) {
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				ans = max(ans,len(i,j,board));
			}
		}
		return ans;
	}

	public static void main(String...args) {
		Main m = new Main();
		Scanner in = new Scanner(System.in);
		int n = 0;
		while((n = in.nextInt()) != 0) {
			char[][] board = new char[n][n];
			for (int i = 0; i < n; i++) {
				board[i] = in.next().trim().toCharArray();
			}
			int ans = m.solve(n, board);
			System.out.println(ans);
		}
	}
}