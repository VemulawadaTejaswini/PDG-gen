import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();
			List<Integer> integers = new ArrayList<Integer>();
			for (int i = 0; i < N; i++) {
				integers.add(scanner.nextInt());
			}
			// reverse sort
			Collections.sort(integers, Comparator.reverseOrder());

			int alice = 0;
			int bob = 0;
			for (int i = 0; i < integers.size(); i++) {
				if (i % 2 == 0) {
					alice += Integer.valueOf(integers.get(i));
				} else {
					bob += Integer.valueOf(integers.get(i));
				}
			}
			System.out.println(alice - bob);
		}
	}
}