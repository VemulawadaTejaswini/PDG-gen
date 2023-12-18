import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int d=in.nextInt();//全長
			if(d==0)
				return;
			int n=in.nextInt();//店舗数
			int m=in.nextInt();//注文数
			int a[]=new int[n];//店舗の位置格納
			int ans=0;
			a[0]=0;//1なら店舗存在
			for(int i=1;i<n;i++)
				a[i]=in.nextInt();
			for(int i=0;i<m;i++)
			{
				int k=in.nextInt();//配達先
				int dis=Integer.MAX_VALUE;
				for(int j=0;j<n;j++)
				{
					int d1=Math.abs(a[j]-k);
					int d2=Math.abs(d-d1);
					dis=Math.min(dis, Math.min(d1,d2));
				}
				ans+=dis;
			}
			System.out.println(ans);
		}
	}
	
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}