import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 標準入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nums = br.readLine().split(" ");
		int a = Integer.parseInt(nums[0]);
		int b = Integer.parseInt(nums[1]);
		int c = Integer.parseInt(nums[2]);
		int d = Integer.parseInt(nums[3]);

		if (Math.abs(a - c) <= d) {
			System.out.println("Yes");
		} else if (Math.abs(a - b) <= d && Math.abs(b - c) <= d) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
