import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int M=50000;
		boolean prime[]=new boolean[M+1];
		Arrays.fill(prime,true);
		prime[0]=prime[1]=false;
		for(int i=2;i*i<=M;i++)
		{
			if(!prime[i])
				continue;
			for(int j=i*2;j<=M;j+=i)
				prime[j]=false;
		}
		while(in.hasNext())
		{
			int n=in.nextInt();
			int ans1=-1,ans2=-1;
			int up=n,down=n;
			while(ans1==-1||ans2==-1)
			{
				if(ans1==-1&&prime[--down])
					ans1=down;
				if(ans2==-1&&prime[++up])
					ans2=up;
			}
			System.out.println(down+" "+up);
		}
	}
}