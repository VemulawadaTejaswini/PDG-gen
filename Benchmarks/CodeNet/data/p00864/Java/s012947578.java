import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			int w=in.nextInt();
			if((n|w)==0)
				return;
			double cnt[]=new double[11];
			double sta=0;
			double ele=0;
			double ans=0.01;
			for(int i=0;i<n;i++)
			{
				int v=in.nextInt();
				for(int j=0;j<=10;j++)
				{
					int wi=w*j;
					if(v>=wi&&v<wi+w)
						cnt[j]++;
				}
			}
			for(int i=0;i<=10;i++)
			{
				sta=Math.max(sta,cnt[i]);
				if(cnt[i]!=0)
					ele=i;
			}
			for(int i=0;i<=10;i++)
				ans+=((ele-i)/ele)*(cnt[i]/sta);
			System.out.println(ans);
		}
	}
}