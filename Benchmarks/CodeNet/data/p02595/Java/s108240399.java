import java.util.ArrayList;
import java.util.*;
  public class Main
{
	public static void main (String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		int t=1;
		int i;
		while(t>0) 
		{
			t--;
			long n=sc.nextInt();
			long d=sc.nextInt();
			long ans=0;
			for(i=0;i<n;i++)
			{
				long x=sc.nextInt();
				long y=sc.nextInt();
				double dis=Math.sqrt(x*x+y*y);
				if(dis<=d)
					ans++;
			}
			System.out.println(ans);
		}
	}
}