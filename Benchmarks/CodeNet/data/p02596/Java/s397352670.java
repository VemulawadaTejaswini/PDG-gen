
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class Pair implements Comparable<Pair>
{
	int n;
	int dis;
	public Pair(int x,int d)
	{
		this.n=x;
		this.dis=d;
	}
	public int compareTo(Pair p)
	{
		if(this.dis>p.dis)
			return 1;
		else if(this.dis<p.dis)
			return -1;
		return 0;
	}
}
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
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        int n=cin();
        int st=7;
        int ans=1;
        int[]check=new int[1000001];
        int bool=0;
        while(true)
        {
        	int mod=st%n;
        	if(mod==0)
        		break;
        	if(check[mod]==1)
        	{
        		bool=1;
        		break;
        	}
        	check[mod]=1;
        	st=mod*10+7;
        	ans++;
        }
        if(bool==1)
        	System.out.println(-1);
        else
        System.out.println(ans);
    }
}
