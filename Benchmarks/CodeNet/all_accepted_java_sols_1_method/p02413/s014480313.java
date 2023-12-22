import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int r, c, sum, sumOfAll;
		int[][] sheet;
		String[] size = in.readLine().split(" ");
		r = Integer.parseInt(size[0]);
		c = Integer.parseInt(size[1]);
		sheet = new int[r][c];
		for (int i = 0; i < r; i += 1) {
			sum = 0;
			String[] array = in.readLine().split(" ");
			for (int j = 0; j < c; j += 1) {
				sheet[i][j] = Integer.parseInt(array[j]);
				sb.append(sheet[i][j]).append(" ");
				sum += sheet[i][j];
			}
			sb.append(sum + System.getProperty("line.separator"));
		}
		sumOfAll = 0;
		for (int m = 0; m < c; m += 1) {
			sum = 0;
			for (int n = 0; n < r; n += 1) {
				sum += sheet[n][m];
			}
			sumOfAll += sum;
			sb.append(sum).append(" ");
		}
		sb.append(sumOfAll);
		System.out.println(sb);
	}
}