

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int pattern = 0;
		for(int i = 0; i < A + 1; i++) {
			int sumi = 500 * i;
			if(!(sumi > X)) {
				for(int j = 0; j < B + 1; j++) {
					int sumj = sumi + 100 * j;
					if(!(sumj > X)) {
						if(!((X - sumj) / 50 > C)) {
							pattern++;
						}
					} else {
						break;
					}
				}
			} else {
				break;
			}
		}
		System.out.println(pattern);
	}

}
