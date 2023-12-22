import java.util.Scanner;

public class Main {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int a = sc.nextInt();
		String op = sc.next();
		int b = sc.nextInt();
		
		for (;!op.equals("?");) {
			int ans = 0;
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
				if (a == 0) {
					break;
				}
				ans = a / b;
			}
			System.out.println(ans);
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();
		}
	}
}