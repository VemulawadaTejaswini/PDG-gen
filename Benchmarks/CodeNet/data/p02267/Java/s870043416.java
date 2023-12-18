import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int firstSize = in.nextInt();
		int[] first = new int[firstSize];
		for (int i = 0; i < firstSize; i++) {
			first[i] = in.nextInt();
		}

		int secondSize = in.nextInt();
		int count = 0;
		for (int i = 0; i < secondSize; i++) {
			count += contains(in.nextInt(), first);
		}
		System.out.println(count);
	}

	/**
	 * returns 1 if the given element is in the given list and zero otherwise
	 */
	public static int contains(int ele, int[] nums) {
		for (Integer i : nums) {
			if (i == ele) {
				return 1;
			}
		}

		return 0;
	}

}
