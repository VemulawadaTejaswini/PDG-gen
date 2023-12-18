import java.io.*;
import java.math.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int ans = 0;
		char[] all = new char[n];
		for (int i=0; i<n-1; i++)
		{
		    all[i] = s.charAt(i); 
		    if (s.charAt(i)=='W' && s.charAt(i+1)=='R')
		    ans++;
		}
		if (ans==0)
		System.out.println(ans);
		else{
		int count = 0;
		for (int i=0; i<n-1; i++)
		{
		    if (all[i]=='W')
		    {
		        for (int j=i+1; j<n; j++)
		        {
		            if (all[j]=='R')
		            {
		                char temp = all[j];
		                all[j] = all[i];
		                all[i] = temp;
		                count++;
		            }
		        }
		    }
		}
		ans = Math.min(ans,count);
		System.out.println(ans);}
	}
}
