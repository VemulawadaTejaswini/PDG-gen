/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    
	    long []  arr = new long[n];
	    for(int i = 0; i < n; i++){
	    	arr[i] = scanner.nextLong();
	    }
	    
	    long res = 0;
	    for(int i = 1; i < n ; i++){
	    	if(arr[i] < arr[i-1]){
	    		res += arr[i-1] - arr[i];
	    		arr[i] += arr[i-1] - arr[i]; 
	    	}
	    }
	    
	    System.out.println(res);
	}
}