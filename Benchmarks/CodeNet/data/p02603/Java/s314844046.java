
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main{
	static BufferedReader br;
	static int in() throws Exception
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
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=in();
        int[] arr=split();
        long ans=1000;
        long x=arr[0];
        long s=0;
        long amount=1000;
        int i=1;
        while(i<n)
        {
        	while(i<n && arr[i]<x)
        	{
        		x=(long)arr[i];
        		i++;
        	}
        	s=amount/x;
        	amount=amount%x;
        	while(i<n && arr[i]>=x)
        	{
        		x=(long)arr[i];
        		i++;
        	}
        	amount=amount+s*x;
        	s=0;
        	ans=Math.max(ans, amount);
        }
        System.out.println(ans);
    }
}
