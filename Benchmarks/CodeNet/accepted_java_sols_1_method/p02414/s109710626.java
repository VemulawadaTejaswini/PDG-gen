
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			String str = br.readLine();
			String[] strArr = str.split(" ");

			int n = Integer.parseInt(strArr[0]);
			int m = Integer.parseInt(strArr[1]);
			int l = Integer.parseInt(strArr[2]);

			int[][] nm = new int[n][m];
			int[][] ml = new int[m][l];

			// create array (n * m)
			for(int i=0;i<n;i++){
				str = br.readLine();
				strArr = str.split(" ");
				for(int j=0;j<m;j++){
					// ???????????????????????????
					nm[i][j] = Integer.parseInt(strArr[j]);
				}
			}

			// create array (m * l)
			for(int i=0;i<m;i++){
				str = br.readLine();
				strArr = str.split(" ");
				for(int j=0;j<l;j++){
					// ???????????????????????????
					ml[i][j] = Integer.parseInt(strArr[j]);
				}
			}

			// calculate
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<n;i++){
				for(int j=0;j<l;j++){
					long c = 0;
					for(int k=0;k<m;k++){
						c += nm[i][k] * ml[k][j];
					}
					sb.append(c);
					sb.append(j<(l-1)?' ':'\n');
				}
			}

			System.out.print(sb.toString());

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException ioe) {
			}

		}
	}
}