import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data1 = scanner.nextLine();
			String data2 = scanner.nextLine();

			String[] arr1 = data1.split(" ");
			String[] arr2 = data2.split(" ");

			int syurui = Integer.parseInt(arr1[0]);
			int sentaku = Integer.parseInt(arr1[1]);

			List<Integer> list = new ArrayList<Integer>();
			for (String str : arr2) {
				list.add(Integer.parseInt(str));
			}

			Collections.sort(list);

			int total = 0;
			for (int i = 0; i < sentaku; i++) {
				total += list.get(i);
			}

			System.out.println(total);
		}
	}
}