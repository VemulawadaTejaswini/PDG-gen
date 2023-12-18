import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			int[][] nums = new int[n + 1][n + 1];
			for (int i = 0; i < n; i++) {
				String[] str = br.readLine().split(" ");
				for (int j = 0; j < n; j++)
					nums[i][j] = Integer.parseInt(str[j]);
			}
			for (int i = 0; i < n; i++) {
				int sum = 0;
				for (int j = 0; j < n; j++)
					sum += nums[i][j];
				nums[i][n] = sum;
			}
			for (int i = 0; i < nums.length; i++) {
				int sum = 0;
				for (int j = 0; j < n; j++)
					sum += nums[j][i];
				nums[n][i] = sum;
			}
			for (int i = 0; i < nums.length; i++) {
				System.out.printf("%5d", nums[i][0]);
				for (int j = 1; j < nums.length; j++)
					System.out.printf("%5d", nums[i][j]);
				System.out.println();
			}
		}

	}

}