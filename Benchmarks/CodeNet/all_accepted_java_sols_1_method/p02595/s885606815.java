
import java.util.*;

public class Main {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		long a,b,count=0;
		for(int i=0;i<n;i++)
		{
			a=sc.nextLong();
			b=sc.nextLong();
			if(Math.sqrt((a*a)+(b*b))<=m) 
				{
				 	count++;
				}
			
		}
		System.out.println(count);
	}
	
}
