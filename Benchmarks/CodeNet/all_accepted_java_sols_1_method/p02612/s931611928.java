import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int c = n % 1000 == 0 ? n / 1000 : n / 1000 + 1;

		System.out.println(1000 * c - n);
	}
}