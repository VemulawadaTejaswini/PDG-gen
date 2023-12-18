import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new File("c:\\0509-input.txt"));

		while (true) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			run(n, n, "");
		}

		scan.close();
		System.exit(0);
	}

	private static void run(int n, int max, String s) {
		// System.out.println(n + " " + max + " " + s);
		if (n == 0) {
			System.out.println(s);
			return;
		}
		for (int i = Math.min(n, max); i > 0; i--) {
			if (s.length() == 0) {
				String ss = s.concat(String.valueOf(i));
				run(n - i, i, ss);
			} else {
				String ss = s.concat(" ").concat(String.valueOf(i));
				run(n - i, i, ss);
			}
		}
	}
}