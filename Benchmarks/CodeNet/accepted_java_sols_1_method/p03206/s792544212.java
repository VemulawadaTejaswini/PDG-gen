import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();

		System.out.print("Christmas ");

		while (d < 25) {
			System.out.print("Eve ");
			d++;

		}

	}
}