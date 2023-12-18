import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int ans = 0;
		
		while (true) {
			int a = Integer.parseInt(scan.next());
			String op = scan.next();
			int b = Integer.parseInt(scan.next());
			
			if (op.equals("?")) {
				break;
			} else if (op.equals("+")) {
				ans = a + b;
			} else if (op.equals("-")) {
				ans = a - b;
			} else if (op.equals("*")) {
				ans = a * b;
			} else if (op.equals("/")) {
				ans = a / b;
			}
			
			System.out.println(ans);
		}
		
	}
}