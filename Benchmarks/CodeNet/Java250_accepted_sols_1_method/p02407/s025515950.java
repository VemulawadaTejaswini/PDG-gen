import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] nums = new int[count];

		for(int i = 0; i < count;i++) {
			nums[i] = sc.nextInt();

		}

		for(int i = count - 1;i >= 0 ;i--) {
			System.out.print(nums[i]);
			if(i != 0 ) {
				System.out.print(" ");
			}
		}
		System.out.println();

	}
}