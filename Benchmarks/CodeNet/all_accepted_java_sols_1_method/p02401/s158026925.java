import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	
	static DecimalFormat df = new DecimalFormat("0.0000000000000000000");
	
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			
			if (op.equals("?")) break;
			
			if (op.equals("+"))
				System.out.println(a+b);
			else if (op.equals("-"))
				System.out.println(a-b);
			else if (op.equals("*"))
				System.out.println(a*b);
			else
				System.out.println(a/b);
			
		}
		
		sc.close();
	}

}