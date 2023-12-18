import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int max=0;
			int min=500;
			while(n-->0)
			{
				int s=0;
				for(int i=0;i<5;i++)
					s+=in.nextInt();
				if(max<=s)
					max=s;
				if(min>=s)
					min=s;
			}
			System.out.println(max+" "+min);
		}
	}
}