import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String num = String.valueOf(n);
		char[] nums = num.toCharArray();
		int sum = 0;
		for(int i=0; i<nums.length; i++) {
			sum += Character.getNumericValue(nums[i]);
		}
		if(n%sum == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
