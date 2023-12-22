import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = "";
		while ((s = br.readLine()) != null) {

			int n = Integer.parseInt(s);

			int[] num = new int[n];

			boolean[] nums = new boolean[n + 1];

			for (int i = 0; i < nums.length; i++) {
				nums[i] = true;
			}

			nums[0] = false;
			nums[1] = false;

			int p = 0;

			for (int i = 2; i < n; i++) {
				num[p++] = i;
				if (nums[i]) {
					for (int k = i * 2; k <= n; k += i) {
						nums[k] = false;
					}
				}
			}
			int count = 0;
			for (int k = 0; k < nums.length; k++) {
				if (nums[k]) {
					count++;
				}
			}
			System.out.println(count);
		}

	}

}