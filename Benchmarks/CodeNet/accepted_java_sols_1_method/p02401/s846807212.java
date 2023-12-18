import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] ans = new int[10000];
		int i = 0;
		while(true) {
			int a = scan.nextInt();
			String op = scan.next();
			int b = scan.nextInt();
			if(op.equals("+")) {
				ans[i] = a + b;
			}
			else if(op.equals("-")) {
				ans[i] = a - b;
			}
			else if(op.equals("*")) {
				ans[i] = a * b;
			}
			else if(op.equals("/")) {
				ans[i] = a / b;
			}
			else if(op.equals("?")) {
				break;
			}
			i++;
		}
		for(int j = 0; j < i; j++) {
			System.out.println(ans[j]);
		}
	}
}
