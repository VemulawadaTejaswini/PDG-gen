import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	boolean isLeap(int y) {

		if (y % 400 == 0)

			return true;

		if (y % 100 == 0)

			return false;

		if (y % 4 == 0)

			return true;

		return false;

	}



	void run() {

		boolean first = true;

		for (;;) {

			int start = sc.nextInt();

			int end = sc.nextInt();

			if ((start | end) == 0)

				break;

			if (!first) {

				System.out.println();

			}

			first = false;

			int count = 0;

			for (int i = start; i <= end; i++) {

				if (isLeap(i)) {

					System.out.println(i);

					count++;

				}

			}

			if (count == 0)

				System.out.println("NA");

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}