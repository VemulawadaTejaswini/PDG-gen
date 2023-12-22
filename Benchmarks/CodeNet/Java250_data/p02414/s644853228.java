import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		int l = Integer.parseInt(input[2]);
		long[][] a = new long[n][m];
		long[][] b = new long[m][l];

		for (int i = 0; i < n; i++) {
			input = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				a[i][j] = Integer.parseInt(input[j]);
			}
		}
		for (int i = 0; i < m; i++) {
			input = br.readLine().split(" ");
			for (int j = 0; j < l; j++) {
				b[i][j] = Integer.parseInt(input[j]);
			}
		}

		StringBuffer sb = new StringBuffer();
		String space = " ";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				long sum = 0;
				for (int k = 0; k < m; k++) {
					sum += a[i][k] * b[k][j];
				}
				if (j != l -1) {
					sb.append(sum + space);
				} else {
					sb.append(sum + "\n");
				}
			}
		}
		System.out.print(sb.toString());
	}
}