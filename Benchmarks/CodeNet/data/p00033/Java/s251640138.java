/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	int[] a = new int[10];
		
	Main(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			for(int j=0;j<n;j++) {
				for(int i=0; i<10;i++) {
				a[i] = sc.nextInt();
			}
			System.out.println(solve());
		}
	}

	String solve() {
		int flag = 1;
		int b=0,c=0;
		for(int i=0;i<10;i++) {
			if(a[i]>b)b=a[i];
			else if(a[i]>c)c = a[i];
			else flag = 0;
		}
		
		if(flag==1)return "YES";
		else return "NO";
	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		new Main();
	}
}
