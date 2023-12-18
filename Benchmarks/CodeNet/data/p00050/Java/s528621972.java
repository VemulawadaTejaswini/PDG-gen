
import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			String line = sc.nextLine();
			line = line.replaceAll("apple", "りんご");
			line = line.replaceAll("peach", "apple");
			line = line.replaceAll("りんご", "peach");
			System.out.println(line);
		}
	}
}