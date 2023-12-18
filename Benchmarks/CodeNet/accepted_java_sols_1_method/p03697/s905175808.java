import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		if (a + b >= 10) {
			System.out.println("error");
		} else {
			System.out.println(a + b);
		}

	}

}
