import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int k = scanner.nextInt();
			Set<Integer> set = new TreeSet<>();
			for (int i = a; i < a + k && i <= b; i++) {
				set.add(i);
			}
			for (int i = b; i > b - k && i >= a; i--) {
				set.add(i);
			}
			set.stream().forEach(val -> {
				System.out.println(val);
			});
		}
	}
}
