import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
		int k = scan.nextInt();
		long[] nums = new long[n];
		
		for (int i = 0; i < n; i++) {
			nums[i] = scan.nextInt();
		}
		
		Arrays.sort(nums);
		long sum = 0;
		for (int i = 0; i < nums.length - k; i++) {
			sum+= nums[i];
		}
		
		System.out.println(sum);

	}
}