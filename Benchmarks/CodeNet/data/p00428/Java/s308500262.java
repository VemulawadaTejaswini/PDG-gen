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
			int m = scan.nextInt();
			if (n == 0)
				break;

			int[] bx = new int[m];

			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++) {
					int x = scan.nextInt();
					if (x == 1)
						bx[j]++;
				}

			for (int i = 0; i < m; i++) {
				int result = 0, max = -1;
				for (int j = 0; j < m; j++)
					if (bx[j] > max) {
						max = bx[j];
						result = j;
					}
				bx[result] = -1;
				if (i > 0)
					System.out.print(" ");
				System.out.print(result + 1);
			}
			System.out.println();
		}

		scan.close();
		System.exit(0);
	}

	private static void run(int n, String s) {
		if (n == 0) {
			System.out.println(s);
			return;
		}

		StringBuilder ss = new StringBuilder("");

		for (int i = 0; i < s.length(); i++) {
			int repeat = 1;
			for (int j = i + 1; j < s.length(); j++)
				if (s.charAt(i) == s.charAt(j)) {
					repeat++;
					i++;
				} else
					break;
			ss.append(String.valueOf(repeat));
			ss.append(String.valueOf(s.charAt(i)));
		}

		run(n - 1, ss.toString());
	}

}