
import java.io.*;
import java.util.*;

public class Main{
	static BufferedReader br;
	static int cin() throws Exception
	{
		return Integer.valueOf(br.readLine());
	}
	static int[] split() throws Exception
	{
		String[] cmd=br.readLine().split(" ");
		int[] ans=new int[cmd.length];
		for(int i=0;i<cmd.length;i++)
		{
			ans[i]=Integer.valueOf(cmd[i]);
		}
		return ans;
	}
	static long[] splitL() throws IOException
	{
		String[] cmd=br.readLine().split(" ");
		long[] ans=new long[cmd.length];
		for(int i=0;i<cmd.length;i++)
		{
			ans[i]=Long.valueOf(cmd[i]);
		}
		return ans;
	}
	static long[][][]dp;
	static int[][]val;
	static long solve(int i,int j,int items)
	{
		if(i==val.length || j==val[0].length)
			return 0;
		if(dp[i][j][items]!=-1)
			return dp[i][j][items];
		long res=0;
		res=Math.max(solve(i+1,j,0),solve(i,j+1,items));
		if(val[i][j]!=0)
		{
			res=Math.max(res,(long)val[i][j]+solve(i+1,j,0));
			if(items<3)
				res=Math.max(res, (long)val[i][j]+solve(i,j+1,items+1));
			else
				res=Math.max(solve(i+1,j,0),solve(i,j+1,items));
		}
		dp[i][j][items]=res;
		return res;
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		br=new BufferedReader(new InputStreamReader(System.in));
		int[]ar=split();
		int r=ar[0];
		int c=ar[1];
		int k=ar[2];
		val=new int[r][c];
		for(int i=0;i<k;i++)
		{
			ar=split();
			val[ar[0]-1][ar[1]-1]=ar[2];
		}
		dp=new long[r+1][c+1][4];
		for(int i=0;i<=r;i++)
		{
			for(int j=0;j<=c;j++)
			{
				Arrays.fill(dp[i][j], -1);
			}
		}
		System.out.println(solve(0,0,0));
	}
}
