import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long a = scan.nextLong();
		double b = scan.nextDouble();

		System.out.println((int)Math.floor(a*b));

		scan.close();

	}

}
