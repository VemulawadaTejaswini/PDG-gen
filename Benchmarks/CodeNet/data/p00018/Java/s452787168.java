import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Integer[] nums = new Integer[5];

			for (int i = 0; i < 5; i++) {
				nums[i] = sc.nextInt();
			}

			Arrays.sort(nums, Comparator.reverseOrder());

			for (int i = 0; i < 5; i++) {
				String sp = (i < 4) ? " " : "\n";
				System.out.print(nums[i] + sp);
			}


	}

}
