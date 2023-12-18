import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] value = new int[n];
		int[] cost = new int[n];
		
		for(int i=0; i<n; i++) {
			value[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			cost[i] = sc.nextInt();
		}
		
		int[] nums = new int[n];
		
		for(int i=0; i<n; i++) {
			nums[i] = value[i] - cost[i];
		}
		
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			if(nums[i] > 0) {
				sum += nums[i];
			}
		}
		
		System.out.println(sum);
		
	}
}
