import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		String op = "";

		while(true) {
			a = scan.nextInt();
			op = scan.next();
			b = scan.nextInt();

			switch(op) {
			case "+":
				System.out.println(a+b);
				break;
			case "-":
				System.out.println(a-b);
				break;
			case "*":
				System.out.println(a*b);
				break;
			case "/":
				System.out.println(a/b);
				break;
			case "?":
				scan.close();
				System.exit(0);

			}

		}

	}

}
