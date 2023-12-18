import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt;
		char op = scan.nextChar;
		int b = scan.nextInt;//????????¶??\???
		
			for (i = 0;; i++){
			if(op == '+') {
				System.out.println(a + b);
			} else if(op == '-') {
				System.out.println(a - b);
			} else if(op == '*') {
				System.out.println(a * b);
			} else if(op == '/') {
				System.out.println(a / b);
			} else {
				break;
			}
		}
	}
}