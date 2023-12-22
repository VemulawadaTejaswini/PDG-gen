import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a, b, solution;
		String op;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			a = scan.nextInt();
			op = scan.next();
			b = scan.nextInt();
			
			if(op.equals("?")) break;
			
			if(op.equals("+")) {
				solution = a + b;
			} else if(op.equals("-")) {
				solution = a - b;
			} else if(op.equals("*")) {
				solution = a * b;
			} else if(op.equals("/")) {
				solution = a / b;
			} else return;
			
			System.out.println(solution);
			
		}
		
	}

}
