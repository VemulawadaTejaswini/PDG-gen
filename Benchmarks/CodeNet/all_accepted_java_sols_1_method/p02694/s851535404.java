

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long count = 0;
		long h = 100L;

		while(h < x) {
			h = (long)Math.floor(h * 1.01);
			count++;
		}

		System.out.println(count);

		sc.close();




	}
}
