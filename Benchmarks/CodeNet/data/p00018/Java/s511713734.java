import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		List<String> l = Arrays.asList(a.split(" "));
		Collections.sort(l);
		for (int i = l.size() - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.print(l.get(i));
			} else {
				System.out.print(l.get(i) + " ");
			}

		}
	}
}