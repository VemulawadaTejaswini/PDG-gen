
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		String data;
		int[] nums = new int[101];
		while ((data = reader.readLine()) != null) {
			if (data.isEmpty())
				break;
			int num = Integer.parseInt(data);
			nums[num]++;
		}
		int max = 0;
		for (int i = 0; i < 101; i++) {
			max = Math.max(max, nums[i]);
		}
		for (int i = 0; i < 101; i++) {
			if (nums[i] == max) {
				System.out.println(i);
			}
		}
	}
}