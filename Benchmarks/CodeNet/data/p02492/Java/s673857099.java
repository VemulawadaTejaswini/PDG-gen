import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String op = sc.next();
		int b = sc.nextInt();
		int answer = 0;
		//while (true)
		//{
			switch (op)
			{
			case "*":
				answer = a*b;
				System.out.println(answer);
				break;
			case "+":
				answer = a + b;
				System.out.println(answer);
				break;
			case "-":
				answer = a - b;
				System.out.println(answer);
				break;
			case "/":
				answer = a / b;
				System.out.println(answer);
				break;
			default:
				break;
			}
			if (op == "?");
				//break;
		//}
	}
}