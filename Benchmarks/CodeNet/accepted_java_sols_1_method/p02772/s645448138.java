/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int[] arr = new int[n];
		for(int i =0 ;i<n;i++){
			arr[i] = scan.nextInt();
		}
		int flag = 0;
		for(int j : arr){
			if((j%2)==0 && ((j%3)!=0) &&((j%5)!=0)){
				flag = 1;
				break;
			}
		}
		String ans = (flag==1)?"DENIED":"APPROVED";
		System.out.println(ans);
		// your code goes here
	}
}