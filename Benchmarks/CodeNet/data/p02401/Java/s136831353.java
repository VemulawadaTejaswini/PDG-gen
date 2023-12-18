import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		int a		= sc.nextInt();
		String op	= sc.nextLine();
		int b		= sc.nextInt();
		
		
		int calcRes = 0;
		switch (op) {
			case "+":
				calcRes = a+b;
				break;
			case "-":
				calcRes = a-b;
				break;
			case "*":
				calcRes = a*b;
				break;
			case "/":
				calcRes = a/b;
				break;
		}
		
		System.out.println( calcRes );
		
	}
}