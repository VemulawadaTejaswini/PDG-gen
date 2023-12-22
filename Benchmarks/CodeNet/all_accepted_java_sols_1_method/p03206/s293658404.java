

import java.util.Scanner;

public class Main {

	// 後日解説を見てから
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		scan.close();

		System.out.println("Christmas");

		while(N<25) {
			System.out.println(" Eve");
			N++;
		}
	}



}
