import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] num = br.readLine().split(" ");
		int n = Integer.parseInt(num[0]);
		int m = Integer.parseInt(num[1]);
		Integer[][] list = new Integer[n][m];
		Integer[] multipler = new Integer[m];

		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				list[i][j] = Integer.parseInt(str[j]);
			}
		}
		for (int i = 0; i < m; i++) {
			multipler[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < m; j++) {
				sum += list[i][j] * multipler[j];
			}
			System.out.println(sum);
		}
	}
}