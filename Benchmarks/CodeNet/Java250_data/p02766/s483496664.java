import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		int d = (int)Math.ceil(Math.log10(n + 1) / Math.log10(k));
		System.out.println(d);
		scan.close();
	}
}