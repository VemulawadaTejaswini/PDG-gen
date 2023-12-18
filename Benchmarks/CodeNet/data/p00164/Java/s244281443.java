import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			int cnt=32;
			int i=0;
			while(cnt>0)
			{
				cnt-=(cnt-1)%5;
				System.out.println(cnt>0 ? cnt:0);
				cnt-=a[(i++)%n];
				System.out.println(cnt>0 ? cnt:0);
			}
		}
	}
	
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}