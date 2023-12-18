import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner cin = new Scanner(System.in)) {
			final int count = cin.nextInt();

			List<Integer> list = new ArrayList<>(count);
			while (cin.hasNext()) {
				list.add(cin.nextInt());
			}

			Collections.sort(list);

			System.out.println(list.get(count - 1) - list.get(0));
		} finally {
		}
	}

}
