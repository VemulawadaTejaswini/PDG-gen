import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		int a;
		long d=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		int c=sc.nextInt();
		int b[]=new int[a];
		for(int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
		}
		Arrays.sort(b);
		if(a<c)
		{System.out.println("0");}
		else
		{
			for(int j=0;j<a-c;j++)
			{
				d+=b[j];
				
			}
			System.out.println(d);
		}
	}
}