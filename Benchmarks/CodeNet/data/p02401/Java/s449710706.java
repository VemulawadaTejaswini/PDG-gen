import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt;
		String op = scan.next();
		int b = scan.nextInt;//????????¶??\???
		
			for ( int i = 0;; i++){
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