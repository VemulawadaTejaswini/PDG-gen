import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;

		Scanner in = new Scanner(System.in);

		a = in.nextInt();
		b = in.nextInt();

		int d = a / b;
		int r = a % b;
		double f = a / b;

		System.out.println(d + " " + r + " " + f);

	}

}