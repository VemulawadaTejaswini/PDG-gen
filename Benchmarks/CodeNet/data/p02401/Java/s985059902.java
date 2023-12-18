import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			char o = sc.next().charAt(0);
			if (o == '?') {
				break;
			}
			int b = sc.nextInt();
			
			switch (o) {
			case '+':
				System.out.println(a + b);
				break;
			case '-':
				System.out.println(a - b);
				break;
			case '*':
				System.out.println(a * b);
				break;
			case '/':
				System.out.println(a / b);
			}
		}
		sc.close();
	}
}