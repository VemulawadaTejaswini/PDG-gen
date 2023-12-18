import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		for(;;) {
			int a = stdin.nextInt();
			int b = stdin.nextInt();
			String op = stdin.next();
		
			if(op.equals("+")) {
				System.out.println(a + b);
			} else if (op.equals("-")) {
				System.out.println(a - b);
			} else if (op.equals("*")) {
				System.out.println(a * b);
			} else if (op.equals("/")) {
				if(b != 0) {
					System.out.println(a / b);
				}
			}else {
				break;
			}
			
		}
		
	}

}