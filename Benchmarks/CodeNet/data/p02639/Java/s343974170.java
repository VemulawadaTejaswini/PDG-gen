import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				System.out.println(i + 1);
				break;
			}
		}
	}




}
