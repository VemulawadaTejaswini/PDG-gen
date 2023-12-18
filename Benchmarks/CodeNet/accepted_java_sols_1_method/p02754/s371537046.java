import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		long n=s.nextLong();
		long a=s.nextLong();
		long b=s.nextLong();
		
		long set=n/(a+b);
		long rem=n%(a+b);
		
		long ans=a*set;
		
		ans=ans+Math.min(a,rem);
		
		System.out.println(ans);
	}
	
}