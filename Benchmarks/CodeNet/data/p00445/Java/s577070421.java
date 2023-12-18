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
		// Scanner scan = new Scanner(new File("c:\\0520-input.txt"));

		while (scan.hasNext()) {
			String s = scan.next();
			System.out.println(countStr("JOI", s));
			System.out.println(countStr("IOI", s));
		}

		scan.close();
		System.exit(0);
	}

	private static int countStr(String w, String s) {
		int r = 0;
		for (int i = 0; i < s.length() - w.length() + 1; i++)
			if (s.substring(i, i + w.length()).equals(w))
				r++;
		return r;
	}

}