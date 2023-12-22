import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			int a = s.nextInt();
			String op = s.next();
			int b = s.nextInt();
			
			if(op.charAt(0) == '?') {
				break;
			}
			char k = op.charAt(0);
			if(k == '+') {
				System.out.println(a + b);
			}
			if(k == '-') {
				System.out.println(a - b);
			}
			if(k == '*') {
				System.out.println(a * b);
			}
			if(k == '/') {
				System.out.println(a / b);
			}
		}
	}
}