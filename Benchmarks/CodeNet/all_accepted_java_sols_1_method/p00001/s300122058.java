/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner in = new Scanner(System.in);
		int x[]=new int[10];
		for(int i=0;i<10;i++){
			x[i]=in.nextInt();
		}
		for(int j=0;j<3;j++){
			
			int max=0;
			int k=0;
			for(int i=0;i<10;i++)
			{
				if(x[i]>max){
					k=i;
					max=x[i];
				}
				
			}
			System.out.println(x[k]);
			x[k]=0;
			
		}
	}
}