import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] nums = new int[n];
		int min = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
			min = Math.min(min, Math.abs(x-nums[i]));
			
		}
		Arrays.sort(nums);
		
		for(int i=0; i<n; i++) {
			if(Math.abs(x-nums[i])%min == 0) {
				continue;
			}else {
				min--;
				i = 0;
			}
		}
		System.out.println(min);
	}
}
