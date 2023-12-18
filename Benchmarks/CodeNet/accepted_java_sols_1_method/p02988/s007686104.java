import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0; i< n; i++) {
			nums[i] = sc.nextInt();
		}
		int cnt =0;
		for(int i = 0; i < nums.length - 2; i++) {
			if(nums[i+1] > nums[i] && nums[i+2] > nums[i+1] ) {
				cnt++;
			}else if(nums[i+1] < nums[i] && nums[i+2] < nums[i+1]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
