import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		scanner.hasNext();

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		float c = (float)a/(float)b;

		System.out.print(a/b + " ");
		System.out.print(a%b + " ");
		System.out.print(c);

	}
}