import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		
		int count=0;
		int num=1;
		
		for(int i=0;i<n;i++)
		{
			if(a[i]==num)
			{
				count++;
				num++;
			}
		}
		
		if(count==0)
		{
			count=-1;
		}
		else
		{
			count=n-count;
		}
		System.out.println(count);
		
		s.close();
		
	}
}
