import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long amt = sc.nextLong();

		long a = amt / 500;

		long b = (amt - 500 * a) / 5;

		System.out.println(1000 * a + 5 * b);


	}
}
