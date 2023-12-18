

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int bigger, smaller;
		if (num1 > num2) {
			bigger = num1;
			smaller = num2;
		}
		else {
			bigger = num2;
			smaller = num1;
		}
		int GCD = 0;
		for (int i = 1; i < smaller+1; i++) {
			if ((bigger % i == 0) && (smaller % i == 0)) {
				if (i > GCD) GCD = i;
			}
		}
		System.out.println(GCD);
	}
	
}

