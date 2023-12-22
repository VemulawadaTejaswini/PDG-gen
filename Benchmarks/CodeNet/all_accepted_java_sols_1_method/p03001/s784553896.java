import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		double a,b,c,d;

		Scanner sc = new Scanner(System.in);

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();

		int count = 0;
		double result = a * b /2;

		if (a/2 == c && b/2 == d) {

			count = 1;

		}

		System.out.println(result + " " + count);

	}
}
