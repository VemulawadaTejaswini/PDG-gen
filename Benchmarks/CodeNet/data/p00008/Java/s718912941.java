/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		//int ans = 35;
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       	for(int i=0; i<n; i++) {
	        int ans = sc.nextInt();
			
			int a,b,c,d;
			int sum = 0;
			int count = 0;
			
			for (a=0; a<10; a++){
				for (b=0; b<10; b++){
					for(c=0; c<10; c++){
						for(d=0; d<10; d++){
							sum = a + b + c + d;
							
							if (sum == ans){
								count ++;
							}
						}
					}
				}
			}
			
			System.out.println(count);
       	}
	}
}