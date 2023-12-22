import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();

		if (n * a > b) {
			System.out.println(b);
		} else {
			System.out.println(n * a);
		}
	}

}
