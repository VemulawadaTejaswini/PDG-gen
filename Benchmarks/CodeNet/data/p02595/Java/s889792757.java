
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
        int[] ar=split();
        int n=ar[0];
        int d=ar[1];
        int ans=0;
        for(int i=0;i<n;i++)
        {
        	String[] cmd=br.readLine().split(" ");
        	long x=Long.valueOf(cmd[0]);
        	long y=Long.valueOf(cmd[1]);
        	long z=x*x+y*y;
        	double f=Math.sqrt(z);
        	if(f<=d)
        		ans++;
        }
        System.out.println(ans);
    }
}
