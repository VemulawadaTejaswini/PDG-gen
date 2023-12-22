import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int amount = s.nextInt();
		int[] nums = new int[amount];
		int total = 0;
		for(int i = 0; i < amount; i++) {
			nums[i] = s.nextInt();
		}
		for(int i = 0; i < amount; i++) {
			for(int j = 1+i; j < amount; j++) {
				total += nums[i] * nums[j];
			}
		}
		System.out.println(total);
	}
}
