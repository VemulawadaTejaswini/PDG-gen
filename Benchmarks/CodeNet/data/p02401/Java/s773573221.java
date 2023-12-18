import java.util.Scanner;
import java.util.Formatter;
public class Main
{
	public static void main(String args[])
	{
		Scanner inp = new Scanner(System.in);
		int a, b;
		char op;
		while(true)
		{
			a = inp.nextInt();
			op = inp.next().charAt(0);
			b = inp.nextInt();
			if(a==0 && op == '?' && b == 0)
				break;
			else {
				if(op == '+')
					System.out.println(a+b);
				if(op == '*')
					System.out.println(a*b);
				if(op == '/')
					System.out.println(a/b);
				if(op == '-')
					System.out.println(a-b);
			}
		}
	}
}