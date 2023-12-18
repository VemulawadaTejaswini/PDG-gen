import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    Scanner sc = new Scanner(System.in);
		    long t,sum,mod,c;
		    int n,i;
		    c=0;
		    mod=(long)(Math.pow(10,9))+7;
		    n=sc.nextInt();
		    long a[] = new long[n];
		   sum=0;
		    for(i=0;i<n;i++)
		    { a[i]=sc.nextLong();
		    sum=sum+a[i];
		    }
		   for(i=0;i<n;i++)
		   {
		       c=(c%mod+((((sum%mod-a[i]%mod)%mod)%mod)*(a[i]%mod)%mod)%mod)%mod;
		   }
		   System.out.println(c/2);
		} catch(Exception e) {
		}
	}
}
