import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String[] inputList = br.readLine().split(" ");
			int n = Integer.parseInt(inputList[0]);
			int m = Integer.parseInt(inputList[1]);
			int l = Integer.parseInt(inputList[2]);
			int[][] a = new int[n][m];
			int[][] b = new int[m][l];
			BigInteger[][] c = new BigInteger[n][l];
			int i, j, k;
			for (i = 0; i < n; i++) {
				inputList = br.readLine().split(" ");
				for (j = 0; j < m; j++) {
					a[i][j] = Integer.parseInt(inputList[j]);
				}
			}
			for (i = 0; i < m; i++) {
				inputList = br.readLine().split(" ");
				for (j = 0; j < l; j++) {
					b[i][j] = Integer.parseInt(inputList[j]);
				}
			}

			for (i = 0; i < c.length; i++) {
				for (j = 0; j < c[i].length; j++) {
					c[i][j] = BigInteger.ZERO;
				}
			}

			String text = "";
			for (i = 0; i < n; i++) {
				for (j = 0; j < m; j++) {
					for (k = 0; k < l; k++) {
						c[i][k] = c[i][k].add(BigInteger.valueOf(a[i][j]).multiply(BigInteger.valueOf(b[j][k])));
					}
				}

				text = "";
				for (k = 0; k < l; k++) {
					text = text + c[i][k] + " ";
				}
				System.out.println(text.substring(0, text.length() - 1));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}