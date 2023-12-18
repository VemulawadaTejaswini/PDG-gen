import java.util.Arrays;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String[] checked = new String[s.length()];

		for (int i = 0; i < s.length(); i++) {
			String tar = s.substring(i, i + 1);
			if (Arrays.asList(checked).contains(tar)) {
				System.out.println("no");
				return;
			}
			checked[i] = tar;
		}

		System.out.println("yes");
	}
}