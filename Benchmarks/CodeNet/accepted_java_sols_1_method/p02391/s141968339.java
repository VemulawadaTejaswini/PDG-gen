import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;

		try(Scanner scan = new Scanner(System.in)) {
			a = scan.nextInt();
			b = scan.nextInt();

			if(a < b) {
				System.out.println("a < b");
			} else if(a > b) {
				System.out.println("a > b");
			} else if(a == b) {
				System.out.println("a == b");
			}
		}
	}

}