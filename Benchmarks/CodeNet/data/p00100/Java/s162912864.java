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

			int[] order = new int[n];

			BigInteger[] map = new BigInteger[4001];

			boolean[] end = new boolean[4001];

			for(int i =0;i<4001;i++){

				map[i] = new BigInteger("0");

			}

			for (int i = 0; i < n; i++) {

				int b = sc.nextInt();

				long at = sc.nextLong();

				long p = sc.nextLong();

				map[b] = map[b].add(BigInteger.valueOf(at * p));

				order[i] = b;

			}



			for (int i = 0; i < n; i++) {

				if (order[i] != 0) {

					int e = order[i];

					if (!end[e]) {

						if (map[e].compareTo(BigInteger.valueOf(1000000))>=0) {

							end[e] = true;

							na = false;

							System.out.println(e);

						}

					}

				}

			}

			if (na)

				System.out.println("NA");

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}