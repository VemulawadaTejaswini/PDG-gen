import java.io.*;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		String[] sp1 = line1.split(" ");
		int n = Integer.parseInt(sp1[0]);
		int m = Integer.parseInt(sp1[1]);
		int[][] a = new int[n][m];
		int[] b = new int[m];
		for (int i = 0; i<n  ; i++) {
			String line = br.readLine();
			String[] str = line.split(" ");
			for (int j=0; j<m ; j++ ) {
				a[i][j] = Integer.parseInt(str[j]);
			}
		}
		for (int i=0 ; i<m ;i++ ) {
			String line = br.readLine();
			b[i] = Integer.parseInt(line);
		}
		int[] c = new int[n];
		for (int i=0 ; i<n ; i++) {
			for (int j = 0; j<m ; j++) {
				c[i] += (a[i][j] * b[j]); 
			}
		}
		for (int youso : c) {
			System.out.println(youso);
		}
	}

}