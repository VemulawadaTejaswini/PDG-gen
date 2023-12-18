import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
      	int n = scn.nextInt();

      	int[] nums = new int[n];
      	for(int i = 0; i < n; i++){
          nums[i] = scn.nextInt();
        }
      	int[] ans = nums.clone();
      	Arrays.sort(nums);
      
      	for(int j = 0; j < n-1; j++){
          if(nums[j] == nums[j+1]){
          	ans[j] = -1;
          }
          for(int k = j+1; k<n;k++){
            if(nums[k] != -1){
            	if(nums[k] % nums[j] == 0){
              		ans[k] = -1;
            	}
            }
          }
        }
      	System.out.println(Arrays.stream(ans).filter(a -> a > 0).count());
	}
}