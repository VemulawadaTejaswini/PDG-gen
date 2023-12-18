import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
      	int length = input.nextInt();
      	
      	int[] nums = new int[length];
      
      	for(int i = 0; i < nums.length; i++){
        	nums[i] = input.nextInt();
        }
      
		int[] dp = new int[nums.length];
		dp[1] = Math.abs(nums[0] - nums[1]);
		dp[0] = 0;
		
		for(int i = 2; i < nums.length; i++){
			dp[i] = Math.min(Math.abs(nums[i-1] - nums[i]) + dp[i-1], Math.abs(nums[i-2] - nums[i]) + dp[i-2]);
		}
		
		System.out.println(dp[nums.length -1]);
	}





}
