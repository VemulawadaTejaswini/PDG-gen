import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int l = Integer.parseInt(str[2]);
		long[][] nm = new long[n][m];
		long[][] calc = new long[n][l];

		for (int i = 0; i < n; i++) {
			str = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				nm[i][j] = Integer.parseInt(str[j]);
			}
		}
		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");
			for (int j = 0; j < l; j++) {
				int ml = Integer.parseInt(str[j]);
				for (int k = 0; k < n; k++) {
					calc[k][j] += nm[k][i] * ml;
				}
			}
		}

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < l; j++) {
				if (j != 0)
					System.out.print(" ");
				System.out.print(calc[i][j]);
			}
			System.out.println();
		}
	}
}