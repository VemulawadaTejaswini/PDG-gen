
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int j = nums[0];
		for (int i = 0; i <= nums[0]; i++) {
			if (2 * i + 4 * j == nums[1]) {
				System.out.println("Yes");
				break;
			}
			j--;
			if (i == nums[0]) {
				System.out.println("No");
			}
		}
	}




}
