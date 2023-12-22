import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);

		for (;;) {
			int a = stdIn.nextInt();
			String op = stdIn.next();
			int b = stdIn.nextInt();
			int ans = 0;
			
			if (op.equals("?")) break;
			
			switch (op) {
			case "+":
				ans = a + b;
				break;
	
			case "-":
				ans = a - b;
				break;
				
			case "*":
				ans = a * b;
				break;
				
			case "/":
				ans = a / b;
			}
			System.out.println(ans);
		}
	}
}

