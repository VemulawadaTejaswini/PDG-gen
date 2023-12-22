import java.io.*;
import java.util.*;


public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();

		
		StringBuilder sb = new StringBuilder();
		
		sb.append(a);
		
		sb.reverse();
		
		
		if(a.equals(sb.toString()))
		{
			String b= a.substring(0,(a.length()/2));
			String c = a.substring((a.length()/2) + 1,a.length());
			if(b.equals(c))
			{
				System.out.println("Yes");
			}
			else 
			{
				System.out.println("No");
			}
			
		}
		else
		{
			System.out.println("No");
		}
		sc.close();
	}

}
