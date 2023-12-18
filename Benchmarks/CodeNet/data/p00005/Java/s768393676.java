import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int newA = a;
		int newB = b;
		int gcd = 0;
		int lcm = 0;
		if(a > b) {

			int r = 0;

			while((r = a % b) != 0) {

				a = b;
				b = r;

			}

			gcd = b;
			System.out.print(gcd);


		} else if( b > a) {

			int r = 0;

			while((r = b % a) != 0) {

				b = a;
				a = r;

			}
			gcd = a;
			System.out.print(gcd);
		} else {

			gcd = a;
			System.out.print(a);

		}

		lcm = (newA * newB) / gcd;
		System.out.println(", " + lcm);


	}

}