import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] line = br.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int m = Integer.parseInt(line[1]);
		int l = Integer.parseInt(line[2]);
		int[][] A = new int[n][m];
		int[][] B = new int[m][l];
		int[][] C = new int[n][l];

		for(int i = 0; i < n; i++) {
			String row = br.readLine();
			String[] elem = row.split(" ");
			for(int j = 0; j < m; j++) {
				A[i][j] = Integer.parseInt(elem[j]);
			}
		}

		for(int i = 0; i < m; i++) {
			String row = br.readLine();
			String[] elem = row.split(" ");
			for(int j = 0; j < l; j++) {
				B[i][j] = Integer.parseInt(elem[j]);
			}
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < l; j++) {
				for(int k = 0; k < m; k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
				sb.append(C[i][j]);
				if(j != l-1) {
					sb.append(" ");
				} else {
					sb.append("\n");
				}
			}
		}
		System.out.print(sb);
	}
}