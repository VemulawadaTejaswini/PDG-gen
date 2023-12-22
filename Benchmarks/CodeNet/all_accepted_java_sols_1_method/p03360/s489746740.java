import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			list.add(sc.nextInt());
		}

		final int k = sc.nextInt();

		for (int j = 0; j < k; j++) {
			final int max = Collections.max(list);
			final int maxIndex = list.indexOf(max);
			final int mul = max * 2;
			list.set(maxIndex, mul);
		}

		int result = 0;
		for (final int item : list) {
			result = result + item;
		}

		System.out.println(result);

	}

}
