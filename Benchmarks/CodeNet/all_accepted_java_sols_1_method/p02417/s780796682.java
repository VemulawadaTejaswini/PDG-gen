
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] list = new int[26];
		while (scanner.hasNext()) {
			String a = scanner.nextLine();
			
			for (int i = 0; i < a.length(); i++) {
				int c = a.toLowerCase().codePointAt(i) - 97;
				if (c >= 0)
					list[c]++;
			}
		}

		for (int i = 0; i < list.length; i++) {
			System.out.println(String.format("%s : %d", (char) (i + 97),
					list[i]));
		}

	}
}