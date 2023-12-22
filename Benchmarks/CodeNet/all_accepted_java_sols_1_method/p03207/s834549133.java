import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String value = sc.next();
		Integer N = Integer.valueOf(value);
		int[] nums = new int[N];
		for(int i=0;i<N;i++) nums[i]=Integer.parseInt(sc.next());
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0; i<nums.length; i++) {
			sum += nums[i];
			max = Math.max(max, nums[i]);
		}
		sum -= max/2;
		
		System.out.println(sum);
	}
}
