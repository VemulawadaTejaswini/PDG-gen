import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			char[] nums = sc.next().toCharArray();
			int sum = 0;

			int length = nums.length;
			for (int i = 0; i <length; i++) {
				sum += nums[i] - '0';
			}

			String ans = "No";
			if (sum % 9 == 0) {
				ans = "Yes";
			}

			System.out.println(ans);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
