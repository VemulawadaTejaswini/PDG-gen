import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	static private List<Character> list = Arrays.asList('A', 'C', 'G', 'T');

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String s = scanner.nextLine();
			int current = 0;
			int max = 0;
			for (char a : s.toCharArray()) {
				if (list.contains(a)) {
					current++;
				} else {
					if (current > max) {
						max = current;
					}
					current = 0;
				}
			}
			if (current > max) {
				max = current;
			}
			System.out.println(max);
		}
	}
}
