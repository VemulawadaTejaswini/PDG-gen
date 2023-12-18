import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] nums = new int[len];
		
		for(int i = 0; i < len; i++){
			nums[len - (i + 1)] = sc.nextInt();
		}
		
		for(int i = 0; i < len; i++){
			System.out.print(nums[i] + " ");
		}

		System.out.println();
	}
}