import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		String op;
		while(true) {
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();
			
			int res = 0;
			if(op.equals("+")) {
				res = a + b;
			} else if(op.equals("-")) {
				res = a - b;
			} else if(op.equals("*")) {
				res = a * b;
			} else if(op.equals("/")) {
				res = a / b;
			} else if(op.equals("?")) {
				break;
			}
			System.out.println(res + "");
		}
	}
}