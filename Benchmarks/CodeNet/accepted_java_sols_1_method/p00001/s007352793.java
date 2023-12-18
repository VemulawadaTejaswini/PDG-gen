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
		
		Scanner sc = new Scanner(System.in);
		
		//int arr[] = {10,20,5,1,0,100,12,9,20,-100};
		int arr[] = new int[10];
		int i = 0;
		while( sc.hasNext() ){
    		String line[] = sc.nextLine().split(" ");
			arr[i] = Integer.parseInt(line[0]);
			i++;
		}
		
		Arrays.sort(arr);
    	
    	System.out.println(arr[9]);
    	System.out.println(arr[8]);
    	System.out.println(arr[7]);
	}
}