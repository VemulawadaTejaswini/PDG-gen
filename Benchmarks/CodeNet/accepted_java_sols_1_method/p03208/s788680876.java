import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i+k<=nums.length; i++) {
			min = Math.min(min, nums[i+k-1]-nums[i]);
		}
		System.out.println(min);
	}
}
