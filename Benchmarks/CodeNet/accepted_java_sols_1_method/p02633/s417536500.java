

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int count = 0;
		int xc = 0;
		while (true) {
			count++;
			xc += x;
			if (xc % 360 == 0)
				break;
		}

		System.out.println(count);

	}

}
