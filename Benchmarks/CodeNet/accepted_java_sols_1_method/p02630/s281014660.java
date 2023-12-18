import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		//int n = Integer.parseInt(st.nextToken());
		//int k = Integer.parseInt(st.nextToken());
		HashMap<Long,Long> map = new HashMap<>();
		long arr[] = new long[n];
		long one = 1;
		//st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++)
		{
				long x = Long.parseLong(st.nextToken());
				if(!map.containsKey(x))
					map.put(x,one);
				else
					map.put(x,map.get(x)+1);
				arr[i]=x;
		}
//		Arrays.sort(arr);
		long sum=0;
		for(int i=0;i<n;i++)
			sum += arr[i];
		//System.out.println(sum);
		int q = Integer.parseInt(br.readLine());
		while(q-->0)
		{
			st = new StringTokenizer(br.readLine());
			long b = Integer.parseInt(st.nextToken());
			long c = Integer.parseInt(st.nextToken());
			if(map.containsKey(b)){
			long f1 = map.get(b);
			sum -= b*f1;
			sum += c*f1;
			map.remove(b);
			if(!map.containsKey(c))
			map.put(c,f1);
			else
				map.put(c,map.get(c)+f1);}
			System.out.println(sum);
		}
	}
}