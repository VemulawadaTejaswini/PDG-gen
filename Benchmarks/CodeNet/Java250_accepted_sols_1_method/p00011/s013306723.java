
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
		StringTokenizer tokenizer;
		int a = Integer.parseInt(reader.readLine());
		int n = Integer.parseInt(reader.readLine());
		int[] nums = new int[a];
		for (int i = 0; i < a; i++) {
			nums[i] = i + 1;
		}
		for (int i = 0; i < n; i++) {
			tokenizer = new StringTokenizer(reader.readLine(), ",");
			int x = Integer.parseInt(tokenizer.nextToken()) - 1;
			int y = Integer.parseInt(tokenizer.nextToken()) - 1;
			int tmp = nums[x];
			nums[x] = nums[y];
			nums[y] = tmp;
		}
		for (int i = 0; i < a; i++) {
			builder.append(nums[i]).append('\n');
		}
		System.out.print(builder);

	}

}