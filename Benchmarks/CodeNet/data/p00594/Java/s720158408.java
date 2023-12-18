import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
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
			HashMap<Integer, Integer>HM=new HashMap<Integer, Integer>();
			int ans=0;
			boolean judge=false;
			for(int i=0;i<n;i++)
			{
				int x=in.nextInt();
				int cnt=1;
				if(HM.containsKey(x))
					cnt+=HM.get(x);
				HM.put(x, cnt);
				if(cnt>n/2)
				{
					judge=true;
					ans=x;
				}
			}
			System.out.println(judge ? ans:"NO COLOR");
		}
	}
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}