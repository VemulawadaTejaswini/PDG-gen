import java.io.*;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		String[] spl = line1.split(" ");
		int n = Integer.parseInt(spl[0]);
		int m = Integer.parseInt(spl[1]);
		int l = Integer.parseInt(spl[2]);
		int[][] a = new int[n][m];
		int[][] b = new int[m][l];
		long[][] c = new long[n][l];
		for (int i = 0; i<n ; i++) {
			String line = br.readLine();
			String[] str = line.split(" ");
			for (int j = 0; j<m ; j++ ) {
				a[i][j] += Integer.parseInt(str[j]);
			}
		}

		for (int i = 0; i<m ; i++ ) {
			String line = br.readLine();
			String[] str = line.split(" ");
			for (int j = 0; j<l ; j++ ) {
				b[i][j] += Integer.parseInt(str[j]);
			}
		}

		for (int i = 0; i<n ; i++ ) {
			for (int j = 0; j<m ; j++ ) {
				for (int k = 0; k<l ;k++ ) {
					c[i][k] += (long) (a[i][j] * b[j][k]);
				}
			}
		}

		for (int i = 0; i<n ; i++ ) {
			for ( int j = 0; j<(l-1) ; j++ ) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println(c[i][l-1]);
		}
		
	}
}