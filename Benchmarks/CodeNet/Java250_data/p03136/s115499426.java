import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b[]=new int [a+1];
		for(int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
			//System.out.println(b[i]);
		}
		Arrays.sort(b);
		/*for(int k=0;k<a;k++)
		{
			System.out.println(b[k]);
		}*/
		int c=0;
		for(int j=0;j<a;j++)
		{
			c=c+b[j];
			//System.out.println("c is:"+c);
		}
		if(b[a]<c)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}