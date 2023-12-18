import java.io.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner stdIn = new Scanner(System.in);
		int a, b;
		String op;
		
		a = stdIn.nextInt();
		op = stdIn.next();
		b = stdIn.nextInt();
		while (op.equals("?") == false) {
			switch (op){
				case "+":
					System.out.println((a + b));
					break;
				case "-":
					System.out.println((a - b));
					break;
				case "*":
					System.out.println(a * b);
					break;
				case "/":
					System.out.println(a / b);
					break;
			}
			
			a = stdIn.nextInt();
			op = stdIn.next();
			b = stdIn.nextInt();
		}
	}
}