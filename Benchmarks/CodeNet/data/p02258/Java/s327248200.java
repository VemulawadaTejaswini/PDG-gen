import java.util.Scanner;

public class Main {
	public static int algoOne(int[] nums) {
		int maxProfit = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[j] - nums[i] > maxProfit) {
					maxProfit = nums[j] - nums[i];
				}
			}
		}
		return maxProfit;
	}
	
	public static int algoTwo(int[] nums) {
		int maxProfit = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] - minValue > maxProfit) maxProfit = nums[i] - minValue;
			
			if (nums[i] < minValue) minValue = nums[i];
		}
		
		return maxProfit;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numNums = scanner.nextInt();
		int[] nums = new int[numNums];
		
		//read numbers
		for (int i = 0; i < numNums; i++) {
			nums[i] = scanner.nextInt();
		}
		
		//run algorithm here
		System.out.println(algoTwo(nums));
		
		scanner.close();
	}
}
