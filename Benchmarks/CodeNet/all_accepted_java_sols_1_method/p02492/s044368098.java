import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		while(true)
		{
			int  x, y, ans=0;
			String op;
	
			x  = sc.nextInt();
			op = sc.next();
			y  = sc.nextInt();
			
			if(op.charAt(0) == '?')break;
			switch(op.charAt(0))
			{
			case '+':  ans=x+y;  break;
			case '-':  ans=x-y;  break;
			case '*':  ans=x*y;  break;
			case '/':  ans=x/y;  break;
			}
			
			System.out.println(ans);
		}
	}
}