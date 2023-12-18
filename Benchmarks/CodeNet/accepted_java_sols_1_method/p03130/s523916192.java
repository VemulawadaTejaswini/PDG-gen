import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a1 = Integer.parseInt(sc.next()) - 1;
		int b1 = Integer.parseInt(sc.next()) - 1;
		int a2 = Integer.parseInt(sc.next()) - 1;
		int b2 = Integer.parseInt(sc.next()) - 1;
		int a3 = Integer.parseInt(sc.next()) - 1;
		int b3 = Integer.parseInt(sc.next()) - 1;

		int[] nums = new int[4];
		nums[a1]++;
		nums[b1]++;
		nums[a2]++;
		nums[b2]++;
		nums[a3]++;
		nums[b3]++;

		String answer = "YES";
		if (nums[0] != 1 && nums[0] != 2) {
			answer = "NO";
		}
		if (nums[1] != 1 && nums[1] != 2) {
			answer = "NO";
		}
		if (nums[2] != 1 && nums[2] != 2) {
			answer = "NO";
		}
		if (nums[3] != 1 && nums[3] != 2) {
			answer = "NO";
		}
		System.out.println(answer);
	}
}
