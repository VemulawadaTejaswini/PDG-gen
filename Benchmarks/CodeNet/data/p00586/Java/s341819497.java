package v10.p1000;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a;
		int b;

		String line = null;
		Scanner scan;
		try {
			while ((scan = new Scanner(System.in)) != null) {

				a = Integer.parseInt(scan.next());
				b = Integer.parseInt(scan.next());

				System.out.println(a + b);
			}
		} catch (java.util.NoSuchElementException e) {

		}

	}
}