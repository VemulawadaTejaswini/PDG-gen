import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while(true) {
			int a = scan.nextInt();
			String op = scan.next();
			int b = scan.nextInt();

			if(("+").equals(op)) {
				System.out.println(a + b);
			} else if (("-").equals(op)) {
				System.out.println(a - b);
			} else if (("*").equals(op)) {
				System.out.println(a * b);
			} else if (("/").equals(op)) {
				System.out.println(a / b);
			} else if (("?").equals(op)) {
				break;
			}
		}
	}

}