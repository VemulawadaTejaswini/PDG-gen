import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_3_C-in10.txt"));
		// while (scan.hasNext()) {

		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scan.nextInt();

		int q = scan.nextInt();
		for (int i = 0; i < q; i++)
			if (isP(a, 0, scan.nextInt()))
				System.out.println("yes");
			else
				System.out.println("no");

		scan.close();
		System.exit(0);
	}

	private static boolean isP(int[] a, int i, int m) {
		if (i == a.length)
			return false;
		
		if (a[i] == m)
			return true;
		else if (a[i] > m)
			return isP(a, i + 1, m);
		else if (isP(a, i + 1, m - a[i]))
			return true;
		else
			return isP(a, i + 1, m);
	}
}