import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		if (a <= b) {
			System.out.println(a);
		} else {
			System.out.println(a - 1);
		}
	}

}
