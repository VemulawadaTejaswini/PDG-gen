//package aoj0205;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int[] guys = new int[5];
		int tmp = scan.nextInt();

		while (tmp != 0) {
			boolean[] check = new boolean[3];
			guys[0] = tmp;
			check[tmp-1] = true;
			for (int i = 1; i < 5; i++) {
				guys[i] = scan.nextInt();
				check[guys[i]-1] = true;
			}
			int fl = 0;
			for (int i = 0; i < 3; i++) {
				if (check[i]) {
					fl++;
				}
			}
			if (fl == 1 || fl == 3) {
				for (int i = 0; i < 5; i++) {
					System.out.println(3);
				}
			} else {
				if (!check[0]) {
					for (int i = 0; i < 5; i++) {
						if (guys[i] == 2) {
							System.out.println(1);
						} else {
							System.out.println(2);
						}
					}
				} else if (!check[1]) {
					for (int i = 0; i < 5; i++) {
						if (guys[i] == 3) {
							System.out.println(1);
						} else {
							System.out.println(2);
						}
					}					
				} else if (!check[2]) {
					for (int i = 0; i < 5; i++) {
						if (guys[i] == 1) {
							System.out.println(1);
						} else {
							System.out.println(2);
						}
					}
				}
			}	
			tmp = scan.nextInt();
		}
	}
}