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
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\0531-input.txt"));

		while (scan.hasNext()) {

			int n = 3;
			for (int i = 0; i < n; i++) {
				int h = scan.nextInt();
				int m = scan.nextInt();
				int s = scan.nextInt();
				int eh = scan.nextInt();
				int em = scan.nextInt();
				int es = scan.nextInt();

				run(h, m, s, eh, em, es);
			}
			scan.close();
			System.exit(0);
		}
	}

	private static void run(int h, int m, int s, int eh, int em, int es) {
		int w = (((eh * 60) + em) * 60 + es) - (((h * 60) + m) * 60 + s);
		System.out.println(w / 3600 + " " + w % 3600 / 60 + " " + w % 60);
	}

}