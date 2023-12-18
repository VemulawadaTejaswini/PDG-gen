import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int n, m, s, d;
		while ((line = bf.readLine()) != null) {
			n = Integer.parseInt(line);
			m = Integer.parseInt(bf.readLine()) - 1;
			s = Integer.parseInt(bf.readLine()) - 1;
			d = Integer.parseInt(bf.readLine());
			char[][] c = new char[d][n - 1];
			for (int i = 0; i < d; i++)
				c[i] = bf.readLine().toCharArray();
			int[][] col = new int[2][d + 1];
			col[0][0] = m;
			col[1][d] = s;
			bf.readLine();
			for (int i = 0; i < d; i++) {
				if (col[0][i] < n - 1 && c[i][col[0][i]] == '1') {
					col[0][i + 1] = col[0][i] + 1;
				} else if (col[0][i] > 0 && c[i][col[0][i] - 1] == '1') {
					col[0][i + 1] = col[0][i] - 1;
				} else {
					col[0][i + 1] = col[0][i];
				}
			}
			for (int i = d - 1; i >= 0; i--) {
				if (col[1][i + 1] < n - 1 && c[i][col[1][i + 1]] == '1') {
					col[1][i] = col[1][i + 1] + 1;
				} else if (col[1][i + 1] > 0 && c[i][col[1][i + 1] - 1] == '1') {
					col[1][i] = col[1][i + 1] - 1;
				} else {
					col[1][i] = col[1][i + 1];
				}
			}
			if (col[0][0] == col[1][0]) {
				System.out.println("0");
				continue;
			}
			for (int i = 1; i <= d; i++) {
				if (col[0][i] == col[0][i - 1] && col[1][i] == col[1][i - 1] && (col[0][i] - col[1][i] == 1 || col[1][i] - col[0][i] == 1)) {
					System.out.println(i + " " + Math.max(col[0][i], col[1][i]));
					break;
				}
				if (i == d) {
					System.out.println("1");
				}
			}
		}
	}
}