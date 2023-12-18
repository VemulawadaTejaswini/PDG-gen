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

		String s = scan.next();

		boolean start = false;
		int pt = 0;
		int depth = 0;
		int[] xl = new int[10001];
		int[] yl = new int[10001];
		int mid = 0;
		int l = 0;
		int totl = 0;
		int totk = 0;
		for (int x = 0; x < s.length(); x++) {
			if (start) {
				if (s.charAt(x) == '\\') {
					l += (1 + depth);
					depth += 2;
				} else if (s.charAt(x) == '_') {
					l += depth;
				} else if (s.charAt(x) == '/') {
					depth -= 2;
					l += (1 + depth);
					if (depth == 0) {
						start = false;
						xl[pt] = l;
						totl += l;
						totk++;
						mid = x;
						pt++;
					}
				}
			} else if (s.charAt(x) == '\\') {
				start = true;
				l = 1;
				depth = 2;
			}
		}

		pt = 0;
		start = false;
		for (int x = s.length() - 1; x >= mid; x--) {
			if (start) {
				if (s.charAt(x) == '/') {
					l += (1 + depth);
					depth += 2;
				} else if (s.charAt(x) == '_') {
					l += depth;
				} else if (s.charAt(x) == '\\') {
					depth -= 2;
					l += (1 + depth);
					if (depth == 0) {
						start = false;
						yl[pt] = l;
						totl += l;
						totk++;
						pt++;
					}
				}
			} else if (s.charAt(x) == '/') {
				start = true;
				l = 1;
				depth = 2;
			}
		}

		System.out.println(totl / 2);
		System.out.print(totk);
		for (int i = 0; xl[i] > 0; i++)
			System.out.print(" " + xl[i] / 2);
		int j;
		for (j = 0; yl[j] > 0; j++)
			;
		for (int i = j - 1; i >= 0; i--)
			System.out.print(" " + yl[i] / 2);
		System.out.println();
		
		scan.close();
		System.exit(0);
	}
}