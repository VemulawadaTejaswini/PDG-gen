import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static char[][] grid;

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int N = scanner.nextInt();
			if (N == 0) {
				scanner.close();
				break;
			}
			int M = scanner.nextInt();

			grid = new char[M][N];
			for (int i = 0; i < grid.length; i++) {
				String line = scanner.next();
				for (int j = 0; j < grid[i].length; j++) {
					grid[i][j] = line.charAt(j);
				}
			}

			String ans = "";
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					if (Character.getNumericValue(grid[i][j]) < 10
							&& Character.getNumericValue(grid[i][j]) > 0) {
						// grid[i][j]が数字の時、深さ優先探索する
						String dfString = dfs(String.valueOf(grid[i][j]), i, j);
						if (dfString.length() > ans.length()
								|| (dfString.length() == ans.length() && dfString
										.compareTo(ans) > 0)) {
							// 桁数が大きいか、桁数が一緒でも辞書順で後ろならば、
							// その数字を採用する
							ans = dfString;
						}
					}
				}
			}

			System.out.println(ans);

		}

	}

	static String dfs(String sequence, int i, int j) {
		// 深さ優先探索
		String ans = sequence;
		if (i + 1 < grid.length
				&& Character.getNumericValue(grid[i + 1][j]) < 10) {
			String dfString = dfs(sequence + String.valueOf(grid[i + 1][j]),
					i + 1, j);
			if (dfString.length() > ans.length()
					|| (dfString.length() == ans.length() && dfString
							.compareTo(ans) > 0)) {
				// 桁数が大きいか、桁数が一緒でも辞書順で後ろならば、
				// その数字を採用する
				ans = dfString;
			}
		}
		if (j + 1 < grid[i].length
				&& Character.getNumericValue(grid[i][j + 1]) < 10) {
			String dfString = dfs(sequence + String.valueOf(grid[i][j + 1]), i,
					j + 1);
			if (dfString.length() > ans.length()
					|| (dfString.length() == ans.length() && dfString
							.compareTo(ans) > 0)) {
				// 桁数が大きいか、桁数が一緒でも辞書順で後ろならば、
				// その数字を採用する
				ans = dfString;
			}
		}

		return ans;

	}

}