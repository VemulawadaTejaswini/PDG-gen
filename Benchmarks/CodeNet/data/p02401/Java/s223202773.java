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
			if(op=="+"){
				System.out.println(a + b);

			}
			if(op=="-"){
				System.out.println(a - b);
				
			}
			if(op=="*"){
				System.out.println(a * b);
				
			}
			if(op=="/"){
				System.out.println(a / b);
				
			}
			if(op== "?"){
				sc.close();
				con = false;
			}
		}


	}
}