import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt;
		int op = scan.nextInt;
		int b = scan.nextInt;//????????¶??\???
		
		for (i = 0;; i++){
		if(op == '+') {
			int x = a + b;
		} else if(op == '-') {
			x = a - b;
		} else if(op == '*') {
			x = a * b;
		} else if(op == '/') {
			x = a / b;			
		} else {
			break;
		}
		System.out.println(x);
		}
	}
}