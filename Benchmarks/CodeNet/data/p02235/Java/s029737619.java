import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	static int[][] multi;
	static int[] matR;
	static int[] matC;

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_6_A-in9.txt"));

		int q = scan.nextInt();

		for (int i = 0; i < q; i++) {
			String s1 = scan.next();
			String s2 = scan.next();
			System.out.println(Msubs(s1, s2));
		}

		scan.close();
		System.exit(0);
	}

	private static int Msubs(String s1, String s2) {
		boolean[] x = new boolean['z' - 'a' + 1];
		boolean[] y = new boolean['z' - 'a' + 1];
		Elem(x, s1);
		Elem(y, s2);
		int r = 0;
		for (int i = 0; i < x.length; i++)
			if (x[i] && y[i])
				r++;
		return r;
	}

	private static void Elem(boolean[] e, String s) {
		for (int i = 0; i < s.length(); i++)
			e[s.charAt(i) - 'a'] = true;
	}
}