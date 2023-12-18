import java.util.Scanner;
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
			if(op == '?')
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