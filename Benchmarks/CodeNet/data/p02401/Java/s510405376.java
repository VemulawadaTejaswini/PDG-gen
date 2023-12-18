import java.util.Scanner;

class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		String str = scan.next();
		int b = scan.nextInt();

		switch(str)
		{
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
				break;

			default:
				break;
		}

		scan.close();
	}
}