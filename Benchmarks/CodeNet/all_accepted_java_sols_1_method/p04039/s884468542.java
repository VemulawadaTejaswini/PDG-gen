/* Filename: ARC058C.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt(), D = input.nextInt();
			boolean[] hate = new boolean[10];

			for (int i = 0; i < D; ++i) {
				hate[input.nextInt()] = true;
			}

			int pay = N;
			while (true) {
				int tmp = pay;
				while (tmp > 0 && hate[tmp % 10] == false) {
					tmp /= 10;
				}
				if (tmp == 0) {
					break;
				} else {
					++pay;
				}
			}
			
			System.out.println(pay);
		}
	}

}
