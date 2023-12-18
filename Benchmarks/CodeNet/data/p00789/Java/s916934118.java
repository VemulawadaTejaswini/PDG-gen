import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int a[]={1,4,9,16,25,36,49,64,81,100,121,144,169,196,225,256,289};//a.length=17
		int dp[]=new int[301];
		dp[0]=1;
		for(int i=0;i<a.length;i++)//使える数字
			for(int j=a[i];j<=300;j++)//テーブルを埋めていく
				dp[j]+=dp[j-a[i]];
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			System.out.println(dp[n]);
		}
	}


	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}