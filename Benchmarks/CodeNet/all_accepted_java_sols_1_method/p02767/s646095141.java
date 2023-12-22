/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList <Integer> a=new ArrayList<Integer>(n);
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            a.add(x);
        }
        int ans=Integer.MAX_VALUE;
        for(int k=1;k<=100;k++)
        {
            int mans=0;
          for(int i=0;i<n;i++)
        {
            mans+=((a.get(i)-k)*(a.get(i)-k));
        }
            ans = Math.min(ans,mans);
        }
        
        System.out.println(ans);
	}
}
