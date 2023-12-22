import java.util.*;
import java.io.*;
class Main
{
	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
			int n=Integer.parseInt(inp.readLine());
			String aa[]=inp.readLine().split(" ");
			long arr[]=new long[n];

			for(int i=0;i<arr.length;i++)
			{
				arr[i]=Long.parseLong(aa[i]);
			}
			// PriorityQueue<Pair>pr=new PriorityQueue<>((a,b)->(int)(a.b-b.a));
			// boolean visited[]=new boolean[n];
			// visited[0]=true;
			// pr.offer(new Pair(0,(long)0));
			long cost[]=new long[n];
			cost[1]=Math.abs(arr[1]-arr[0]);
			for(int i=2;i<n;i++)
			{
				cost[i]=Math.min(cost[i-1]+Math.abs(arr[i]-arr[i-1]),cost[i-2]+Math.abs(arr[i]-arr[i-2]));
			}
			System.out.println(cost[n-1]);
		
	}
	
}
class Pair
{
	int a;
	long b;
	
	Pair(int e, long f)
	{
		a=e;
		b=f;
		
	}
}