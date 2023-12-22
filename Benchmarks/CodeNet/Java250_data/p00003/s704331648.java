import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class Main {
	public static void main(String[] a) throws IOException {

		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		for (int i = 0; i < times; i++) {
			int aa = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();

			int twoa = aa * aa;
			int twob = b * b;
			int twoc = c * c;
			if (twoa == twoc + twob) {

				System.out.println("YES");
			} else if (twob == twoc + twoa) {
				System.out.println("YES");
			} else if (twoc == twob + twoa) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}