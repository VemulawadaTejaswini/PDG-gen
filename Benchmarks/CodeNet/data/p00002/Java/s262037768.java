

import java.io.IOException;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextInt()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = a + b;
			int count = 10;
			int result = 0;
			for (int i = 1; i < 7; i++) {
				if ((c - count) < 0) {
					result = i;
					break;
				}
				count = count * 10;
			}
			System.out.println(result);
		}

	}
}