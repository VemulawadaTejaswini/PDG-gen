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
		long res=0;
		for(int i=0;i<n;i++)
		{
			nums[i]=scan.nextInt();
			if(i==0)
				res=nums[i];
			else
				res=res^nums[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.print((nums[i]^res)+" ");
		}
		System.out.println();
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