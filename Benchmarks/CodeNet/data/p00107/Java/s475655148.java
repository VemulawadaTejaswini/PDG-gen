import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void run() {

		for(;;){

		int w = sc.nextInt();

		int h = sc.nextInt();

		int d = sc.nextInt();

		if((w|h|d)==0) break;

		int n = sc.nextInt();

		double min1 = Math.min(w, h);

		double min2 = Math.min(d, Math.max(h, w));

		double r2sq = min1 * min1 + min2 * min2;

		for (;n-->0;) {

			int a2 = sc.nextInt() * 2;

			double a2sq = a2 * a2;

			if (r2sq < a2sq) {

				System.out.println("OK");

			} else {

				System.out.println("NA");

			}

		}

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}