/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
		    String[] line = br.readLine().split(" ");
		    A.add(Integer.parseInt(line[0]));
		    B.add(Integer.parseInt(line[1]));
		}
		
		long ans = 0;
		for(int i=n-1;i>=0;i--){
		    long a = A.get(i);
		    long b = B.get(i);
		    if((a+ans)%b!=0)
    		    ans += b-(a+ans)%b;
		}
		System.out.println(ans);
	}
}