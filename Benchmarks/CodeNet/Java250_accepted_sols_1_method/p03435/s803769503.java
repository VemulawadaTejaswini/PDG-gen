import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] nums = new int[4][4];
		for (int rIdx = 1; rIdx <= 3; rIdx++) {
			String[] inputs = scanner.nextLine().split(" ");
			for (int cIdx = 1; cIdx <=3; cIdx++) nums[rIdx][cIdx] = Integer.parseInt(inputs[cIdx - 1]);
		}

		boolean isRightInfo = true;
		for (int idx = 2; idx <= 3; idx++) {
			int diff = nums[idx][1] - nums[1][1];
			if (diff != nums[idx][2] - nums[1][2] || diff != nums[idx][3] - nums[1][3]) isRightInfo = false;

			diff = nums[1][idx] - nums[1][1];
			if (diff != nums[2][idx] - nums[2][1] || diff != nums[3][idx] - nums[3][1]) isRightInfo = false;
		}

		if (isRightInfo) System.out.println("Yes");
		else System.out.println("No");
	}
}
