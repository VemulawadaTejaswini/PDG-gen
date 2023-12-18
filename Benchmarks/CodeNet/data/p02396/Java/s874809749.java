import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		print();
	}

	private static void print() throws IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		String line = br.toString();

		String[] nums = line.split(" ", 0);

		int length = nums.length;

		for (int i = 0; i <= length; i++) {
			if (nums[i].equals("0")) {
				break;
			}
			int count = i + 1;
			System.out.println("Case " + count + " : " + nums[i]);

		}

	}

}