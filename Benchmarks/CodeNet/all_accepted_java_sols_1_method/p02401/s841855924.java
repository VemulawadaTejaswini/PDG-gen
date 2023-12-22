import java.util.Scanner;
import java.io.IOException;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int a = scan.nextInt();
			String str = scan.next();
			int b = scan.nextInt();
			if (str.equals("?")) {
				break;
			}
			switch (str) {
			case "+":
				System.out.println(a + b);
				break;
			case "-":
				System.out.println(a - b);
				break;
			case "*":
				System.out.println(a * b);
				break;
			case "/":
				System.out.println(a / b);
				break;
			}
		}
	}
}