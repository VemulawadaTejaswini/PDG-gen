import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();

		long total = 0;

		for (int i = 0; i < number; i++) {
			list.add(scanner.nextInt());
		}

		// ????????§???????????????
		Collections.sort(list);
		System.out.print(list.get(0) + " ");

		System.out.print(list.get(list.size() - 1) + " ");

		for (int i = 0; i < list.size(); i++) {
			total += list.get(i);
		}

		System.out.println(total);
	}
}