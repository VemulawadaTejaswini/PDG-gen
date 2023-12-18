import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// while (true) {
		// String tmp = scan.nextLine();

		// }
		String tmp = scan.nextLine();
		int r = Integer.parseInt(tmp.split(" ")[0]);
		int c = Integer.parseInt(tmp.split(" ")[1]);
		int[][] nums = new int[r][c];

		for (int i = 0; i < r; i++) {
			String num = scan.nextLine();
			for (int j = 0; j < c; j++) {
				nums[i][j] = Integer.parseInt(num.split(" ")[j]);
			}
		}

		for (int i = 0; i < r; i++) {
			int sum = 0;
			for (int j = 0; j < c; j++) {
				sum += nums[i][j];
				System.out.print(nums[i][j] + " ");
			}
			System.out.println(sum);
		}
		int sumsum = 0;
		for (int i = 0; i < c; i++) {
			int sum = 0;
			for (int j = 0; j < r; j++) {
				sum += nums[j][i];
			}
			sumsum += sum;
			System.out.print(sum + " ");
		}
		System.out.println(sumsum);
	}
}

