import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			List<Integer> list = IntStream.range(0, 5).map(i -> {
				int number = scanner.nextInt();
				scanner.nextLine();
				return number;
			}).sorted().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
			int k = scanner.nextInt();
			scanner.nextLine();
			if ((list.get(list.size() - 1) - list.get(0)) > k) {
				System.out.println(":(");
			} else {
				System.out.println("Yay!");
			}
		}
	}
}
