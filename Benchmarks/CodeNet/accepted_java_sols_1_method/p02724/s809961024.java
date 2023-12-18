import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int n1000 = n / 500 * 1000;
		int n5 = (n - (n / 500) * 500) / 5 * 5;

		System.out.println(n1000 + n5);
		sc.close();

	}
}