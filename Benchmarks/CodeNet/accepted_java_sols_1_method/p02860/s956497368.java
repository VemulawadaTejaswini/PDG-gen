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
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tc=1;
		t:
		while(tc-->0){
			int n=Integer.parseInt(br.readLine());
			String s=br.readLine();
			if(n%2==1){
				System.out.println("No");
				continue t;
			}
			int p1=0;
			int p2=n>>1;
			for(;p1<(n>>1) && p2 < n;p1++,p2++){
				if(s.charAt(p1)!=s.charAt(p2)){
					System.out.println("No");
					continue t;
				}
			}
			System.out.println("Yes");
		}
	}
}