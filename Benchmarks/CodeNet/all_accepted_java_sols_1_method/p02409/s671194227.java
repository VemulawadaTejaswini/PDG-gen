import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
		
			int [][][] a = new int[4][3][10];
					
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 3; j++) {
					for (int k = 0; k < 10; k++) {
						a[i][j][k] = 0;
					}
				}
			}

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String s = reader.readLine();	
			int n = Integer.parseInt(s);

			String t;
			String[] u;
			int b, f, r, v;
			for (int l = 0; l < n; l++) {
				t = reader.readLine();
				u = t.split(" ");
				b = Integer.parseInt(u[0]);
				f = Integer.parseInt(u[1]);
				r = Integer.parseInt(u[2]);
				v = Integer.parseInt(u[3]);
				a[b - 1][f - 1][r - 1] += v;
			}
			
			for (int m = 0; m < 4; m++) {
				for (int o = 0; o < 3; o++) {
					for (int p = 0; p < 10; p++) {
						System.out.print(" ");
						System.out.print(a[m][o][p]);
					}
					System.out.println();
				}
				if (m != 3) {
					System.out.println("####################");
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}