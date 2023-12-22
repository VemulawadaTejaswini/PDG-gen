import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
		int n = 0;
		int m = 0;
		
		int[][] md;
		int[] vd;
		
		String x = "";
		try {
			x = in.readLine();
			String[] nm = x.split(" ");
			n = Integer.parseInt(nm[0]);
			m = Integer.parseInt(nm[1]);
			
			md = new int[n][m];
			vd = new int[m];
			
			for (int i = 0; i < n; i++) {
				x = in.readLine();
				String[] row = x.split(" ");
				for (int j = 0; j < m; j++) {
					md[i][j] = Integer.parseInt(row[j]);
				}
			}
			
			for (int i = 0; i < m; i++) {
				x = in.readLine();
				
				vd[i] = Integer.parseInt(x);
			}
			
			for (int i = 0; i < n; i++) {
				int v = 0;
				for (int j = 0; j < m; j++) {
					v = v + md[i][j] * vd[j];
				}
				System.out.println(v);
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