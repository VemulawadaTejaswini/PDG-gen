import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		long n=s.nextLong();
		long x=s.nextLong();
		long t=s.nextLong();
		
		long times=n/x;
		long rem=0;
		
		if(n%x!=0)
		{
			times++;
		}
		
		System.out.println(times*t);
		
	}
	
}