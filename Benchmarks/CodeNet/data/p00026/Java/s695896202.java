
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
		int[][] nums = new int[14][14];
		while ((data = reader.readLine()) != null) {
			if(data.isEmpty())
				break;
			StringTokenizer tokenizer = new StringTokenizer(data, ",");
			int x = Integer.parseInt(tokenizer.nextToken()) + 2;
			int y = Integer.parseInt(tokenizer.nextToken()) + 2;
			int size = Integer.parseInt(tokenizer.nextToken());

			nums[x][y]++;
			nums[x - 1][y]++;
			nums[x][y - 1]++;
			nums[x][y + 1]++;
			nums[x + 1][y]++;
			if (size == 2 || size == 3) {
				nums[x - 1][y - 1]++;
				nums[x - 1][y + 1]++;
				nums[x + 1][y - 1]++;
				nums[x + 1][y + 1]++;
			}
			if (size == 3) {
				nums[x - 2][y]++;
				nums[x][y - 2]++;
				nums[x][y + 2]++;
				nums[x + 2][y]++;
			}
		}
		int count = 0;
		int max = 0;
		for (int i = 2; i < 12; i++) {
			for (int j = 2; j < 12; j++) {
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