import java.util.*;

public class Main{
	public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int[] nums = new int[n];
      int cnt = 0;
      for( int i = 0 ; i < n ; i++ ){
        nums[i] = scan.nextInt();
      }
      for( int i = 1 ; i < n-1 ; i++ ){
        if(
          (nums[i] != Math.max(nums[i],nums[i+1])) && 
          (nums[i] != Math.min(nums[i-1],nums[i])) ||
          (nums[i] != Math.max(nums[i-1],nums[i])) && 
          (nums[i] != Math.min(nums[i],nums[i+1]))     ) cnt++ ;
      }
      System.out.println(cnt);
    }
}