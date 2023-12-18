import java.util.*;

public class Main {
	public static void main(String[]  args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		long[][] mint = new long[n][n];
		long[] xr = new long[n];
		long[] xc = new long[n];

		for (int r = 0; r < n; r++) {
			mint[r][r] = 0;
			xr[r] = scanner.nextInt();
			xc[r] = scanner.nextInt();
		}

		scanner.close();
	
		for (int r = 0; r < n - 1; r ++) {
			int i = r + 1;
			for (int l = 0; l <= r; l ++) {
				mint[l][i] = mint[l][r];
				mint[l][i] += xr[l] * xc[r] * xc[i];

				for (int m = l; m < r; m ++) {
					long t = mint[l][m] + mint[m + 1][r];
					t += xr[m + 1] * xc[r] * xc[i];
					t += xr[l] * xc[m] * xc[i];
					if (mint[l][i] > t) {
						mint[l][i] = t;
					}
				}
				
				if (i >= n - 1) break;
			}
		}
		System.out.println(mint[0][n - 1]);
	}
} 

