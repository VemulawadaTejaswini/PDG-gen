import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		Scanner sc =new Scanner(System.in);
		int i;
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
		    double n1=Math.sqrt(i);
		    int n2= (int)Math.floor(n1);
		    int n3= (int)Math.ceil(n1);
		        if(n2==n3)
		        {
		            break;
		        }
		}
	
		    System.out.println(i);
		
	}
}
