import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int a = scan.nextInt();
			String op = scan.next();
			int b = scan.nextInt();
			
			if (a < 0 || b < 0 || a > 20000 || b > 20000) {
				System.out.println("Error!");
			}
		
			if (op.equals("?"))
				break;
			if (op.equals("+")) {
				sb.append(a+b).append('\n');
			}
			if (op.equals("-")) {
				sb.append(a-b).append('\n');
			}
			if (op.equals("*")) {
				sb.append(a*b).append('\n');
			}
			if (op.equals("/")) {
				sb.append(a/b).append('\n');
			}
		}
		System.out.print(sb);
	}
}