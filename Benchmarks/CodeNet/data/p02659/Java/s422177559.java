import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long a = scan.nextLong();
		long b = (long)(scan.nextDouble() * 100 + 0.001);


		System.out.println((a * b)/100);
	}
}
