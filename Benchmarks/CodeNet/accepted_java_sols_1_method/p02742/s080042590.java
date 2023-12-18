

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long H = scan.nextLong();
		long W = scan.nextLong();

		if (H == 1 || W == 1) {
			System.out.println(1);
		} else if ((H * W) % 2 == 0) {
			System.out.println(H * W / 2);
		} else {
			System.out.println((H * W / 2) + 1);
		}
	}

}
