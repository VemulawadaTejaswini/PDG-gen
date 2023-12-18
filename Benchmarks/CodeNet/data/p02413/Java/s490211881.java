
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			String str = br.readLine();
			String[] strArr = str.split(" ");

			int r = Integer.parseInt(strArr[0]);
			int c = Integer.parseInt(strArr[1]);

			int[][] set = new int[r + 1][c + 1];
			for (int i = 0; i < r; i++) {

				str = br.readLine();
				strArr = str.split(" ");

				for (int j = 0; j < c; j++) {
					set[i][j] = Integer.parseInt(strArr[j]);

					// ????¨????????¨????
					set[i][c] += set[i][j]; // ???
					set[r][j] += set[i][j]; // ???
					set[r][c] += set[i][j]; // ?????????????¨?
				}
			}

			for (int i = 0; i < set.length; i++) {
				for (int j = 0; j < set[i].length; j++) {
					System.out.print(set[i][j]);
					if (j < c)
						System.out.print(" ");
				}
				System.out.println();
			}

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