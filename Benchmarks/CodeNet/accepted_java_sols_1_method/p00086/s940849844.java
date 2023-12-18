import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int[] nums = new int[101];
			int max = 2;
			while (nums[0] != 2) {
				int num = in.nextInt();
				nums[num] += 1;
				max = Math.max(max, num);
			}
			String s = "NG";
			if (nums[1] % 2 == 1 && nums[2] % 2 == 1) {
				s = "OK";
				for (int i = 3; i <= max; i++) {
					if (nums[i] != 0 && nums[i] % 2 == 1) {
						s = "NG";
						break;
					}
				}
			}
			System.out.println(s);
		}
	}
}