import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums = new int[n];
		int ans=0;

		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}

		for(int i=0;i<n-2;i++) {
			if(nums[i]<nums[i+1] && nums[i+1]<nums[i+2] || nums[i+2]<nums[i+1] && nums[i+1]<nums[i]) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}