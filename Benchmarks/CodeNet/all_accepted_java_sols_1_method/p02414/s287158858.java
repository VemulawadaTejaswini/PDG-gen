import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		int n = Integer.parseInt(strs[0]);
		int m = Integer.parseInt(strs[1]);
		int l = Integer.parseInt(strs[2]);

		int[][] list01 = new int[n][m];
		int[][] list02 = new int[m][l];
		long[][] list03 = new long[n][l];

		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				list01[i][j] += Integer.parseInt(str[j]);
			}
		}

		for (int i = 0; i < m; i++) {
			String[] str = br.readLine().split(" ");
			for (int j = 0; j < l; j++) {
				list02[i][j] += Integer.parseInt(str[j]);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < l; k++) {
					list03[i][k] += (long) (list01[i][j] * list02[j][k]);
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (l - 1); j++) {
				System.out.print(list03[i][j] + " ");
			}
			System.out.println(list03[i][l - 1]);
		}

	}
}