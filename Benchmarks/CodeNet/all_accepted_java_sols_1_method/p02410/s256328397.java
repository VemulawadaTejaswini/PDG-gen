import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String a = reader.readLine();
			String[] b = a.split(" ");
			int c = Integer.parseInt(b[0]);
			int d = Integer.parseInt(b[1]);
			String[] e = new String[d];
			int[][] f = new int[c][d];
			for (int g = 0; g < c; g++) {
				a = reader.readLine();
				e = a.split(" ");
				for (int h = 0; h < d; h++) {
					f[g][h] = Integer.parseInt(e[h]);
				}
			}
			
			int[] i = new int[d];
			for (int j = 0; j < d; j++) {
				a = reader.readLine();
				i[j] = Integer.parseInt(a);
			}
			int k = 0;
			for (int l = 0; l < c; l++) {
				for (int m = 0; m < d; m++) {
					k += f[l][m] * i[m];
				}
				System.out.println(k);
				k = 0;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}