package step1;

import java.util.Scanner;

public class main {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int height = scanner.nextInt();
		int round = 2*height + 2*length;
		int area = length * height;

		System.out.println(area + " " + round);
	}
}

