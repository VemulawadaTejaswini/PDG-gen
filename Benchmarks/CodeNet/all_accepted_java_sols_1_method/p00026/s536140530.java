
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		String data;
		int[][] nums = new int[10][10];
		while ((data = reader.readLine()) != null) {
			StringTokenizer tokenizer = new StringTokenizer(data, ",");
			int x = Integer.parseInt(tokenizer.nextToken());
			int y = Integer.parseInt(tokenizer.nextToken());
			int size = Integer.parseInt(tokenizer.nextToken());
			if (size == 1) {
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						if (0 <= i + x - 1 && i + x - 1 <= 9 && 0 <= j + y - 1
								&& j + y - 1 <= 9) {
							if ((i == 1 && j == 1) || (i + j) % 2 == 1) {
								nums[i - 1 + x][j - 1 + y]++;
							}
						}
					}
				}
			} else if (size == 2) {
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						if (0 <= i + x - 1 && i + x - 1 <= 9 && 0 <= j + y - 1
								&& j + y - 1 <= 9) {
							nums[i - 1 + x][j - 1 + y]++;
						}
					}
				}
			} else {
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						if (0 <= i + x - 2 && i + x - 2 <= 9 && 0 <= j + y - 2
								&& j + y - 2 <= 9) {
							if (i == 2 || j == 2 || (i == 1 && j == 1)
									|| i * j == 3 || (i * j == 9)) {
								nums[i - 2 + x][j - 2 + y]++;
							}
						}
					}
				}
			}
		}
		int count = 0;
		int max = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				max = Math.max(max, nums[i][j]);
				if (nums[i][j] == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
		System.out.println(max);
	}
}