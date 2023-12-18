import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		String op;
		
		do {
			a = scan.nextInt();
			op = scan.next();
			b = scan.nextInt();
			
			if("?".equals(op) )break;
			
			switch(op) {
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
			default:
				break;
			}

		}while(true);
		
	}
}
