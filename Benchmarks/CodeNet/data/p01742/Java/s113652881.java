import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	final long MODULO = (long) (1e9 + 7);
	String[] str;
	char empty = '`';

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		str = new String[n];
		for (int i = 0; i < n; ++i) {
			str[i] = sc.next();
			while (str[i].length() < 20)
				str[i] += empty;
		}
		System.out.println(f(0, n - 1, 0, 0));
	}

	long[][][][] memo = new long[50][50][20][28];
	{
		for (int i = 0; i < memo.length; ++i) {
			for (int j = 0; j < memo[i].length; ++j) {
				for (int k = 0; k < memo[i][j].length; ++k) {
					for (int l = 0; l < memo[i][j][k].length; ++l) {
						memo[i][j][k][l] = -1;
					}
				}
			}
		}
	}

	long f(int l, int r, int i, int c) {
		if (r - l < 0)
			return 1;
		if (c >= 27)
			return 0;
		if (memo[l][r][i][c] != -1)
			return memo[l][r][i][c];
		if (i == 19) {
			if (r - l > 0)
				return 0;
			boolean flag = true;
			for (int j = l; j <= r; ++j) {
				flag &= (str[j].charAt(i) == '?' && c > 0) || str[j].charAt(i) - 'a' + 1 == c;
			}
			return flag ? 1 : 0;
		}

		long ret = f(l, r, i, c + 1);
		for (int j = l; j <= r; ++j) {
			boolean flag = true;
			for (int k = l; k <= j; ++k) {
				flag &= (str[k].charAt(i) == '?' && c > 0) || str[k].charAt(i) - 'a' + 1 == c;
			}
			if (flag) {
				ret += f(l, j, i + 1, 0) * f(j + 1, r, i, c + 1) % MODULO;
				if (ret >= MODULO)
					ret -= MODULO;
			}
		}
		return memo[l][r][i][c] = ret;
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}