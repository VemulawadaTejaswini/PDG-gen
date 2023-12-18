
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
        int ans=1000;
        int x=arr[0];
        int s=1000/arr[0];
        int amount=1000%arr[0];
        for(int i=1;i<n;i++)
        {
        	if(arr[i]<x)
        	{
        		s+=(amount)/arr[i];
        		amount=amount%arr[i];
        	}
        	else if(arr[i]>x)
        	{
        		amount=amount+arr[i]*s;
        		s=0;
        		x=arr[i];
        	}
//        	System.out.println(arr[i]+" "+s+" "+amount);
        	ans=Math.max(ans, amount);
        }
        System.out.println(ans);
    }
}
