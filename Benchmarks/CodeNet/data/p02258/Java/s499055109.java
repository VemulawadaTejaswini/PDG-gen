import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		int[] nums = new int[num];
		for(int i = 0; i < num; i++) {
			nums[i] = in.nextInt();
		}
		int max_profit = Integer.MIN_VALUE;
		int min_current = Integer.MAX_VALUE;
		for(int i = 0; i < num; i++) {
			if(i > 0) max_profit = Math.max(max_profit, nums[i] - min_current);
			if(nums[i] < min_current) min_current = nums[i];
		}
		System.out.println(max_profit);
	}

}
