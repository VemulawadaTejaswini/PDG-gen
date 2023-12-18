import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 1;
		long[] nums = new long[1001];
		for (int i = 2; i <= n; i++) {
			int tmp = i;
			for(int j=2; j<=tmp; j++) {
				while(tmp%j == 0) {
					nums[j]++;
					tmp = tmp/j;
				}
			}
		}
		for(int i=0; i<nums.length; i++) {
			ans *= (nums[i] + 1);
			ans %= 1000000007; 
		}
		System.out.println(ans);
	}
}
