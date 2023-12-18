import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		int a,b,d,r;
		double f;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();

		d = a/b;
		r = a%b;
		f = 1.0 * a/b;

		System.out.printf(d + " "+ r + " "+ "%6.5f",f);

	}

}