import java.io.*;
import java.util.*;

public class Main
{
	static Scanner scan = new Scanner(System.in);
	public static void solve() throws Exception
	{
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = scan.nextInt();
		long[] nums = new long[n];
		long sum = 0;
		HashMap<Long,Long> map = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			nums[i]=scan.nextLong();
			sum+=nums[i];
			if(map.containsKey(nums[i]))
			{
				map.replace(nums[i],map.get(nums[i])+1);
			}
			else
				map.put(nums[i],(long)1);
		}
		long q=scan.nextLong();
		while(q-->0)
		{
			long a = scan.nextLong();
			long b = scan.nextLong();
			if(map.get(a)==null)
				System.out.println(sum);
			else
			{
				long num = map.get(a);
				sum = sum+b*num-a*num;
				map.remove(a);
				if(map.containsKey(b))
				{
					map.replace(b,map.get(b)+num);
				}
				else
					map.put(b,num);
				System.out.println(sum);
			}
			//System.out.println(map);
		}
	}
	public static void main(String[] args) throws Exception
	{
		if(scan.hasNext())
		{
			//int t= scan.nextInt();
			int t= 1;
			while(t-->0)
			{	
				solve();
			}
		}
	}
}