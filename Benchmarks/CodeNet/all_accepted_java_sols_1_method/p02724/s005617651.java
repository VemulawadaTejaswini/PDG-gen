import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int k500 = x / 500;
		int k5 =(x-k500*500) / 5;

		System.out.println((k500 * 1000 + k5 * 5));

		sc.close();

	}
}