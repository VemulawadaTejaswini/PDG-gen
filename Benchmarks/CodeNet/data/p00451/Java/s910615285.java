import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new File("c:\\0526-input.txt"));

		while (scan.hasNext()) {
			String a = scan.next();
			String b = scan.next();
			System.out.println(run(a, b));
		}
		scan.close();
		System.exit(0);
	}

	private static int run(String a, String b) {

		if (a.length() > b.length())
			return len(a, b);
		else
			return len(b, a);
	}

	private static int len(String a, String b) {
		int max = 0;

		for (int i = 0; i <= a.length() - b.length(); i++) {
			int c = 0;
			for (int j = i, k = 0; k < b.length(); j++, k++)
				if (a.charAt(j) == b.charAt(k))
					c++;
				else {
					if (c > max)
						max = c;
					c = 0;
				}
			if (c > max)
				max = c;
		}
		return max;
	}
}