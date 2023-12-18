import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int a,b;
		String op;
		
		a=in.nextInt();
		op=in.next();
		b=in.nextInt();
		
		while(!op.equals("?"))
		{
			if(op.equals("+"))
					System.out.println(a+b);
			else if(op.equals("-"))
				System.out.println(a-b);
			else if(op.equals("*"))
				System.out.println(a*b);
			else if(op.equals("/"))
				System.out.println(a/b);
			
			a=in.nextInt();
			op=in.next();
			b=in.nextInt();
		}

	}

}