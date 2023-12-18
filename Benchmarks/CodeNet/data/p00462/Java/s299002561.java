import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	static int n,a[];

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int d=in.nextInt();//全長
			if(d==0)
				return;
			n=in.nextInt();//店舗数
			int m=in.nextInt();//注文数
			a=new int[n+1];//店舗の位置格納
			int ans=0;
			a[0]=0;
			for(int i=1;i<n;++i)
				a[i]=in.nextInt();
			a[n]=d;
			Arrays.sort(a);
			for(int i=0;i<m;++i)
			{
				int k=in.nextInt();//配達先
				ans+=binary(k);
			}
			System.out.println(ans);
		}
	}

	static public int binary(int ob)
	{
		int ri=n-1;
		int le=0;
		int res=0;
		while(ri>=le)
		{
			int mid=(le+ri)/2;
			if(a[mid]>ob)
				ri=mid-1;
			else
				le=mid+1;
		}
		res=Math.min(Math.abs(ob-a[ri]),Math.abs(a[le]-ob));
		return res;
	}
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}