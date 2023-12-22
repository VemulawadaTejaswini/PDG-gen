

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long h = sc.nextLong();

		long count = 0;

		while (h > 1) {
			h = h / 2;
			count++;
		}

		System.out.println((long) (Math.pow(2, count + 1)) - 1);

	}

}
