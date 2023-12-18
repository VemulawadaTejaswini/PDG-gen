import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		if(a<b)
		{
			if(b<c)
			{
				System.out.println(a+" "+b+" "+c);
			}
			else if(c<a)
			{
				System.out.println(c+" "+a+" "+b);
			}
			else
			{
				System.out.println(a+" "+c+" "+b);
			}
		}
		else
		{
			if(a<c)
			{
				System.out.println(b+" "+a+" "+c);
			}
			else if(b>c)
			{
				System.out.println(c+" "+b+" "+a);
			}
			else
			{
				System.out.println(b+" "+c+" "+a);
			}
		}
	}

}