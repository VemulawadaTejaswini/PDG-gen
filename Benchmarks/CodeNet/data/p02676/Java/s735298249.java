import java.util.*;
import java.lang.*;
 
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);

		int k;
		k=sc.nextInt();
		String s;
		s=sc.next();
		int l=s.length();
		if(k>=l)
		{
		    
		    System.out.println(s);
		}
		else
		{
		    s=s.substring(0,k);
		    s=s+"...";
		    System.out.println(s);
		}
	}
}
