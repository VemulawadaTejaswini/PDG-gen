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
		int k = Integer.parseInt(br.readLine());

		int sum = a + b + c;

		int max = 0;
		if (max < a)
			max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;

		System.out.println(sum + max * (int) Math.pow(2, k) - max);

	}

}
