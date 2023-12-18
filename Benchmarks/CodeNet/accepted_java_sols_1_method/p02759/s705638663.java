import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int anser = 0;

		anser = n / 2 + n % 2;

		System.out.println(anser);

	}

}
