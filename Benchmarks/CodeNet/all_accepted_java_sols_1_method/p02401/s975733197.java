import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		int ans = 0;

		while(true) {
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();

			if(op.equals("?")) {
				break;
			}else if(op.equals("+")) {
				ans = a+b;
			}else if(op.equals("-")) {
				ans = a-b;
			}else if(op.equals("*")) {
				ans = a*b;
			}else if(op.equals("/")) {
				ans = a/b;
			}
			System.out.println(ans);
		}

		sc.close();
	}
}
