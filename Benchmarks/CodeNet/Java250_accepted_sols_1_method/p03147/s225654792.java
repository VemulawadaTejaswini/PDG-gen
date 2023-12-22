import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] nums = new int[n];
		
		int count = 0;
		
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
			
			if(i==0) {
				count = nums[0];
			}else {
				count += Math.max(0, nums[i]-nums[i-1]);
			}
		}
		System.out.println(count);
	}
}
