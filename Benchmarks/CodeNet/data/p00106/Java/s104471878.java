import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int[][] price = new int[3][26];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		for (int i = 0; i < 3; i++) {
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			if (n == 0) {
				break;
			}
			//
			for (int i = 0; i < 3; i++) {
				for (int j = 1; j < 26; j++) {
					switch (i) {
						case 0:
							price[i][j] = price[i][j - 1] + 380;
							if (j % 5 == 0) {
								price[i][j] -= 380;
							}
							break;
						case 1:
							price[i][j] = price[i][j - 1] + 550;
							if (j % 4 == 0) {
								price[i][j] -= 330;
							}
							break;
						case 2:
							price[i][j] = price[i][j - 1] + 850;
							if (j % 3 == 0) {
								price[i][j] -= 306;
							}
							break;
					}
				}
			}
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < n / 200 + 1; i++) {
				for (int j = 0; j < n / 300 + 1; j++) {
					for (int k = 0; k < n / 500 + 1; k++) {
						if (i * 200 + j * 300 + k * 500 == n) {
							int sum = price[0][i] + price[1][j] + price[2][k];
							if (sum < min) {
								min = sum;
							}
						}
					}
				}
			}
			System.out.println(min);
		}
	}
}