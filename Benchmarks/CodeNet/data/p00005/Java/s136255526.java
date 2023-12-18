import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		

		Scanner stdin = new Scanner(System.in);
		long a = 0;
		long b = 0;
		long ab = 0;
		long r = 0;
		long gcd = 0;
		long lcm = 0;
		long temp = 0;
		while(stdin.hasNext()) {
			a = stdin.nextInt();
			b = stdin.nextInt();
			ab = a * b;

			if(a < b) {
				temp = a;
				a = b;
				b = temp;
			}
			if(a >= b) {
				do {
					r = a % b;
					if(r == 0) {
						break;
					} else {
						a = b;
						b = r;
					}
				}while(r != 1);
				gcd = b;
				lcm = ab / b;
				System.out.println(gcd + " " + lcm);

			}
		}
	}
}