import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<String> dictionary = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String command = sc.next();
			String word = sc.next();

			if (command.equals("insert")) {
				dictionary.add(word);
			} else if (command.equals("find")) {
				if (dictionary.contains(word)) {
					sb.append("yes\n");
				} else {
					sb.append("no\n");
				}
			}
		}
		sc.close();
		System.out.print(sb.toString());
	}
}