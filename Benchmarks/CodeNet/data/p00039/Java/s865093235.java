import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			char c[]=in.next().toCharArray();
			int ans=0;
			int i;
			for(i=0;i<c.length-1;i++)
			{
				if(f(c[i])>=f(c[i+1]))
					ans+=f(c[i]);
				else
				{
					ans+=f(c[i+1])-f(c[i]);
					i++;
				}
			}
			if(i==c.length-1)
				ans+=f(c[i]);
			System.out.println(ans);
		}
	}
	public static int f(char c)
	{
		return 
				c=='I'?1:
				c=='V'?5:
				c=='X'?10:
				c=='L'?50:
				c=='C'?100:
				c=='D'?500:1000;
	}
}