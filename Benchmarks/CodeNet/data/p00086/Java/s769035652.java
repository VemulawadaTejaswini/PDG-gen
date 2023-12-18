import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int a[]=new int[101];
		int judge=0;
		while(in.hasNext())
		{
			int s=in.nextInt(),t=in.nextInt();
			a[s]++;
			a[t]++;
			if(a[0]==2)
			{
				for(int i=3;i<=100;i++)
				{
					if(a[i]%2==0)
						judge=1;
					else
					{
						judge=0;
						break;
					}
				}
				if(a[1]%2!=0&&a[2]%2!=0&&judge==1)
					System.out.println("OK");
				else
					System.out.println("NG");
				Arrays.fill(a, 0);
			}
		}
	}
}