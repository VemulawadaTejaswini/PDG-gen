import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] arr = line.split(" ");
		int r = Integer.parseInt(arr[0]);
		int c = Integer.parseInt(arr[1]);

		int[][] spreadsheet = new int[r + 1][c + 1];
		int row = 0;
		while ((line = br.readLine()) != null) {
			String[] cols = line.split(" ");
			for (int col = 0; col < c; col++) {
				final int val = Integer.parseInt(cols[col]);
				spreadsheet[row][col] = val;
				spreadsheet[row][c] += val;
				spreadsheet[r][col] += val;
				spreadsheet[r][c] += val;
			}
			row++;
		}

		for (int i = 0; i <= r; i++) {
			for (int j = 0; j <= c; j++) {
				if (j != 0)
					System.out.print(" ");
				System.out.print(spreadsheet[i][j]);
			}
			System.out.println();
		}
	}
}