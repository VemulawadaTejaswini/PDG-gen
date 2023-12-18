/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//int a[] = {4,6,8,2};
		//int b[] = {4,6,3,2};
		
		Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int[] a = new int[4];
        	int[] b = new int[4];
        	
	        a[0] = sc.nextInt();
	        a[1] = sc.nextInt();
	        a[2] = sc.nextInt();
	        a[3] = sc.nextInt();
	        b[0] = sc.nextInt();
	        b[1] = sc.nextInt();
	        b[2] = sc.nextInt();
	        b[3] = sc.nextInt();
			
			int Hit = 0;
			int Brow = 0;
			
			for (int i=0; i<4; i++){
				if (a[i] == b[i]){
					Hit += 1;
				}
				for(int j=0; j<4; j++){
					if(a[i] == b[j] && i != j){
						Brow +=1;
					}
				}
			}
			
			System.out.println(Hit + " " + Brow);
        }	
	}
}