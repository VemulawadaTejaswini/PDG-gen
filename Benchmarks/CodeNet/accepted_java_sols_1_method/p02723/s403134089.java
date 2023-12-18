import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		String a;
		Scanner s1=new Scanner(System.in);
		a=s1.nextLine();
		int b=a.length();
		if(b==6)
		{
			if(a.charAt(2)==a.charAt(3))
			{
				if(a.charAt(4)==a.charAt(5))
				{
					System.out.println("Yes");
				}
				else
				{System.out.println("No");}
			}
			else
			{System.out.println("No");}
		}
		else
		{System.out.println("No");}
	}
}