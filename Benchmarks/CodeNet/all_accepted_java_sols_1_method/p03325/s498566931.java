import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int a,sum=0;
		for(int i=0;i<d;i++)
		{
			a=sc.nextInt();
		
			int count = 0;
			while(a%2==0)
			{
				a=a/2;
				count++;
			}
			sum+=count;
		}
		System.out.println(sum);
		
	}
}