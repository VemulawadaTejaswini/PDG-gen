import java.util.*;

public class Main{
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
  	int n = scanner.nextInt();
  	long[] nums = new long[n];
  	for(int i = 0;i < n;i++){
      nums[i] = scanner.nextLong();
    }
  	if(n == 1){
      System.out.println(0);
      return;
    }
  	int l = 0;
  	int r = 1;
  	long sum = 0;
  	while(r < n){
      if(nums[l] > nums[r]){
         sum += Math.abs(nums[l] - nums[r]);
        nums[r] = nums[l];
      }
      l++;
      r++;
    }
      System.out.println(sum);
}
}