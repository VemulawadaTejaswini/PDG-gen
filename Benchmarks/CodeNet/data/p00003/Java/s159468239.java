/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		
		int arr[];
		double ans[];
		while( sc.hasNext() ){
			arr = new int[3];
			ans = new double[3];
			
    		String line[] = sc.nextLine().split(" ");
			arr[0] = Integer.parseInt(line[0]);
			arr[1] = Integer.parseInt(line[1]);
			arr[2] = Integer.parseInt(line[2]);
			
			//int arr[] = {3,4,5};
		
			Arrays.sort(arr);
			
			int i;
			for (i = 0;i < 3; i++){
				ans[i] = arr[i]*arr[i];
			}
			
			if (ans[0]+ans[1] == ans[2]){
	    		System.out.println("yes");
			}else{
	    		System.out.println("no");
			}
    	}
		
	}
}