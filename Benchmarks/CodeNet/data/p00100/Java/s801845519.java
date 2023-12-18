

import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void run() {

		for (;;) {

			int n = sc.nextInt();

			if (n == 0)

				break;

			boolean na = true;

			for (int i = 0; i < n; i++) {

				int b = sc.nextInt();

				int at = sc.nextInt();

				int p = sc.nextInt();

				if (at * p >= 1e6) {

					na = false;

					System.out.println(b);

				}

			}

			if(na) System.out.println("NA");

		}



	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}