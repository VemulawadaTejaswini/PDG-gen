
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		if (line[1] == 0) {
			System.out.println(line[0]);
		} else {
			int[] nums = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
			int con = 0;
			boolean isLowerConFlg = false;
			boolean isUpperConFlg = false;
			while (true) {
				isLowerConFlg = false;
				isUpperConFlg = false;

				for (int i = 0; i < nums.length; i++) {
					if (nums[i] == (line[0] - con)) {
						isLowerConFlg = true;
						break;
					}
				}
				if (isLowerConFlg == false) {
					System.out.println(line[0] -con);
					break;
				}
				for (int i = 0; i < nums.length; i++) {
					if (nums[i] == (line[0] + con)) {
						isUpperConFlg = true;
						break;
					}
				}
				if (isUpperConFlg == false) {
					System.out.println(line[0] + con);
					break;
				}
				con++;
			}
		}

	}


}
