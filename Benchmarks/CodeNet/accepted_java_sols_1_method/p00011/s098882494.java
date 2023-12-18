import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int[] nums = new int[w];
		for (int i = 0; i < w; ++i) {
			nums[i] = i + 1;
		}
		int n = sc.nextInt();
		int[][] sw = new int[n][2];
		for (int i = 0; i < n; ++i) {
			String[] str = sc.next().split(",");
			sw[i][0] = Integer.parseInt(str[0]) - 1;
			sw[i][1] = Integer.parseInt(str[1]) - 1;
		}
		for (int i = 0; i < n; ++i) {
			int temp = nums[sw[i][0]];
			nums[sw[i][0]] = nums[sw[i][1]];
			nums[sw[i][1]] = temp;
		}
		for (int i = 0; i < w; ++i) {
			System.out.println(nums[i]);
		}
		sc.close();
	}
}
