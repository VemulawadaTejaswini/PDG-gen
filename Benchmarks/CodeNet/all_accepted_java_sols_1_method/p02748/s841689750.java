

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int m = scan.nextInt();

		int[] refrigerator = new int[a];
		int[] microwave = new int[b];
		int[] refriNum = new int[m];
		int[] microNum = new int[m];
		int[] discount = new int[m];

		int anser = 1000000;

		for (int i = 0; i < a; i++) {
			refrigerator[i] = scan.nextInt();
		}
		for (int i = 0; i < b; i++) {
			microwave[i] = scan.nextInt();
		}
		for (int i = 0; i < m; i++) {
			refriNum[i] = scan.nextInt();
			microNum[i] = scan.nextInt();
			discount[i] = scan.nextInt();
		}

		//割引後の価格を求める
		for (int i = 0; i < m; i++) {
			int price = refrigerator[refriNum[i] - 1] + microwave[microNum[i] - 1] - discount[i];
			if (anser > price) {
				anser = price;
			}
		}

		Arrays.sort(refrigerator);
		Arrays.sort(microwave);

		if (anser > refrigerator[0] + microwave[0]) {
			anser = refrigerator[0] + microwave[0];
		}

		System.out.println(anser);

	}

}
