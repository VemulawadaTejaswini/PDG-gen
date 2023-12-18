import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc;
		boolean con = true;
		while (con) {
			sc = new Scanner(System.in);
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			if(op.equals("+")){
				System.out.println(a + b);

			}
			if(op.equals("-")){
				System.out.println(a - b);
				
			}
			if(op.equals("*")){
				System.out.println(a * b);
				
			}
			if(op.equals("/")){
				System.out.println(a / b);
				
			}
			if(op.equals("?")){
				sc.close();
				con = false;
			}
		}


	}
}