import java.util.Scanner;


public class Main {
	static long  sieve[]=new long[9910000];
	public static void bal()
	{
	    int i,a,b,j;
	    double n = Math.sqrt(2000010.0);
	    for(i=2; i<=(int)n; i++)
	    {
	        if(sieve[i]==0)
	        {
	            for(a=i; a*i<=2000010; a++)
	            {
	                sieve[a*i]=1;
	            }
	        }

	    }
	}
	public static void main(String args[])
	   {
		 long i,j,k,n,c=0;
		 bal();
		    Scanner ui = new Scanner (System.in);
		    while(ui.hasNext()){
		    	n=ui.nextLong();
		    	c=0;
		    for(i=2;i<=n;i++)
		    {
		       
		        if(sieve[(int) i]!=1)
		        {
		          c++;
		        }
		    }
		    System.out.println(c);}
	   }}