

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int hour = A + B;

		if(hour >= 24)hour -= 24;

		System.out.println(hour);

		sc.close();
	}

}
