import java.util.*;
import java.lang.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    long l = 1000000000000000000L;
	    int n = sc.nextInt();
	    long result =1,x;
	    for(int i=0;i<n;i++)
	    {
	        x = sc.nextLong();
	        result *= x;
	    }
	    if(result>l)
	        System.out.println("-1");
	    else
	        System.out.println(result);
	}
}
