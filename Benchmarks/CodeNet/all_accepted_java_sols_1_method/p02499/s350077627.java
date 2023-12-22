import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);

		int count[] = new int[500];
		for (int i = 0; i < 500; i++) {
			count[i] = 0;
		}
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			line = line.toLowerCase();

			if (line.length() >= 1200) {
				return;
			}

			for (char c = 'a'; c <= 'z'; c++) {
				for (int i = 0; i < line.length(); i++) {
					if (line.charAt(i) == c) {
						count[c]++;
					}
				}
			}
		}
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.println(c + " : " + count[c]);
		}
	}
}