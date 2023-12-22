import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		Set<String> items = new HashSet<String>();

		for (int i = 0; i <= N; i++) {
			items.add(scanner.nextLine());
		}

		scanner.close();

		items.removeIf(s -> s.equals(""));

		System.out.println(items.size());
	}

}
