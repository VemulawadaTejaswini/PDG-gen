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
		int[] nums = new int[n];
		long sum = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			nums[i]=scan.nextInt();
			sum+=nums[i];
			if(map.containsKey(nums[i]))
			{
				map.replace(nums[i],map.get(nums[i])+1);
			}
			else
				map.put(nums[i],1);
		}
		int q=scan.nextInt();
		while(q-->0)
		{
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(map.get(a)==null)
				System.out.println(sum);
			else
			{
				int num = map.get(a);
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