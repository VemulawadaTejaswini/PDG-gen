import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(true)
		{
			int a = stdIn.nextInt();
			String op = stdIn.next();
			int b = stdIn.nextInt();
			if(op.equals("?"))
			{
				break;
			}
			if(op.equals("+"))
			{
				System.out.println(a + b);
			}
			else if(op.equals("-"))
			{
				System.out.println(a - b);
			}
			else if(op.equals("*"))
			{
				System.out.println(a * b);
			}
			else if(op.equals("/"))
			{
				System.out.println(a / b);
			}
		}
	}
}