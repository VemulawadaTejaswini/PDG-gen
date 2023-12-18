import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main{

	/**
	 * List of Top 3 Hills
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> hillList = new ArrayList<Integer>();

		while (scanner.hasNextInt()) {
			hillList.add(scanner.nextInt());
		}

		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		};
		Collections.sort(hillList, comparator);

		System.out.println(hillList.get(0));
		System.out.println(hillList.get(1));
		System.out.println(hillList.get(2));
	}
}