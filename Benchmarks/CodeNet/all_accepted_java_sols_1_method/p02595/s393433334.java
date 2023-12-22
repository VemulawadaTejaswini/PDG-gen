import java.util.*;
public class Main 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++) 
		{
			int a=sc.nextInt(),b=sc.nextInt();
			if(Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2))<=d) 
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
