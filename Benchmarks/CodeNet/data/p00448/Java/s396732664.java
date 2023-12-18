import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int r;
	static int c;
	static int[][] a;
	static int initialCount;
	static int answer;

	public static void main(String[] args) {
		while (read()) {
			solve(0);
			System.out.println(answer);
		}
		
	}

	public static void solve(int rownum) {
		if (rownum == r) {
			swapColumns();
			return;
		}
		//if swap
		swapRow(rownum);
		// if not swap
		notSwapRow(rownum);
	}

	public static void notSwapRow(int n) {
		solve(++n);
	}

	public static void swapRow(int n) {
		for (int j = 0; j < c; j++) {
			a[n][j] = a[n][j] == 1 ? 0 : 1;
		}
		solve(++n);
	}

	public static void swapColumns() {
		for (int j = 0; j < c; j++) {
			if (countUpColumns(j) > r / 2) {
				// swap j Columns
				for (int i = 0; i < r; i++) {
					a[i][j] = a[i][j] == 1 ? 0 : 1;
				}
			}
		}
		if (countUpZero() > initialCount && countUpZero() > answer) {
			answer = countUpZero();
		}

	}

	public static int countUpColumns(int j) {
		int num = 0;
		for (int i = 0; i < r; i++) {
			if (a[i][j] == 1) {
				num++;
			}
		}
		return num;
	}

	public static int countUpZero() {
		int count = 0;
		// height
		for (int i = 0; i < r; i++) {
			// width
			for (int j = 0; j < c; j++) {
				if (a[i][j] == 0) {
					count++;
				}
			}
		}
		return count;
	}

	public static boolean read() {
		initialCount =0;
		r = sc.nextInt();
		c = sc.nextInt();
		if (r == 0 && c == 0) {
			return false;
		}
		a = new int[r][c];
		// end

		// height
		for (int i = 0; i < r; i++) {
			// width
			for (int j = 0; j < c; j++) {
				a[i][j] = sc.nextInt();
				if (a[i][j] == 0) {
					initialCount++;
				}
			}
		}
		answer = initialCount;
		return true;

	}

}