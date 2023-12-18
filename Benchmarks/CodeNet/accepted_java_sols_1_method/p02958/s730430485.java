/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextInt();
		    b[i] = a[i];
		}
		Arrays.sort(b);
		int count = 0;
		for(int i = 0; i < n; i++){
		    if(a[i] != b[i]){
		        count++;
		    }
		    //System.out.println(a[i] + " " + b[i]);
		}
		if(count <= 2){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	}
}
