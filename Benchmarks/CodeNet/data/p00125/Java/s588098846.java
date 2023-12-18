import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
		for(;;)
		{
			int y1=in.nextInt(),m1=in.nextInt(),d1=in.nextInt();
			int y2=in.nextInt(),m2=in.nextInt(),d2=in.nextInt();
			int cnt1=0;
			int cnt2=0;
			if(y1<0)
				break;
			for(int i=1;i<y1;i++)
			{
				if(year(i))
					cnt1+=366;
				else
					cnt1+=365;
			}
			for(int i=1;i<m1;i++)
			{
				if(i==2&&year(y1))
					cnt1+=month[i]+1;
				else
					cnt1+=month[i];
			}
			cnt1+=d1;
			for(int i=1;i<y2;i++)
			{
				if(year(i))
					cnt2+=366;
				else
					cnt2+=365;
			}
			for(int i=1;i<m2;i++)
			{
				if(i==2&&year(y2))
					cnt2+=month[i]+1;
				else
					cnt2+=month[i];
			}
			cnt2+=d2;
			System.out.println(cnt2-cnt1);
		}
	}

	static boolean year(int y)
	{
		if(y%4==0&&(y%100!=0||y%400==0))
			return true; else	
				return false;
	}
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}