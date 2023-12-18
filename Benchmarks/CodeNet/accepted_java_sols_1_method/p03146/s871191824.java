import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int[] nums = new int[1000000];
		
		nums[0] = s;
		
		for(int i=1; i<nums.length; i++) {
			if(nums[i-1]%2==0) {
				nums[i] = nums[i-1]/2;
			}else {
				nums[i] = 3*nums[i-1] + 1;
			}
		}
		for(int i=0; i<nums.length; i++) {
			int tmp = nums[i];
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] == nums[j]) {
					System.out.println(j+1);
					return;
				}
			}
		}
	}
}
