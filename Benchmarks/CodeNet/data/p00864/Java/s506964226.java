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
			int v[]=new int[n];
			for(int i=0;i<n;i++)
				v[i]=in.nextInt();
			Arrays.sort(v);
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<=10;j++)
				{
					int wi=w*j;
					if(v[i]>=wi&&v[i]<wi+w)
						cnt[j]++;
				}
			}

			for(int i=0;i<=10;i++)
				sta=Math.max(sta,cnt[i]);
			for(int i=10;i>=0;i--)
			{
				if(cnt[i]!=0)
				{
					ele=i;
					break;
				}
			}
			for(int i=0;i<=10;i++)
			{
				ans+=((ele-i)/ele)*(cnt[i]/sta);
			}
			System.out.println(ans);
		}
	}

	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}