import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] strargs = new String[3];
		long[][] A = null;
		long[][] B = null;
		long[][] C = null;
		
		strargs = br.readLine().split("\\s+");
		
		int n = Integer.parseInt(strargs[0]);
		int m = Integer.parseInt(strargs[1]);
		int l = Integer.parseInt(strargs[2]);
		
		if ((1 <= n && n <= 100) && (1 <= m && m <= 100) && (1 <= l && l <= 100)) {
			A = new long[n][m];
			B = new long[m][l];
			C = new long[n][l];
			
			for (int i = 0; i < n; i++) {
				strargs = br.readLine().split("\\s+");
				for (int j = 0; j < m; j++) A[i][j] = Long.parseLong(strargs[j]);
			}
			
			for (int i = 0; i < m; i++) {
				strargs = br.readLine().split("\\s+");
				for (int j = 0; j < l; j++) B[i][j] = Long.parseLong(strargs[j]);
			}
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < l; j++) {
					for (int k = 0; k < m; k++) {
						C[i][j] += A[i][k] * B[k][j];
					}
				}
			}
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < l; j++) {
					sb.append(C[i][j]);
					if (j != (l - 1)) sb.append(" ");
				}
				if(i != (n - 1)) sb.append("\n");
			}
			
			System.out.println(sb);
		}
	}
}