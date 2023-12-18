import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < 5; i++) {
				list.add(scanner.nextInt());
				scanner.nextLine();
			}
			int k = scanner.nextInt();
			scanner.nextLine();
			list.sort((x, y) -> x - y);
			if ((list.get(list.size() - 1) - list.get(0)) > k) {
				System.out.println(":(");
			} else {
				System.out.println("Yay!");
			}
		}
	}
}