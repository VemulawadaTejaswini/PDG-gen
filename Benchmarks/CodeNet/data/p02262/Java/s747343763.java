import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int lim = Integer.parseInt(in.readLine());
			int[] a = new int[lim];
			for (int i = 0; i < lim; i++) {
				a[i] = Integer.parseInt(in.readLine());
			}

			int cnt = 0;
			int m = (int)Math.sqrt(lim);
			int[] g = new int[m];
			for (int i = 0; i < m; i++) {
				g[i] = (m - i) * (m - i);
			}
			
			for (int k = 0; k < m; k++) {
				for (int i = g[k]; i < a.length; i++) {
					int v = a[i];
					
					int j = i - g[k];
					while ((j >= 0) && (a[j] > v)) {
						a[j + g[k]] = a[j];
						j = j - g[k];
						cnt++;
					}
					a[j + g[k]] = v;
				}
			}
			
			System.out.println(m);
			System.out.print(g[0]);
			for (int i = 1; i < g.length; i++) {
				System.out.print(" " + g[i]);
			}
			System.out.println();
			System.out.println(cnt);
			
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
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