import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		String w = in.nextLine();
		int count = 0;
		while (true) {
			String line = in.nextLine();
			if ("END_OF_TEXT".equals(line)) {
				break;
			}
			for (String word : line.split(" ")) {
				if (w.equals(word)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}