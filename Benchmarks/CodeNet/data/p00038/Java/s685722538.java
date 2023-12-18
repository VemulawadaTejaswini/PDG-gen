import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void run() {

		for (; sc.hasNextLine();) {

			String buffer = sc.nextLine();

			Scanner l = new Scanner(buffer.replace(',', ' '));

			int[] cards = new int[15];

			for (int i = 0; i < 5; i++) {

				int a = l.nextInt();

				cards[a]++;

				if(a==1) cards[14]++;

			}

//			System.out.println(Arrays.toString(cards));

			int count = 0;

			int max = 0;

			int sub = 0;

			boolean str = false;

			for (int i = 1; i < 15; i++) {

				if (cards[i] == 1) {

					count++;

				}else{

					count=0;

				}

				if (count == 5) {

					str = true;

					break;

				}

				if(i==14) break;

				if (cards[i] > max) {

					max = cards[i];

				} else if (cards[i] > sub) {

					sub = cards[i];

				}

			}

			if (str) {

				System.out.println("straight");

			} else {

				if (max == 4) {

					System.out.println("four card");

				} else if (max == 3) {

					if (sub == 2) {

						System.out.println("full house");

					} else {

						System.out.println("three card");

					}

				} else if (max == 2) {

					if (sub == 2) {

						System.out.println("two pair");

					} else {

						System.out.println("one pair");

					}

				} else {

					System.out.println("null");

				}

			}

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();



	}

}