import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
			Map<String,Integer>HM=new HashMap<String, Integer>();
			String ans="";
			boolean judge=false;
			int index=n;
			for(int i=0;i<n;i++)
			{
				String str=in.next();
				int cnt=1;
				if(HM.containsKey(str))
					cnt+=HM.get(str);
				HM.put(str,cnt);
				if(cnt>n/2)
				{
					judge=true;
					ans=str;
					index=i+1;
					break;
				}
			}
			for(int i=0;i<n-index;i++)
			{
				int hoge=in.nextInt();
			}
			System.out.println(judge ? ans:"NO COLOR");
		}
	}
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}