import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String[] tokens = in.nextLine().split(" ");
		List<Integer> nums = new ArrayList<>(n);
		for (int i = 0; i < n; ++i) {
			nums.add(Integer.parseInt(tokens[i]));
		}
		Collections.sort(nums);
		System.out.println(Math.abs(nums.get(nums.size() - 1) - nums.get(0)));

		in.close();
	}

}
