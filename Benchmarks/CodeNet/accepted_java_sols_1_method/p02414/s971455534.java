import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] ma;
		int[][] mb;
		
		String x = "";
		try {
			x = in.readLine();
			String[] data = x.split(" ");
			int n = Integer.parseInt(data[0]);
			int m = Integer.parseInt(data[1]);
			int l = Integer.parseInt(data[2]);
			
			ma = new int[n][m];
			mb = new int[m][l];

			for (int i = 0; i < n; i++) {
				x = in.readLine();
				data = x.split(" ");
				
				for (int j = 0; j < m; j++) {
					ma[i][j] = Integer.parseInt(data[j]);
				}
			}
			
			for (int i = 0; i < m; i++) {
				x = in.readLine();
				data = x.split(" ");
				
				for (int j = 0; j < l; j++) {
					mb[i][j] = Integer.parseInt(data[j]);
				}
			}
			
			long[][] mc = new long[n][l];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < l; j++) {
					mc[i][j] = 0;
					for (int k = 0; k < m; k++) {
						mc[i][j] = mc[i][j] + ma[i][k] * mb[k][j];
					}
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < l; j++) {
					if (j != 0) System.out.print(" ");
					System.out.print(mc[i][j]);
				}
				System.out.println();
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}