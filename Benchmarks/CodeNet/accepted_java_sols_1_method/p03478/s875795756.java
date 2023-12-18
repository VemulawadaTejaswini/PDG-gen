
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt()
				,b = scanner.nextInt()
				,c = scanner.nextInt();
		
		int ans = 0;
		for (int i = 0; i <= a; i++) {
			int total =0;
			char[] nums = String.valueOf(i).toCharArray();
			for (int j = 0; j < nums.length; j++) {
				String s = String.valueOf(nums[j]);
				total += Integer.parseInt(s);
			}
			if (total>=b && total<= c) {
				ans += i;
			}
		}
		
		
		System.out.println(ans);
		
		scanner.close();
	}
}
