import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number1;
		int number2;
		String op;
		Scanner scanner = new Scanner(System.in);
		do {
			number1 = scanner.nextInt();
			op = scanner.next();
			number2 = scanner.nextInt();
			if(number1 >= 0 && number1 <= 20000 && number2 >= 0 && number2 <= 20000) {
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
		}while(! (op.equals("?")));