import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while (!(buf = br.readLine()).equals("0")) {
				int n = Integer.parseInt(buf);

				int m[][] = new int[n+1][n+1];
				Arrays.fill(m[n],0);
				for (int i=0;i<n;i++) {
					StringTokenizer st = new StringTokenizer(br.readLine());
					Arrays.fill(m[i],0);
					for (int j=0;j<n;j++) {
						m[i][j] = Integer.parseInt(st.nextToken());
						m[i][n] += m[i][j];
						m[n][j] += m[i][j];
					}
				}
				for (int i=0;i<n;i++) {
					m[n][n] += m[n][i];
				}
				for (int i=0;i<=n;i++) {
					for (int j=0;j<=n;j++) {
						System.out.printf("%5d",m[i][j]);
					}
					System.out.println("");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}