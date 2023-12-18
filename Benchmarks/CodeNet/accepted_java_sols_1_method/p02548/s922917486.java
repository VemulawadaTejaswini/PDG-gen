import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		long ans=0;
		
		for(int i=1;i<1000001;i++)
		{
			if(n%i==0)
			{
				ans=ans+(n/i)-1;
			}
			else
			{
				ans=ans+(n/i);
			}
		}
		
		System.out.println(ans);
		
	}
	
}