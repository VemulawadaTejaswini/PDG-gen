import java.util.Scanner;
import java.util.Arrays;
/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    Scanner sc = new Scanner(System.in);
		    int t,n,k,s,m;
		    n=sc.nextInt();
		    m=n;
		    n--;
		   s=0;k=1;
		   while((n/k)>0)
		   {
		       s=s+n/k;
		       k++;
		 
		   }
		   System.out.println(s);
		} catch(Exception e) {
		}
	}
}
