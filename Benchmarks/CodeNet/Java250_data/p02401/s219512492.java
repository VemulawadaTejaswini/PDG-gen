import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int a = scan.nextInt();
			String op = scan.next();
			int b = scan.nextInt();

			if(op.equals("?")) {
				break;
			}

			switch(op) {
			case "+" :
				System.out.println(a + b);
				break;
			case "-" :
				System.out.println(a - b);
				break;
			case "*" :
				System.out.println(a * b);
				break;
			case "/" :
				System.out.println(a / b);
				break;
			}
		}
		scan.close();
	}
}
