
import java.io.*;
import java.util.*;

public class Main {
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
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder s=new StringBuilder(br.readLine());
		int n=s.length();
		int mod=0;
		for(int i=0;i<n;i++)
		{
			int x=s.charAt(i)-'0';
			mod=(mod+x)%9;
		}
		if(mod==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
