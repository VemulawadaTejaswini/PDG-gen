
import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void run() {

		for (;;) {

			int n = sc.nextInt();

			if (n == 0) {

				break;

			}



			int l[] = new int[n];

			for (int i = 0; i < n; i++) {

				l[i] = sc.nextInt();

			}



			int res = 0;

			int rea = 0;

			int rec = 0;

			double max = -Double.MAX_VALUE;

			BigInteger min = null;

			for (int s = 0; s <= 15; s++) {

				for (int a = 0; a <= 15; a++) {

					for (int c = 0; c <= 15; c++) {

						boolean spd = false;

						if(s == 8 && a==7 && c == 14){

					//		spd = true;

						}

						if(s == 1 &&a == 7 &&c==12){

					//		spd = true;

						}



						int hash[] = new int[256];



						int[] r = new int[n + 1];

						r[0] = s;

						for (int i = 0; i < n; i++) {

							if(spd){

								System.out.println((r[i]+l[i])&255);

							}

							hash[(r[i]+l[i])&255 ]++;

							r[i + 1] = (a * r[i] + c) & (255);

						}



						BigInteger bi = BigInteger.ONE;

						for (int i = 0; i < 256; i++) {

							if (hash[i] != 0) {

								bi = bi.multiply(BigInteger.valueOf(hash[i]).pow(hash[i]));

							}

						}

						if(min == null){

							min = bi;

						}

						if(spd){

							System.out.println(bi);

						}

						if(min.compareTo(bi)<0){

							min = bi;

							res = s;

							rea = a;

							rec = c;

						}

					}

				}

			}

			System.out.println(res+" "+rea+" "+rec);

		}



	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}