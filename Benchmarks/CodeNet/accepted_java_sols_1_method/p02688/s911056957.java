/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;

class Main{
	public static void main (String[] args) {
// 		System.out.println("GfG!");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int k=input.nextInt();
		int[] a=new int[n+1];
		for(int i=1;i<=k;i++)
		{
		    int x=input.nextInt();
		    for(int j=1;j<=x;j++)
		    {
		        int y=input.nextInt();
		        a[y]=a[y]+1;
		    }
		}
		int count=0;
		for(int i=1;i<=n;i++)
		 {
		     if(a[i]==0)
		        count++;
		  }
		  System.out.println(count);
		  input.close();
	}
}