import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
		String x = "";
		try {
			x = in.readLine();
			String[] nm = x.split(" ");
			int n = Integer.parseInt(nm[0]);
			int m = Integer.parseInt(nm[1]);
			
			int[][] md = new int[n + 1][m + 1];
			
			for (int i = 0; i < n; i++) {
				x = in.readLine();
				String[] e = x.split(" ");
				
				for (int j = 0; j < m; j++) {
					if (i == 0) md[n][j] = 0;
					
					md[i][j] = Integer.parseInt(e[j]);
					md[i][m] = md[i][m] + md[i][j];
					md[n][j] = md[n][j] + md[i][j];
				}
			}
			
			md[n][m] = 0;
			for (int i = 0; i < n; i++) {
				md[n][m] = md[n][m] + md[i][m];
			}
			
			for (int i = 0; i < (n + 1); i++) {
				for (int j = 0; j < (m + 1); j++) {
					if (j != 0) System.out.print(" ");
					System.out.print(md[i][j]);
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