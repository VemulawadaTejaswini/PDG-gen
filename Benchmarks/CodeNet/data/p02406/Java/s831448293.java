

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		int count = 1;

		for (count = 1; count < num; count++) {

			if (count % 3 == 0 && count % 10 != 0) {

				System.out.print(" " + count);

			}else if(count % 10 == 3) {

				System.out.print(" " + count);

			}else if(count % 10 == 0) {

			}
		}
		System.out.println(" " + num);
	}

}