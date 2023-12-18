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

		List<Integer> que = new ArrayList<Integer>();

		// while (scan.hasNext()) {
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			String s = scan.next();
			switch (s) {
			case ("insert"):
				que.add(0, scan.nextInt());
				break;
			case ("delete"):
				que.remove((Integer) scan.nextInt());
				break;
			case ("deleteFirst"):
				que.remove(0);
				break;
			case ("deleteLast"):
				que.remove(que.size() - 1);
				break;
			}
		}
		// }

		for (int i = 0; i < que.size(); i++) {
			if (i > 0)
				System.out.print(" ");
			System.out.print(que.get(i));
		}
		System.out.println();

		scan.close();
		System.exit(0);
	}
}