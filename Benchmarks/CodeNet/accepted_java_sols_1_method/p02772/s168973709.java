import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(scan.nextInt());
		}

		boolean result = list.stream().allMatch(a -> a % 2 == 1 || a % 3 == 0 || a % 5 == 0);
		System.out.println(result ? "APPROVED" : "DENIED");
		scan.close();
	}
}