import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long sum = 0;
		int[] nums = new int[a];
		
		for(int i = 0; i < a; i++){
			nums[i] = sc.nextInt();
			sum += nums[i];
		}
		
		int max = nums[0];
		int min = nums[0];
		for (int n : nums) {
			max = Math.max(max,n);
			min = Math.min(min, n);
		}
		
		System.out.println(min + " " + max + " " + sum);
	}

}