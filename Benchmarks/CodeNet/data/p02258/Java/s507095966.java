import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int  n  = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<nums.length;i++){
			nums[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		int min = nums[0];
		for(int i=1;i<nums.length;i++){
			max = Math.max(max, nums[i]-min);
			min = Math.min(min, nums[i]);
		}
		System.out.println(max);
	}
}