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
		// File("D:\\UserArea\\J0124567\\Downloads\\0536-input.txt"));

		while (scan.hasNext()) {

			int n = scan.nextInt();
			if (n == 0)
				break;
			int m = scan.nextInt();
			String s = scan.next();

			Str str = new Str(s);

			System.out.println(str.count(n));
		}

		scan.close();
		System.exit(0);
	}
}

class Str {
	String S;

	public Str(String s) {
		S = s;
	}

	public int count(int n) {
		int result = 0;
		int cur = 0;
		int i = 0;
		while (i <= S.length()) {
			if (i < S.length() - 2 && S.charAt(i) == 'I' && S.charAt(i + 1) == 'O' && S.charAt(i + 2) == 'I') {
				cur++;
				i += 2;
				continue;
			}
			if (cur >= n)
				result += (cur - n + 1);
			cur = 0;
			i++;
		}
		return result;
	}

}