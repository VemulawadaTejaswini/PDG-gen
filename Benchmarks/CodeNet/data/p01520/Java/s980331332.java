import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int N=in.nextInt();
			int T=in.nextInt();//best
			int E=in.nextInt();//誤差
			boolean judge=false;
			int ans=-1;
			int s[]=new int[N];
			for(int i=0;i<N;i++)
				s[i]=in.nextInt();
			for(int i=0;i<N;i++)
			{
				for(int j=0;;j++)
				{
					if(Math.abs(s[i]*j-T)<=E)
					{
						judge=true;
						ans=i+1;
					}
					if(s[i]*j>T+E)
						break;
				}
				if(judge)
					break;
			}
			System.out.println(judge ? ans:-1);
		}
	}
}