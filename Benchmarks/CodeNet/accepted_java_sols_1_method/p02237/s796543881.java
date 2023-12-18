import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] am = new int[n][n];

		for (int i=0; i < n; i++) {
			String[] data = br.readLine().split(" ");
			int k = Integer.parseInt(data[1]);

			for (int j=0; j < k; j++) {
				int v = Integer.parseInt(data[2+j]);
				am[i][v-1] = 1;
			}
		}

		for (int i=0; i < n; i++) {
			System.out.print(am[i][0]);
			for (int j=1; j < n; j++) {
				System.out.print(" " + am[i][j]);
			}
			System.out.println();
		}
	}

}