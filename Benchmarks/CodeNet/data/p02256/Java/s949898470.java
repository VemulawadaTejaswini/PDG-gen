import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String orig = sc.nextLine();
		sc.close();
		String[] arr = orig.split(" ", 2);
		int[] nums = new int[2];
		for (int i = 0; i < arr.length; i++)
			nums[i] = Integer.parseInt(arr[i]);
		if (nums[0] == nums[1]) {
			System.out.println(nums[0]);
		}
		else if (nums[0] > nums[1]) {
			System.out.println(gcd(nums[1], nums[0] % nums[1]));
		}
		else {
			System.out.println(gcd(nums[0], nums[1] % nums[0]));
		}
	}
	
	public static int gcd(int x, int y) {
		int n = 1;
		for(int i = 1; i <= x && i <= y; i++) {
			if(x % i == 0 && y % i == 0) n = i;
		}
		return n;
	}
}
