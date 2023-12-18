import java.io.File;
import java.io.FileNotFoundException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\2010-input.txt"));

		while (scan.hasNext()) {

			String s = scan.next();
			Do(s);
		}
		System.out.println(stk[0]);

		scan.close();
		System.exit(0);
	}

	static int[] stk = new int[101];
	static int pt = -1;

	private static void Do(String s) {
		switch (s) {
		case ("+"):
			stk[pt - 1] += stk[pt];
			pt--;
			break;
		case ("-"):
			stk[pt - 1] -= stk[pt];
			pt--;
			break;
		case ("*"):
			stk[pt - 1] *= stk[pt];
			pt--;
			break;
		default:
			pt++;
			stk[pt] = Integer.valueOf(s);
		}

	}

}