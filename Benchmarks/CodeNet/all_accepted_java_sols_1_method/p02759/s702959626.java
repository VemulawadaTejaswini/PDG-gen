import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int p = (int)Math.ceil(n / 2.0);

		System.out.println(p);
		scan.close();
	}
}