
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
		while ((data = reader.readLine()) != null) {
			StringTokenizer tokenizer = new StringTokenizer(data);
			StringTokenizer tokenizer2 = new StringTokenizer(reader.readLine());
			int[] nums = new int[4];
			int[] nums2 = new int[4];
			for (int i = 0; i < 4; i++) {
				nums[i] = Integer.parseInt(tokenizer.nextToken());
				nums2[i] = Integer.parseInt(tokenizer2.nextToken());
			}
			int hit = 0;
			int blow = 0;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (nums[i] == nums2[j])
						if (i == j)
							hit++;
						else
							blow++;
				}
			}
			builder.append(hit).append(' ').append(blow).append('\n');
		}
		System.out.print(builder);
	}
}