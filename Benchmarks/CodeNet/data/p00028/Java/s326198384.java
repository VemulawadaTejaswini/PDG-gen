import java.io.*;
import java.math.*;
import java.util.*;

class Main
{
	private static void logging(int x) {System.out.println(x);}

	public static void main(String[] args)throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String line;
		int keep,mx=0;
		int count[]=new int[1000];
		int ans[]=new int[1000];

		while((line=input.readLine())!=null)
		{
			keep=Integer.parseInt(line);
			count[keep]++;
			mx=Math.max(mx,keep);
		}

		int count_mx=0; 
		for(int i=0;i<=mx;i++)count_mx=Math.max(count[i],count_mx);

		int count_ans=0;
		for(int i=1;i<=mx;i++)
		{
			if(count_mx==count[i])
				ans[count_ans++]=i;
		}
		for(int i=0;i<count_ans;i++)logging(ans[i]);
	}
}