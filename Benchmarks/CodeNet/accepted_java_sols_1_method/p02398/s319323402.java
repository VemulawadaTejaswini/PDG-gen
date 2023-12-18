import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int div = 0;

		try(Scanner scan = new Scanner(System.in)) {
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();

			for(int i = a; i <= b; i++) {
				if(c % i == 0) {
					div++;
				}
			}
			System.out.println(div);
		}
	}
}