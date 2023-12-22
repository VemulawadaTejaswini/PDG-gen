/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int k=s.nextInt();
		if(k>n)
		System.out.println(0);
		else{
		int a[]=new int[n];
	long sum=0;
		for(int i=0;i<n;i++)
		{a[i]=s.nextInt();
		//sum+=a[i];
		    
		}
		Arrays.sort(a);
		for(int i=0;i<n-k;i++)
		sum+=a[i];
		
		
		
		System.out.println(sum);
		}
	}
}