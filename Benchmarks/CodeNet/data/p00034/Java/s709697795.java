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
		while(sc.hasNext()){
			String val[] = sc.nextLine().split(",");
			int[] l = new int[10];
			
			l[0] = Integer.parseInt(val[0]);
			l[1] = Integer.parseInt(val[1]);
			l[2] = Integer.parseInt(val[2]);
			l[3] = Integer.parseInt(val[3]);
			l[4] = Integer.parseInt(val[4]);
			l[5] = Integer.parseInt(val[5]);
			l[6] = Integer.parseInt(val[6]);
			l[7] = Integer.parseInt(val[7]);
			l[8] = Integer.parseInt(val[8]);
			l[9] = Integer.parseInt(val[9]);
			
			int v1 = Integer.parseInt(val[10]);
			int v2 = Integer.parseInt(val[11]);
			/*
			int[] l = {10,10,10,10,10,10,10,10,10,10};
			double v1 = 50;
			double v2 = 49;
			*/
			int lsum = l[0]+l[1]+l[2]+l[3]+l[4]+l[5]+l[6]+l[7]+l[8]+l[9];
			
			double t = (double)lsum/(v1+v2);
			double ln = (double)t * v1;
			
			int lx = 0;
			
			for(int i=0; i<l.length; i++){
				if(ln<=lx){
					System.out.println(i);
					break;
				}else{
					lx += l[i];
				}
			}
		}
	}
}