import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n < 3) {
			System.out.println(0);
			return;
		}
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		int ans = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (nums[i] != nums[j] && nums[j] != nums[k] && nums[i] != nums[k]) {
						if (nums[i] + nums[j] > nums[k]) {
							ans++;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}
























