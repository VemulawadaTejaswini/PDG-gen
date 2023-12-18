import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String s = reader.readLine();
				
			int n = Integer.parseInt(s);
			String t = reader.readLine();
			String[] u = t.split(" "); 
			
			int[] m = new int[n];
			
			for (int i = 0; i < n; i++) {
				m[i] = Integer.parseInt(u[i]);
			}
			
			for (int j = n - 1; j > -1; j--) {
				System.out.print(m[j]);
				if (j != 0) {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}