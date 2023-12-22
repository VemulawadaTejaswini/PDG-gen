import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		
		int[] nums = new int[5];
		for(int i = 0; i < 5; i++){
			nums[i] = scan.nextInt();
		}

		for(int i = 0; i < 5 - 1; i++){
			for(int j = 5 - 1; j > i; j--){
				if(nums[i] < nums[j]){
					int big = nums[j];
					nums[j] = nums[i];
					nums[i] = big;
				}
			}
		}
		System.out.printf("%d %d %d %d %d\n", nums[0], nums[1], nums[2],
							nums[3], nums[4]);
	}
}