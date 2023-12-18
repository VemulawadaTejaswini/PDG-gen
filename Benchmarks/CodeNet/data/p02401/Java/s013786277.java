import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int number1 = stdin.nextInt();
		String op = stdin.next();
		int number2 = stdin.nextInt();
		if(number1 >= 0 && number2 <= 20000) {
			if(op .equals("+")) {
				System.out.println(number1+number2);
			}else if(op .equals("-")) {
				System.out.println(number1-number2);
			}
			else if(op .equals("*")) {
				System.out.println(number1*number2);
			}
			else if(op .equals("/")) {
				System.out.println(number1/number2);
			}
		}
	}
}