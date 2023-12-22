import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		scanner.hasNext();

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		double c = (double)a/(double)b;

		System.out.print(a/b + " ");
		System.out.print(a%b + " ");

		String after = String.format("%.16f", c);
		System.out.println(after);
	}
}