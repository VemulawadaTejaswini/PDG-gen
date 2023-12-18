import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data1 = scanner.nextLine();
			String data2 = scanner.nextLine();

			int N = Integer.parseInt(data1);

			String[] arr = data2.split(" ");
			List<Integer> list = new ArrayList<Integer>();
			for (String s : arr) {
				list.add(Integer.parseInt(s));
			}

			int count = 0;
			for (int i = 0; i < list.size(); i++) {
				if (i % 2 == 0) {
					continue;
				}
				int n = list.get(i);
				if (n % 2 != 0) {
					count++;
				}
			}

			System.out.println(count);
		}
	}
}