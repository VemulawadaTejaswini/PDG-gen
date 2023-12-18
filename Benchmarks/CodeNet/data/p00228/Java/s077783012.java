import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int[][] nums = new int[11][];
		nums[0] = new int[] { 0, 1, 1, 1, 1, 1, 1 };
		nums[1] = new int[] { 0, 0, 0, 0, 1, 1, 0 };
		nums[2] = new int[] { 1, 0, 1, 1, 0, 1, 1 };
		nums[3] = new int[] { 1, 0, 0, 1, 1, 1, 1 };
		nums[4] = new int[] { 1, 1, 0, 0, 1, 1, 0 };
		nums[5] = new int[] { 1, 1, 0, 1, 1, 0, 1 };
		nums[6] = new int[] { 1, 1, 1, 1, 1, 0, 1 };
		nums[7] = new int[] { 0, 1, 0, 0, 1, 1, 1 };
		nums[8] = new int[] { 1, 1, 1, 1, 1, 1, 1 };
		nums[9] = new int[] { 1, 1, 0, 1, 1, 1, 1 };
		nums[10] = new int[] { 0, 0, 0, 0, 0, 0, 0 };

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int times = Integer.parseInt(line);

			if (times == -1) {
				break;
			}

			int curr = 10;
			for (int i = 0; i < times; i++) {
				int next = Integer.parseInt(br.readLine());
				char[] sig = new char[7];

				for (int j = 0; j < 7; j++) {
					if (nums[curr][j] != nums[next][j]) {
						sig[j] = '1';
					} else {
						sig[j] = '0';
					}
				}
				curr = next;
				System.out.println(new String(sig));
			}
		}

	}

}