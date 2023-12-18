import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long A = scan.nextLong();
		double B = scan.nextDouble();

		System.out.println((long)Math.floor((A * (B * 100)) / 100));
	}
}