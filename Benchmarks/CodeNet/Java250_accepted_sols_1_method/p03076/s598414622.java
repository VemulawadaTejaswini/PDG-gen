//package abc124.B;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0, diff = 0;
		
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			sum += (n + 10 - 1) / 10 * 10;
			if (n % 10 != 0) diff = Math.max(diff, 10 - n % 10);
		}
		
		System.out.println(sum - diff);
		
	}

}
