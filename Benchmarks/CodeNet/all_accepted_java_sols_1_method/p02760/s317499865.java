/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
		int[][] a = new int[3][3];
		int[][] vis = new int[3][3];
		for(int i=0;i<3;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        a[i][j] =sc.nextInt();
		        vis[i][j] = 0;
		    }
		}
		int n=sc.nextInt();
		for(int k=0;k<n;k++)
		{
		    int x=sc.nextInt();
		    for(int i=0;i<3;i++)
		    {
		        for(int j=0;j<3;j++)
		        {
		            if(a[i][j] == x)
		            {
		                vis[i][j] = 1;
		            }
		        }
		    }
		}
		int flag=0;
		for(int i=0;i<3;i++)
		{
		if(vis[i][0] == 1 && vis[i][1] == 1 && vis[i][2] == 1)
		{
		    flag=1;
		}
		}
		for(int i=0;i<3;i++)
		{
		if(vis[0][i] == 1 && vis[1][i] == 1 && vis[2][i] == 1)
		{
		    flag=1;
		}
		}
		if(vis[0][0] == 1 && vis[1][1] == 1 && vis[2][2] == 1)
		{
		    flag=1;
		}
		if(vis[0][2] == 1 && vis[1][1] == 1 && vis[2][0] == 1)
		{
		    flag=1;
		}
		if(flag == 1)
		{
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}
	}
}
