import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int a,b;
		char op;

		Scanner stdIn = new Scanner(System.in);


		while(true) {
			a = stdIn.nextInt();
			op = stdIn.next().charAt(0);
			b = stdIn.nextInt();

			switch(op) {
			case '+':
				System.out.println(a+b);
				break;
			case '-':
				System.out.println(a-b);
				break;
			case '*':
				System.out.println(a*b);
				break;
			case '/':
				System.out.println(a/b);
				break;
			case '?':
				System.exit(0);
			}
		}

	}

}