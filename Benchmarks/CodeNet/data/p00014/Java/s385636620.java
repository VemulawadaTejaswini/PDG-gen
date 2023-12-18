import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	long a;
	while(scan.hasNext())
	    {
		long x1=0;
	a=scan.nextInt();
	
	for(long i=600;i>0;i-=a)
	    {
		
		x1+=a*((int)Math.pow(i-a,2));
		
	    }
	
	System.out.println(x1);
	
	    }
    }
}