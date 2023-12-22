import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int ans=0;
			int inde=0;
			for(int  i=0;i<5;i++)
			{
				int sum=in.nextInt()+in.nextInt();
				if(sum==0)
					return;
				if(ans<sum)
				{
					ans=sum;
					inde=i;
				}
			}
			char ch='A';
			ch= (char) (ch+inde);
			System.out.println(ch+" "+ans);
		}
	}
}