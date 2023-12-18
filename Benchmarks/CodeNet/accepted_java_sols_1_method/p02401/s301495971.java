import java.util.Scanner;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		String op;

		while (true) {
			a = scan.nextInt();
			op = scan.next();
			b = scan.nextInt();

			if (op.equals("?")) break;
			
			System.out.printf("%d\n",
				  op.equals("+") ? a+b
				: op.equals("-") ? a-b
				: op.equals("*") ? a*b
								: a/b );
		}
	}
}