import java.io.*;
import java.util.*;

public class Main
{
	//static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(tk.nextToken());
		int[] nums = new int[n];
		tk = new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++)
		{
			nums[i]=Integer.parseInt(tk.nextToken());
		}
		tk = new StringTokenizer(in.readLine());
		int q = Integer.parseInt(tk.nextToken());
		while(q-->0)
		{
			tk = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(tk.nextToken());
			int b = Integer.parseInt(tk.nextToken());
			long sum =0;
			for(int i=0;i<n;i++)
			{
				if(nums[i]==a)
					nums[i]=b;
				sum+=nums[i];
			}
			System.out.println(sum);
		}
	}
	/*
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
	*/
}