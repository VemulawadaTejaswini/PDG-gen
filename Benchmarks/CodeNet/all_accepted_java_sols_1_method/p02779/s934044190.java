import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		int c=0;
		int b[]=new int[a];
		for(int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
		}
		Arrays.sort(b);
		for(int j=0;j<a-1;j++)
		{
			if(b[j]==b[j+1])
			{ c=c+1; }
		}
		if(c>0)
		{System.out.println("NO");}
		else
		{System.out.println("YES");}
	
	}
}