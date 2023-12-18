import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int number1 = stdin.nextInt();
		String op = stdin.next();
		int number2 = stdin.nextInt();
		int number3 = stdin.nextInt();
		String str = stdin.next();
		int number4 = stdin.nextInt();
		if(number1 >= 0 && number1 <= 20000 && number2 >= 0 && number2 <= 20000) {
			if(number3 == 0 && number4 == 0 && str .equals("?")) {
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
}