import static java.lang.System.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			if(op.equals("?")){
				break;
			}
			int num = 0;
			switch(op) {
			case "+":
				num = a + b;
				break;
			case "-":
				num = a - b;
				break;
			case "*":
				num = a * b;
				break;
			case "/":
				num = a / b;
				break;
			}
			out.println(num);
		}
		sc.close();
	}
}
