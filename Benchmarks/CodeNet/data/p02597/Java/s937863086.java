import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		String str=s.next();
		
		int r=0;
		int w=0;
		
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)=='R')
			{
				r++;
			}
			else
			{
				w++;
			}
		}
		
		int count=0;
		
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)=='W'&&i<=r-1)
			{
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
}