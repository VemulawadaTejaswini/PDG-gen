
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
        String s=br.readLine();
        char[] ch=s.toCharArray();
        int r=0;
        int w=0;
        for(int i=0;i<n;i++)
        {
        	if(ch[i]=='R')
        		r++;
        	else
        		w++;
        }
        int ind1=-1;
        for(int i=0;i<n;i++)
        {
        	if(ch[i]=='W')
        	{
        		ind1=i;
        		break;
        	}
        }
        int ind2=-1;
        for(int i=n-1;i>=0;i--)
        {
        	if(ch[i]=='R')
        	{
        		ind2=i;
        		break;
        	}
        }
        if(ind1==-1)
        	System.out.println(0);
        else
        {
        	int ans=0;
        	while(ind1<ind2)
        	{
        		ans++;
        		ind1++;
        		while(ind1<n && ch[ind1]=='R')
        			ind1++;
        		ind2--;
        		while(ind2>=0 && ch[ind2]=='W')
        			ind2--;
        	}
        	System.out.println(Math.min(ans,w));
        }
    }
}
