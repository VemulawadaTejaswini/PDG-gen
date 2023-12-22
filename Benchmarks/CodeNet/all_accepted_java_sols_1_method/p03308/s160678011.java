import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] nums = new int[N];
		for(int a = 0 ; a < N ; a++){
			nums[a] = sc.nextInt();
		}
		sc.close();
		int ans = 0;
		Arrays.sort(nums);
		ans = Math.abs(nums[nums.length-1])-Math.abs(nums[0]);
		System.out.println(ans);
	}
}