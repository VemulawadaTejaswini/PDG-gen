import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		Set<Integer> set = new HashSet<>();

		set.add(a);
		set.add(b);
		set.add(c);

		System.out.println(set.size());

	}
}