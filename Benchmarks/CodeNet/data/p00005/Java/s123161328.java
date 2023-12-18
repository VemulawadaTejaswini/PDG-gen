import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a;
		int b;

		while(sc.hasNext()) {
			a = sc.nextInt();
			b = sc.nextInt();

			System.out.println(gcd(a, b) + " " + lcm(a, b, gcd(a, b)));
		}
	}

	public static int gcd(int a, int b) {
		int gcd = 0;
		while((gcd = a % b) != 0) {
			a = b;
			b = gcd;
		}
		return b;
	}

	public static int lcm(int a, int b, int god) {
		return a * b / god;
	}


}