import java.util.Scanner;
import java.lang.Math;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int k = stdIn.nextInt();
		if (k % 2 == 0) {
			for (int i = 0; i < k / 2; i++) {
				if (a % 2 == 1)
					a = a - 1;
				a = a / 2;
				b = b + a;
				if (b % 2 == 1)
					b = b - 1;
				b = b / 2;
				a = a + b;
			}
		}
		else {
			for (int i = 0; i < k / 2; i++) {
				if (a % 2 == 1) 
					a = a - 1;
				a = a / 2;
				b = b + a;
				if (b % 2 == 1)
					b = b - 1;
				b = b / 2;
				a = a + b;
			}
			if (a % 2 == 1) 
					a = a - 1;
				a = a / 2;
				b = b + a;
		}

		System.out.println(a);
		System.out.println(b);
	}
}