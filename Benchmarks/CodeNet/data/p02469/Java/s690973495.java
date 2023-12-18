import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i < n; i++){
			nums[i] = sc.nextInt();
		}
		sc.close();
		int ans = nums[0];
		for(int i = 1; i < n; i++){
			int gcd = computeGCD(ans, nums[i]);
			ans = ans * nums[i] / gcd;
		}
		System.out.println(ans);
	}
	
	private static int computeGCD(int a, int b){
		int big = Math.max(a, b);
		int small = Math.min(a, b);
		int remainder = big % small;
		if(remainder == 0){
			return small;
		}else{
			return computeGCD(small, remainder);
		}
	}

}