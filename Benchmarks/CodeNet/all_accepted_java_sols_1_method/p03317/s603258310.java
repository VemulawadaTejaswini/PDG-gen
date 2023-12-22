import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();

		scanner.nextLine();
		scanner.nextLine();

		int m = (int)Math.ceil(((double)(n-1))/(k-1));
		System.out.println(m);
	}
}