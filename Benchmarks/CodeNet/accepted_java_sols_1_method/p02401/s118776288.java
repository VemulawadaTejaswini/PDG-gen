import java.text.*;
import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int kaisu = 3;
		String[] num= new String[kaisu];
		while(true) {

			for(int i = 0; i < kaisu; i++) {
				num[i] = scan.next();
			}

			int a = Integer.parseInt(num[0]);
			String op = num[1];
			int b = Integer.parseInt(num[2]);

			if(op.equals("?")) {
				break;
			}
			if(op.equals("/")) {
				int c = a / b;
				System.out.println(c);
			}
			if(op.equals("+")) {
				int c = a + b;
				System.out.println(c);
			}
			if(op.equals("-")) {
				int c = a - b;
				System.out.println(c);
			}
			if(op.equals("*")) {
				int c = a * b;
				System.out.println(c);
			}
		}
	}
}