import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			for(;;) {
				int a = sc.nextInt();
				String op = sc.next();
				int b = sc.nextInt();

				int ans = 0;
				if(op.equals("?")) {
					break;
				}
				else if(op.equals("+")) {
					ans = a + b;
				}
				else if(op.equals("-")) {
					ans = a - b;
				}
				else if(op.equals("*")) {
					ans = a * b;
				}
				else if(op.equals("/")) {
					ans = a / b;
				}

				System.out.println(ans);
			}
		}
	}
}
