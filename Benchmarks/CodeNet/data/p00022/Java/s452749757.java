
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		while (true) {
			int n = Integer.parseInt(reader.readLine());
			if (n == 0) {
				break;
			}
			int[] nums = new int[n];
			for (int i = 0; i < n; i++) {
				nums[i] = Integer.parseInt(reader.readLine());
			}
			int max = Integer.MIN_VALUE;
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum = nums[i];
				for (int j = i; j < n; j++) {
					if (j != i)
						sum += nums[j];
					max = Math.max(max, sum);
				}
			}
			System.out.println(max);
		}
	}
}